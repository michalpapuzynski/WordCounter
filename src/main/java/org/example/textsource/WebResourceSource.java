package org.example.textsource;

public class WebResourceSource implements TextSource {
    private final String url = "aasdasd"; //zainicjalizuj to jakoś

    @Override
    public String getText() {
        throw null; //dodaj pobieranie z adresu url np. https://loremipsum.de/downloads/version1.txt
//TODO opcja – może warto dodać cache ?
    }
}

