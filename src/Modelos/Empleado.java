
package Modelos;

import evaluacionpoo.*;


public class  Empleado {//uso de la herencia
    protected int id;
    protected String nombre;
    protected String apellido;
    protected double horasExtras;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, double horasExtras, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasExtras = horasExtras;
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    //metodos 
    public double calcularSalarioNeto(){
        double salario;
        
     salario= salarioBase+horasExtras;
     salario=salario- (salario*7)/100;
        
        return salario;
    }
    public float calcularSalarioBruto(){
        double a=salarioBase+horasExtras;
        float salario= (float)a;
         
         return salario;
    }
    public double Seguro(){
    double seguro=0;
    seguro=(salarioBase+horasExtras)*7;
    seguro=seguro/100;
            
            
            
            return seguro;
    }
            
            
                   
    
    
}
