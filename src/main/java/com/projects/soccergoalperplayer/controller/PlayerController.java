package com.projects.soccergoalperplayer.controller;

import com.projects.soccergoalperplayer.entity.Player;
import com.projects.soccergoalperplayer.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlayerController {
    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        super();
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public String getListOfPlayers(Model model) {
        model.addAttribute("players", playerService.getAllPlayers());
        return "players";
    }

    @GetMapping("/players/new")
    public String createStudentForm(Model model) {
        Player player = new Player();
        model.addAttribute("player",player);
        return "create_player";
    }

    @PostMapping("/players")
    public String saveStudent(@ModelAttribute("player") Player player) {
        playerService.savePlayer(player);
        return "redirect:/players";
    }

    @GetMapping("/players/{id}")
    public String deleteStudent(@PathVariable Long id) {
        playerService.deletePlayerByID(id);
        return "redirect:/players";
    }

}
