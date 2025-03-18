package com.springframework.springjokesapp.controller;

import com.springframework.springjokesapp.services.JokeService;
import com.springframework.springjokesapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private final JokeService jokeService = new JokeServiceImpl();

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "joke";  // Thymeleaf template name
    }
}
