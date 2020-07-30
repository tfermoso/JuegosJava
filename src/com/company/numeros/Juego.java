package com.company.numeros;

public abstract class Juego {
    private int vidas;
    private int vidasIniciales;
    private static int record=0;

    public Juego(int vidas) {
        this.vidas = vidas;
        this.vidasIniciales=vidas;
    }

    public void MuestravidasRestantes(){
        System.out.println("Número de vidas restantes: "+vidas);
    }

    public boolean QuitaVida(){
        this.vidas--;
        if(this.vidas==0){
            System.out.println("Juego Terminado");
            return false;
        }else{
            return true;
        }
    }

    public void ReiniciaPartida(){
        this.vidas=this.vidasIniciales;
    }

    public void ActualizaRecord(){
        if(this.vidas>Juego.record){
            Juego.record=this.vidas;
            System.out.println("Se ha batido el record: "+Juego.record);
        }else if(this.vidas==Juego.record){
            System.out.println("Se ha alcanzado el record");
        }
    }




}
