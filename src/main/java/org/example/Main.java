package org.example;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.setName("João");
        heroi.setIdade(22);
        heroi.setTipo(Tipo.guerreiro);
        System.out.println(heroi.atacar(heroi.getTipo()));

      //  System.out.println(Servico.getNivel(heroi));
      //  System.out.println(Servico.getRanked(200,100));


    }
}