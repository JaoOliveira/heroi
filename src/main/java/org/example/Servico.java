package org.example;

public class Servico {
   static String getNivel(Heroi heroi){
       if(heroi.getXp() < 1000){
           return "Ferro";
       } else if (heroi.getXp() >= 1000 && heroi.getXp() < 2000  ) {
           return "Bronze";
       } else if (heroi.getXp() >= 2000 && heroi.getXp() < 5000 ) {
           return "Prata";
       }else if (heroi.getXp() >= 5000 && heroi.getXp() < 7000 ) {
           return "Ouro";
       }else if (heroi.getXp() >= 7000 && heroi.getXp() < 8000 ) {
           return "Platina";
       }else if (heroi.getXp() >= 8000 && heroi.getXp() < 9000 ) {
           return "Ascendente";
       }else if (heroi.getXp() >= 9000 && heroi.getXp() < 10000 ) {
           return "Imortal";
       }else if (heroi.getXp() >= 10000 && heroi.getXp() < 11000 ) {
           return "Radiante";
       }else{
           return "valor Incorreto!";
       }

   }
}
