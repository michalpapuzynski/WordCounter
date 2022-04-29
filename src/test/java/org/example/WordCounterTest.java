package org.example;

import org.example.textsource.FileSource;
import org.example.textsource.RandomTextSource;
import org.example.textsource.StringSource;
import org.example.textsource.TextSource;
import org.example.wordcounter.SimpleWordCounter;
import org.example.wordcounter.WordCounter;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WordCounterTest {

    private TextSource textSource;
    private WordCounter wordCounter;

    @Test
    public void simpleWordCounterStringSourceTest() {
        //given
        textSource = new StringSource("Ala ma kota");
        wordCounter = new SimpleWordCounter(textSource);
        //when
        int expectedWordCount = 3;
        //then
        Assertions.assertEquals(expectedWordCount, wordCounter.countWords());
    }

    @Test
    public void simpleWordCounterRandomSourceTest() {
        //given
        textSource = new RandomTextSource(5);
        wordCounter = new SimpleWordCounter(textSource);
        //when
        int expectedWordCount = 5;
        //then
        Assertions.assertEquals(expectedWordCount, wordCounter.countWords());
    }

    @Test
    public void simpleWordCounterFileSourceTest() {
        //given
        textSource = new FileSource();
        wordCounter = new SimpleWordCounter(textSource);
        //when
        int expectedWordCount = 3;
        //then
        Assertions.assertEquals(expectedWordCount, wordCounter.countWords());
    }

}