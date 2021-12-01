
package Dao;

import Modelos.Empleado;
import Modelos.EmpleadoProduccion;

import evaluacionpoo.IOperaciones;
import java.util.ArrayList;


public class DaoEmpleadoPro implements IOperaciones {
 
    public ArrayList<String> lista=new ArrayList();
    
  
   public void agregarRegistro(){//sobrecarga.
       
   }
    public void agregarRegistro(Object a) {
      EmpleadoProduccion pr =new EmpleadoProduccion();
        Empleado em =new Empleado();
        
        pr.setNombre("Benjamin");
        pr.setApellido("marin");
        pr.setId(5);
        pr.setHorasExtras(10000);
        pr.setSalarioBase(7000);
        pr.setBono(200);
        
       
        em.setSalarioBase(pr.getSalarioBase()+pr.getBono());
        em.setHorasExtras(pr.getHorasExtras());
        
        
        
        
       
        
       
        
        lista.add(0,"id:"+pr.getId());
        lista.add(1,"Nombre:"+pr.getNombre());
        lista.add(2,"Apellido:"+pr.getApellido());
     
        lista.add(3,"horas extras:"+pr.getHorasExtras());
        lista.add(4,"salario base:"+pr.getSalarioBase());
        lista.add(5,"salario bruto:"+em.calcularSalarioBruto());
        lista.add(6,"salario neto:"+ em.calcularSalarioNeto());
        lista.add(7,"seguro:"+em.Seguro());
        lista.add(8,"Bono:"+pr.getBono());
    }

    @Override
    public void mostrarRegistro() {
         System.out.println(""+lista);
    }
    
}
