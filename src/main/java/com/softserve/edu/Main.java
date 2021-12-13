package com.softserve.edu;

public class Main {

    private static final Utils utils = new Utils();
    private static final String FILE_PATH = "src/main/resources/settings.json";

    public static void main(String[] args){
        String inputJson = utils.readFile(FILE_PATH);
        inputJson = utils.cleanJson(inputJson);
        System.out.println(inputJson);
    }
}
