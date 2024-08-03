package edu.gt.miumg.sistema_pasteleria;

public class CheeseCake extends Postre {
    private String tipoDeQueso;

    public CheeseCake(String nombre, double tamanio, double precio, String sabor) {
        super(nombre, tamanio, precio);
        this.tipoDeQueso = sabor;
    }
}