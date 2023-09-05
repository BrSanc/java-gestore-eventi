package org.eventi;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento{
    private LocalTime ora;
    private BigDecimal prezzo;

    public Concerto(String titolo, String data, int postiTotali, String ora, int prezzo) {
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

}
