package org.example;

public class Contatto {


    private String nome;
    private String cognome;
    private int num_tel;

    Contatto(String nome, String cognome, int num_tel){
        this.cognome=cognome;
        this.nome=nome;
        this.num_tel=num_tel;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getNum_tel() {
        return num_tel;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", num_tel=" + num_tel +
                '}';
    }



}
