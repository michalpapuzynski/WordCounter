package org.example.textsource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSource implements TextSource {
    private final String fileName = "file.txt"; // zainicjalizuj to jakoś

    public FileSource() {
    }

    @Override
    public String getText() {
        try {
            return Files.readString(Path.of(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
