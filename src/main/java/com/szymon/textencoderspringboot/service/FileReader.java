package com.szymon.textencoderspringboot.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class FileReader {

    private File file = new File("src/main/resources/rules");

    private Scanner rulesFileScanner() throws FileNotFoundException {
        return new Scanner(file);
    }

    List<String> getRuleList() throws FileNotFoundException {
        List<String> ruleList = new ArrayList<>();
        Scanner scanner = rulesFileScanner();
        while (scanner.hasNextLine()) {
            ruleList.add(scanner.nextLine());
        }

        return ruleList;
    }

}
