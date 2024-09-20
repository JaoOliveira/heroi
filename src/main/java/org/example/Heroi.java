package org.example;

public class Heroi {
    private String name;
    private int idade;
    private Tipo tipo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Heroi() {
        this.name = name;
        this.idade = idade;
        this.tipo = tipo;
    }

    String atacar(Tipo tipo){
        String ataque;
        if(tipo.name().equals("guerreiro")){
            ataque =  "espada";
        }else if(tipo.name().equals("mago")){
            ataque =  "magia";
        }else if(tipo.name().equals("monge ")){
            ataque =  "artes marciais";
        }else if(tipo.name().equals("ninja")){
            ataque =  "shuriken";
        }else{
            ataque =  "um revolver";
        }

      return   "O " + tipo.name() + " atacou usando " + ataque;
    }
}
