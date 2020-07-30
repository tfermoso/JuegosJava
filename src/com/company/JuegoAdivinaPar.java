package com.company;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean ValidaNumero(int num) {
       if(num%2==0){
           return true;
       }else{
           System.out.println("Error");
           return false;
       }
    }
}
