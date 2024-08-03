package edu.gt.miumg.sistema_pasteleria;

abstract class Postre {
    private String nombre;
    private double tamanio;
    private double precio;

    public Postre(String nombre, double tamanio, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    void Preparar(){
        System.out.println("se comienza a apreparar el postre: " + getNombre());
    }
    void Servir(){
        System.out.println("se comienza a servir el postre: "+ getNombre());

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
