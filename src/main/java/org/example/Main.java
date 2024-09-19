package org.example;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.setName("João");
        heroi.setXp(8000);

      //  System.out.println(Servico.getNivel(heroi));
        System.out.println(Servico.getRanked(200,100));
    }
}