package com.softserve.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

    public String readFile(String filename) {
        StringBuilder allText = new StringBuilder("");
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                allText.append(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("No such file!");
            e.printStackTrace();
        }
        return allText.toString();
    }

    public String cleanJson(String input){
        return input.replaceAll("\\s+","");
    }
}
