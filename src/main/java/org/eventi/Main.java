package org.eventi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Inizializza l'evento");
        System.out.print("Titolo: ");
        String titolo = scan.nextLine();
        System.out.print("Data (yyyy-mm-dd): ");
        String data = scan.nextLine();
        System.out.print("Posti Totali: ");
        int postiTotali = Integer.parseInt(scan.nextLine());

        Evento evento = new Evento(titolo,data,postiTotali);
         */

        Evento evento = new Evento("Opera","2024-09-02",100);

        boolean exit = false;
        while (!exit){
            System.out.println("1.Prenota | 2.Disdici | 3.Exit ");
            String choice = scan.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Posti da prenotare: ");
                    int numeriPostiPrenotare = Integer.parseInt(scan.nextLine());
                        try {
                            evento.prenota(numeriPostiPrenotare);
                        } catch (RuntimeException e) {
                            System.out.println("Non ci sono "+ numeriPostiPrenotare+ " posti disponibili da prenotare");
                        }
                    System.out.println("posti prenotati: " + evento.getPostiPrenotati());
                    break;
                case "2":
                    System.out.println("Posti da Disdire: ");
                    int numeriPostiDisdire = Integer.parseInt(scan.nextLine());
                        try {
                            evento.disdici(numeriPostiDisdire);
                        } catch (RuntimeException e) {
                            System.out.println("Non ci sono " + numeriPostiDisdire + " posti da disdire");
                        }
                    System.out.println("Posti prenotati: "+ evento.getPostiPrenotati());
                    break;
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("Scelta invalida");
                    break;
            }
        }



        System.out.println(evento.toString());
        System.out.println(evento.getPostiTotali());
        System.out.println(evento.getPostiPrenotati());






    }
}
