package org.example.wordcounter;

import org.example.textsource.TextSource;

public class SimpleWordCounter implements WordCounter {
    private final TextSource source;

    public static final String WORD_SPLIT_REGEX = "\\W+";

    public SimpleWordCounter(TextSource source) {
        this.source = source; //TODO: jak inaczej można wstrzyknąć tą zależność ?
    }

    @Override
    public Integer countWords() {
        String text = source.getText();
        try {
            if (text.isEmpty()) {
                return 0;
            } else {
                return text.split(WORD_SPLIT_REGEX).length;
            }
        } catch (NullPointerException e) {
            return 0;
        }
    }
}

