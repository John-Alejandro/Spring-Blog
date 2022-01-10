package com.codeup.springblog.controllers;

import com.codeup.springblog.Repositories.PostRepository;
import com.codeup.springblog.Repositories.UserRepository;
import com.codeup.springblog.Services.EmailService;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;
    private final EmailService emailService;


    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailService) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @GetMapping("/posts")
    public String indexPosts(Model model) {
        model.addAttribute("allPosts", postDao.findAll());
        return"posts/index";
    }

    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable int id) {
        return "posts/show";
    }

    @GetMapping("/posts/edit/{id}")
    public String editPost(@PathVariable long id, Model model) {
        Post editPost = postDao.getById(id);

        model.addAttribute("postToEdit", editPost);
        return "posts/edit";
    }

    @PostMapping("/posts/edit")
    public String savedEditPost(@RequestParam(name="postTitle") String postTitle, @RequestParam(name="postBody") String postBody, @RequestParam(name="postId") long id)
        {

            Post postToEdit = postDao.getById(id);

            postToEdit.setBody(postBody);
            postToEdit.setTitle(postTitle);

            postDao.save(postToEdit);

            return "redirect:/posts";
        }

        @PostMapping("/posts/delete/{id}")
        public String deletePost(@PathVariable long id) {
            long deletePostId = id;
            postDao.deleteById(deletePostId);

            return "redirect:/posts";
        }

        @GetMapping("/posts/create")
        public String viewCreatePost(Model model) {
            model.addAttribute("post", new Post());
            return"posts/create";
        }

        @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){

        User postCreator = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

            post.setUser(postCreator);

            String emailSubject = post.getUser().getUsername() + ", your post has been created!";

            String emailBody = "Congratulations - your latest blog post is up and ready to view on your blogging website. Your post read: " + post.getBody();

            emailService.prepareAndSend(post, emailSubject, emailBody);
            postDao.save(post);

            return "redirect/posts";
        }

//        @GetMapping("/posts/create")
//        public String viewCreatePost(Model model) {
//            model.addAttribute("post", new Post());
//            return"posts/create";
//        }
//        @PostMapping("/posts/create")
//        public String createPost(@ModelAttribute Post post){
//
//            post.setUser(userDao.getById(1L));
//            emailService.prepareAndSend(post, "Your post has been created",  "Congrats = your in.");
//            postDao.save(post);
//            return "redirect:/posts";}
}

