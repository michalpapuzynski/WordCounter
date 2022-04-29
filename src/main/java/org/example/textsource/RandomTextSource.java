package org.example.textsource;

import java.util.Random;

//klasa dostarczająca losowy tekst
public class RandomTextSource implements TextSource {
    //może warto mieć tu jakieś pole typu Random ? Jeśli tak to jak wstrzyknąć tą zależność ?

    private static final int LEFT_LIMIT = 97; // letter 'a'
    private static final int RIGHT_LIMIT = 122; // letter 'z'

    private static final String WHITE_SPACE = " ";


    private int wordCount = 10;
    private final Random random = new Random();

    public RandomTextSource(int wordCount) {
        this.wordCount = wordCount;
    }

    private String generateRandomString(int wordCount) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < wordCount; i++) {
            String generatedString = random.ints(LEFT_LIMIT, RIGHT_LIMIT + 1)
                    .limit(random.nextInt(5) + 2)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            stringBuilder.append(generatedString);
            if (i != wordCount - 1) {
                stringBuilder.append(WHITE_SPACE);
            }
        }

        return stringBuilder.toString();

    }

    @Override
    public String getText() {
        return generateRandomString(wordCount);
    }
}

