package com.szymon.textencoderspringboot.controller;

import com.szymon.textencoderspringboot.service.EncodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;

@Controller
public class    EncodeController {

    private EncodeService encodeService;

    @Autowired
    public EncodeController(EncodeService encodeService) {
        this.encodeService = encodeService;
    }

    @PostMapping("/encode")
    public String postEncode(@RequestParam (name = "text") String text, Model model) throws FileNotFoundException {
        model.addAttribute("text", encodeService.textEncode(text));

        return "text";
    }
}
