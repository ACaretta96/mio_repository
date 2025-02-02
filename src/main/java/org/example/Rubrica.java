package org.example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Rubrica {

    public ArrayList<Contatto> lista;

    Rubrica(){
        this.lista=new ArrayList<>();
    }

    public void aggiungiContatto(Contatto cont){
        this.lista.add(cont);
    }
    public void visualizzaContatti(){
        this.lista.stream().forEach(s-> {
            System.out.println(s.toString());
        });
    }

    public Contatto cercaContattoPerNome(String nome){
        return this.lista.stream().filter(s->s.getNome().equals(nome)).findFirst().orElse(new Contatto("Milite","Ignoto",999));
    }

}
