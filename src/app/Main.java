package app;

import java.nio.file.Paths;

public class Main {

    private static final String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String newFileName = "myfile";
        String content = "SuperPUPER information.";
        String path = BASE_PATH + newFileName + ".txt";
        try {
            java.nio.file.Files.createDirectories(Paths.get(BASE_PATH));
        } catch (Exception ignored) {}

        getOutput(handler.createFile(path));
        getOutput(handler.writeToFile(Paths.get(path), content));
        getOutput("CONTENT: " + handler.readFromFile(path));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}