package edu.gt.miumg.sistema_pasteleria;

public class Pastel extends Postre {
    private String sabor;

    public Pastel(String nombre, double tamanio, double precio, String sabor) {
        super(nombre, tamanio, precio);
        this.sabor = sabor;
    }
}
