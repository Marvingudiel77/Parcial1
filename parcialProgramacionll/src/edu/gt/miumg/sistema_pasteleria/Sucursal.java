package edu.gt.miumg.sistema_pasteleria;

public class Sucursal {
    private String nombre;
    private String direccion;


    public Sucursal (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void AgregarEmpleado(){
        System.out.println("Se ha hagregado el empleado correctamente");
    }
    public void AgregarIngrediente(){
        System.out.println("Se ha hagregado el ingrediente correctamente");
    }
    public void AgregarEquipo(){
        System.out.println("Se ha hagregado el equipo correctamente");
    }
    public void AgregarEspecialidad(){
        System.out.println("Se ha hagregado la especialidad correctamente");
    }
}
