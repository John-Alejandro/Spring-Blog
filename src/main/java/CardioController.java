import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class CardioController {
    private final CardioRepository cardioDao;

    public CardioController(CardioRepository cardioRepository) {
        this.cardioDao = cardioDao;
    }

    @Mapping("/cardioequipment")
    public String cardioIndex(Model, model) {
        model.addAttribute("cardio", cardioDao.findAll());
        return "cardio";
    }
}
