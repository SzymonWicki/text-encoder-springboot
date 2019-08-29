package com.szymon.textencoderspringboot.controller;

import com.szymon.textencoderspringboot.service.DecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;

@Controller
public class DecodeController {

    private DecodeService decodeService;

    @Autowired
    public DecodeController(DecodeService decodeService) {
        this.decodeService = decodeService;
    }

    @PostMapping("/decode")
    public String postEncode(@RequestParam (name = "text") String text, Model model) throws FileNotFoundException {
        model.addAttribute("text", decodeService.textDecode(text));

        return "text";
    }
}
