
package Dao;


import Modelos.Empleado;
import Modelos.EmpleadoOficina;
import evaluacionpoo.IOperaciones;
import java.util.ArrayList;


public class DaoEmpleadoOf implements IOperaciones {
 
    
    public ArrayList<String> lista=new ArrayList();
  
    public void agregarRegistro(int a){//sobrecarga un metodo sin parametros
        
       
    }
    public void agregarRegistro(Object o) {
        
       EmpleadoOficina of =new EmpleadoOficina();
        Empleado em =new Empleado();
        //inicialize los datos
        
        of.setNombre("juana");
        of.setApellido("lopez");
        of.setId(3);
        of.setHorasExtras(2000);
        of.setSalarioBase(7000);
        
        em.setHorasExtras(of.getHorasExtras());
        em.setSalarioBase(of.getSalarioBase());
        
       
        
         lista.add(0,"id:"+of.getId());
        lista.add(1,"Nombre:"+of.getNombre());
        lista.add(2,"Apellido:"+of.getApellido());
     
        lista.add(3,"Horas extras:"+of.getHorasExtras());
        lista.add(4,"Salario Base:"+of.getSalarioBase());
        lista.add(5,"salario bruto:"+em.calcularSalarioBruto());
        lista.add(6,"salario neto:"+ em.calcularSalarioNeto());
        lista.add(7,"seguro:"+em.Seguro());
        
        
        
        
        
    
    
 
    
    
   
 
       
       
       
    }

   
    public void mostrarRegistro() {
       
        System.out.println(""+lista);
        }
        
    
    
}
