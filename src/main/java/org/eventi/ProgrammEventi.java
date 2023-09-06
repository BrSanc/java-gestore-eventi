package org.eventi;

import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {
    private String titolo;
    private List<Evento> eventi;

    //Costruttore---------------------


    public ProgrammEventi(String titolo) {
        this.titolo = titolo;
        this.eventi = new ArrayList<>();
    }

    //Metodi---------------------------

    public void addEvento(Evento evento){
        eventi.add(evento);
    }

    public void getEventList(){
        for (Evento i :
             eventi) {

            System.out.println(i);
        }
    }

    public void countEventList(){
        int count = 0;
        for (Evento i :
                eventi) {
            count+= 1;
        }
        System.out.println("Eventi nella lista: "+ count);
    }

    public void resetList(){
        eventi.clear();
    }

}
