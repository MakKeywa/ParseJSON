package com.softserve.edu;

import com.google.gson.Gson;
import com.softserve.edu.lib.Company;

public class Main {

    private static final Utils utils = new Utils();
    private static final String FILE_PATH = "src/main/resources/settings.json";

    public static void main(String[] args){
        String inputJson = utils.readFile(FILE_PATH);
        inputJson = utils.cleanJson(inputJson);
        Company parsedObject = new Gson().fromJson(inputJson, Company.class);
        System.out.println(parsedObject);
    }
}
