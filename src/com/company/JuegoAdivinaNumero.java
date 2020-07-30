package com.company;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable{
    private int numeroAdivinar;
    public JuegoAdivinaNumero(int vidas,int numero) {
        super(vidas);
        this.numeroAdivinar=numero;
    }

    @Override
    public void Juega() {
        this.ReiniciaPartida();
        Scanner leer=new Scanner(System.in);
        int numero;
        boolean seguir=true;
        do {
            System.out.println("Adivina el número entre 0 y 10");
            numero = leer.nextInt();
            leer.nextLine();
            if (ValidaNumero(numero)) {
                if (numero == numeroAdivinar) {
                    System.out.println("Acertaste!!");
                    ActualizaRecord();
                    seguir = false;
                } else {
                    if (QuitaVida()) {
                        if (numero > numeroAdivinar) {
                            System.out.println("El número es menor");
                        } else {
                            System.out.println("El número es mayor");
                        }
                        System.out.println("Intentalo de nuevo");
                    } else {
                        seguir = false;
                    }
                }
            }
        }while (seguir) ;

    }

    @Override
    public void MuestraNombre() {
        System.out.println("Juego Adivina Número");
    }

    @Override
    public void MuestraInfo() {
        System.out.println("Tienes que adivinar el número antes de quedarte sin vidas, por cada número se indica si es mayor o menor");
        this.MuestravidasRestantes();
    }

    public boolean ValidaNumero(int num){
        return true;
    }
}

