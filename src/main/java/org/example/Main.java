package org.example;

public class Main {
    public static void main(String[] args) {

        Contatto pers1=new Contatto("Gianni", "Rossi", 334);
        Contatto pers2=new Contatto("Filippo", "Bianchi", 335);
        Contatto pers3=new Contatto("Carlo", "Gialli", 334);
        Contatto pers4=new Contatto("Lucia", "DeLaCruz", 335);
        Contatto pers5=new Contatto("Federica", "Rodriguez", 334);
        Contatto pers6=new Contatto("Valeria", "DeLaVega", 335);
        Rubrica sim=new Rubrica();
        sim.aggiungiContatto(pers1);
        sim.aggiungiContatto(pers2);
        sim.aggiungiContatto(pers3);
        sim.aggiungiContatto(pers4);
        sim.aggiungiContatto(pers5);
        sim.aggiungiContatto(pers6);
        sim.visualizzaContatti();
        System.out.println(sim.cercaContattoPerNome("Giann"));
    }
}