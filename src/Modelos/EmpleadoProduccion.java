
package Modelos;

import evaluacionpoo.*;

public class EmpleadoProduccion extends Empleado{
    private double bono;

    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(double bono, int id, String nombre, String apellido, double horasExtras, double salarioBase) {
        super(id, nombre, apellido, horasExtras, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

  
}
