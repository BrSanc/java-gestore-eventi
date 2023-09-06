package org.eventi;

public class Maintest {
    public static void main(String[] args) {
        Concerto concerto = new Concerto("Opera","2024-09-02",1000,"14:09",91.9786);

        System.out.println(concerto.dateAndTime());
        System.out.println(concerto.formatPrice());
        System.out.println(concerto.getPrezzo());
        System.out.println(concerto.toString());

        ProgrammEventi pe = new ProgrammEventi("Concerto");

        System.out.println();
        pe.addEvento(concerto);
        pe.getEventList();
        pe.countEventList();
        pe.resetList();
        pe.getEventList();

    }
}
