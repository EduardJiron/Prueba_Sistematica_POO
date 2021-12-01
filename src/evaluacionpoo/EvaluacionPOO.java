
package evaluacionpoo;

import Modelos.EmpleadoOficina;
import Modelos.EmpleadoProduccion;
import Dao.DaoEmpleadoOf;
import Dao.DaoEmpleadoPro;


public class EvaluacionPOO   {

    public static void main(String[] args) {
     
 
    
    DaoEmpleadoOf e =new DaoEmpleadoOf();
    DaoEmpleadoPro pro =new DaoEmpleadoPro();
    EmpleadoOficina eo =new EmpleadoOficina();//empleado oficina
    EmpleadoProduccion pd =new EmpleadoProduccion();//empleado produccion
    
    
    
    
    e.agregarRegistro(eo);
    e.mostrarRegistro();
    pro.agregarRegistro(pd);
    pro.mostrarRegistro();
    
    
    
   
    
        
        
         
        
    }
    
}
