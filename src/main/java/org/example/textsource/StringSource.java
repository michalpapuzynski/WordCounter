package org.example.textsource;

//klasa dostarczająca zawsze ten sam tekst
public class StringSource implements TextSource {
    //TODO dodaj odpowiednie pola i konstruktory, może warto użyć biblioteki Lombok ?

    private String stringText;

    public StringSource(String stringText) {
        this.stringText = stringText;
    }

    public String getStringText() {
        return stringText;
    }

    public void setStringText(String stringText) {
        this.stringText = stringText;
    }

    @Override
    public String getText() {
        return stringText;
    }
}

