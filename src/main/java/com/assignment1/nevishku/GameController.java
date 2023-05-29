package com.assignment1.nevishku;

import com.assignment1.nevishku.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    private Game game;

    public GameController() {
        game = new Game();
    }

    @GetMapping("/")
    public String play() {
        return "play";
    }

    @PostMapping("/result")
    public String result(@RequestParam("box") int boxIndex, Model model) {
        Prize chosenPrize = game.openBox(boxIndex);
        model.addAttribute("chosenPrize", chosenPrize);
        model.addAttribute("boxes", game.getBoxes());
        return "result";
    }
}
