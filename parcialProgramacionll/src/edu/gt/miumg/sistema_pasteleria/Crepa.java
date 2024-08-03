package edu.gt.miumg.sistema_pasteleria;

public class Crepa extends Postre{
    private String tipoMasa;

    public Crepa(String nombre, double tamanio, double precio, String tipoMasa){
        super(nombre,tamanio,precio);
        this.tipoMasa = tipoMasa;
    }




}
