package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Parser {
    ArrayList<String> parse (File file) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader( new FileReader(file));
            String line;
            while ((line= br.readLine())!= null) {
                String [] words = line.split(" ");
                for (String s : words) {
                    lines.add(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
