package com.szymon.textencoderspringboot.service;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class EncodeService {


    private FileReader fileReader = new FileReader();

    public String textEncode(String text) throws FileNotFoundException {

        char[] chars = text.toUpperCase().toCharArray();

        for (int i = 0; i <chars.length ; i++) {

            for (String rule : fileReader.getRuleList()) {
                if (chars[i] == rule.charAt(0)) {
                    chars[i] = rule.charAt(2);
                    break;
                }
            }
        }

        return String.valueOf(chars);
    }


}
