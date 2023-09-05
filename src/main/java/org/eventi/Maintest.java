package org.eventi;

public class Maintest {
    public static void main(String[] args) {
        Concerto concerto = new Concerto("Opera","2024-09-02",1000,"14:09",90);

        System.out.println(concerto.getOra());
    }
}
