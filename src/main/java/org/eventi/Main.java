package org.eventi;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean exit = false;
        Evento evento = null;
            try {
                System.out.println("Inizializza l'evento");
                System.out.print("Titolo: ");
                String titolo = scan.nextLine();
                System.out.print("Data (yyyy-mm-dd): ");
                String data = scan.nextLine();
                System.out.print("Posti Totali: ");
                int postiTotali = Integer.parseInt(scan.nextLine());

                evento = new Evento(titolo, data, postiTotali);
            } catch (IllegalArgumentException ex) {
                System.out.println("Unable to create event: " + ex.getMessage());
            } catch (DateTimeParseException de) {
                System.out.println("Invalid date format");
            //} catch (NumberFormatException ne){
            //        System.out.println("Invalid Number");
            } catch (Exception exception) {
                System.out.println("Generic error");
            }



        //Evento evento = new Evento("Opera","2024-09-02",100);

        boolean exitSwitch = false;
        while (!exitSwitch){
            System.out.println("1.Prenota | 2.Disdici | 3.Exit ");
            String choice = scan.nextLine();
            switch (choice){


                //Case 1.----------------------------
                case "1":
                    System.out.println("Posti da prenotare: ");
                    int numeriPostiPrenotare = Integer.parseInt(scan.nextLine());
                        try {
                            evento.prenota(numeriPostiPrenotare);
                        }catch (NumberFormatException ne){
                            System.out.println("Invalid Number");
                        } catch (RuntimeException e) {
                            System.out.println("Non ci sono " + numeriPostiPrenotare + " posti disponibili da prenotare");
                        }
                    System.out.println("posti prenotati: " + evento.getPostiPrenotati());
                    break;

                    //Case 2.----------------------------
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

                //Case 3-----------------------------------
                case "3":
                    exitSwitch = true;
                    System.out.println("Uscendo dal programma!");
                    break;

                    //Default-----------------------------------
                default:
                    System.out.println("Scelta invalida");
                    break;
            }
        }


        System.out.println();
        System.out.println(evento.toString());
        System.out.println("Posti Totali: "+evento.getPostiTotali());
        System.out.println("Posti Prenotati: " +evento.getPostiPrenotati());






    }
}
