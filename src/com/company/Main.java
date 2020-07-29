package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Juego juego1=new Juego(5);
        juego1.ActualizaRecord();
        Juego juego2=new Juego(5);
        juego1.QuitaVida();
        juego1.ActualizaRecord();
        juego1.MuestravidasRestantes();
        juego1.ReiniciaPartida();
        juego1.MuestravidasRestantes();
        juego1.ActualizaRecord();

    }
}
