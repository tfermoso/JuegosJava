package com.company;

public class Juego {
    public int vidas;

    public Juego(int vidas) {
        this.vidas = vidas;
    }

    public void MuestravidasRestantes(){
        System.out.println("Número de vidas restantes: "+vidas);
    }

    public static void main(String[] args) {
        // write your code here
        Juego juego1=new Juego(5);
        juego1.MuestravidasRestantes();
        juego1.vidas--;
        Juego juego2=new Juego(5);
        juego1.MuestravidasRestantes();
        juego2.MuestravidasRestantes();
    }
}
