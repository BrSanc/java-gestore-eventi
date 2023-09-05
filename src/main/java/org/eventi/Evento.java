package org.eventi;

import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;

    public Evento(String titolo, LocalDate data, int postiTotali, int postiPrenotati) {
        this.titolo = titolo;
        isValidDate();
        this.data = data;
        if (postiTotali <= 0){
            throw new RuntimeException("il numero di posti deve essere positivo e sopra dello 0");
        }
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;
    }

    //getter---------------------


    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    //Setter---------------------------


    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Metodi---------------------------------

    public void prenota(int numeriPosti) {
        noPosti();
        isValidDate();
        postiPrenotati += numeriPosti;
    }

    public void disdici(int numeriPosti){
        noPosti();
        isValidDate();
        postiPrenotati -= numeriPosti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titolo='" + titolo + '\'' +
                ", data=" + data +
                '}';
    }

    //private Metodi----------------------------------
    private void isValidDate(){
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("data gia passata");
        }
    }

    private void noPosti(){
        if (postiPrenotati > postiTotali){
            throw new RuntimeException("Non ci sono suficienti posti disponibili");
        }
    }
}
