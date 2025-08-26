package com.example.backend.controller;

import com.example.backend.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public String testPage(Model model) {
        String message = testService.getMessageFromDb();
        model.addAttribute("dbMessage", message);
        return "test";
    }
}

