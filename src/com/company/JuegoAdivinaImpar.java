package com.company;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean ValidaNumero(int num) {
        if(num%2==0){
            System.out.println("Error");
            return false;
        }else{
            return true;
        }
    }
    public void MuestraNombre(){
        System.out.println("Juego Adivina Número Impar");
    }
    @Override
    public void MuestraInfo() {
        System.out.println("Tienes que adivinar el número antes de quedarte sin vidas, solo números impares, por cada número se indica si es mayor o menor");
        this.MuestravidasRestantes();
    }
}
