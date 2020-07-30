package com.company;

public class Aplicacion {

    public static void main(String[] args) {
	// write your code here
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,7);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar juego3=new JuegoAdivinaImpar(3,5);
        juego.MuestraNombre();
        juego.MuestraInfo();
        juego.Juega();
        juego2.MuestraNombre();
        juego2.MuestraInfo();
        juego2.Juega();
        juego3.MuestraNombre();
        juego3.MuestraInfo();
        juego3.Juega();

    }
}
