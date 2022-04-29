package org.example;

import org.example.wordcounter.WordCounter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main
{
    public static void main( String[] args ) throws IOException {
        System.out.println(readFile());
    }

    public static String readFile() throws IOException {
        File file = new File("data.txt");
        return Files.readString(Path.of("file.txt"), StandardCharsets.UTF_8);
    }
}
