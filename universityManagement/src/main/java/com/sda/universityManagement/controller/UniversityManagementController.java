package com.sda.universityManagement.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/management")
public class UniversityManagementController {
    private List<String> strings = new ArrayList<>();
    @Value("${marius.oop}")
    private String mariusPropriety;

    @GetMapping("/message")
    public String getUniversityManagementTest() {
        return "Test message";
    }

    @GetMapping("/customMessage/{message}")
    public String getCustomMessage(@PathVariable String message) {
        return message + "concatenated";
    }

    @GetMapping("/listElements")
    public List<String> getListElements() {
        return strings;
    }

    @PostMapping("/{str}")
    public void addListElement(@PathVariable String str) {
        this.strings.add(str);
    }

    @GetMapping("/prop")
    public String getCustomProp() {
        return mariusPropriety;
    }

}
