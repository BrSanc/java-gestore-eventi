package org.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento{
    private LocalTime ora;
    private BigDecimal prezzo;

    public Concerto(String titolo, String data, int postiTotali, String ora, double prezzo) {
        super(titolo, data, postiTotali);
        this.ora = LocalTime.parse(ora);
        this.prezzo = BigDecimal.valueOf(prezzo);
    }

    //getter------------------

    public LocalTime getOra() {
        return ora;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }


    //Setter------------------------


    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    //Metodi--------------------
    public String dateAndTime(){
        String s = getData().toString() + " " + getOra().toString();
        return s;
    }


    public String formatPrice(){
        DecimalFormat df = new DecimalFormat("#,##0.00€");
        return df.format(prezzo);
    }

    @Override
    public String toString() {
        return dateAndTime() + " | " + super.getTitolo() + " | " + formatPrice();
    }
}
