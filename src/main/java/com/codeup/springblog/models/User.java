package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String password;

    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

    public User(){}

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    //    @ManyToMany
//    @JoinTable(name="articles_user",
//    joinColumns = {@JoinColumn(name="user_id")},
//    inverseJoinColumns = {@JoinColumn(name="post_id")})
//    private List<Post> userPosts;


    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<Post> getUserPosts() { return userPosts; }
//
//    public void setUserPosts(List<Post> userPosts) { this.userPosts = userPosts; }


//    public User(long id, String username, String email, String password, List<Post> posts) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.posts = posts;
//    }
}
