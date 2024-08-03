package edu.gt.miumg.sistema_pasteleria;

public class Brownie extends Postre {
    private String tipoChocolate;

    public Brownie(String nombre, double tamanio, double precio, String sabor) {
        super(nombre, tamanio, precio);
        this.tipoChocolate = sabor;
    }
}
