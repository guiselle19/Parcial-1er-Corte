
package vista;

import modelo.*;
import java.util.Scanner;




public class BancoPrincipal {
    static Scanner lector = new Scanner(System.in);
   
   
   
   public static void crearBanco(){
       String name;
       System.out.println("Ingrese nombre del banco");
       name=lector.next();
       Banco banco1 = new Banco(name);
   }
   
    public static void main(String[] args) {
        int op=0;
      
            
        Banco banco = new Banco();
        Sede sede = new Sede();
        
        
            
            
        do {
             System.out.println("\n****Bienvenido al Banco 3B******");
            System.out.println("1. Crear Banco");     
            System.out.println("2. Crear sede");
            
            System.out.println("3. Crear cuenta bancaria");
            System.out.println("4. Consultar sede");
            System.out.println("5. Lista de sedes");
            System.out.println("6. Consulta cuenta Bancaria");
            System.out.println("7. Salir");
            System.out.println("Seleccione una Opción:");
            op=lector.nextInt();
            
            switch(op){
                case 1:
                    crearBanco();
                    break;
                case 2:
                    banco.crearSede();
                    break;
                case 3:
                    sede.crearCuenta();
                    break;
                case 4:
                    banco.consultarSede();
                    break;
                case 5:
                    banco.listaSedes();
                    break;
                case 6:
                    sede.consultarCuenta();
                    break;
                    
                default:
                     System.out.println("Las opciones son entre 1 y 7");
                    
            }
        }while(op!=7);
                
  }
   
}

    
   