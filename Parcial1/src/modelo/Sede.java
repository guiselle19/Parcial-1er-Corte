
package modelo;

import java.util.Scanner;


public class Sede {
    private String nombre;
    private String direccion;
    private String ciudad;
    private int codigo;
    private final int maxCuentas=10;
    private Cuenta[] cuentas;

    public Sede() {
         this.cuentas=new Cuenta[maxCuentas];
    }

    public Sede(String nombre, String direccion, String ciudad, int codigo ) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigo = codigo;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    static Scanner lector = new Scanner(System.in);
    
public void crearCuenta(){
   int num,numCuenta;
   String tipoC,cc,nom,apellido;
   double saldoIni,saldo;
   char sexo;
    System.out.println("Cuantas cuentas desea abrir: ");
    num=lector.nextInt();
   
       for(int i=0;i<num;i++){
       
       System.out.println("Ingrese el numero de cuenta: ");
       numCuenta= lector.nextInt();
       System.out.println("Ingrese el tipo de cuenta: ");
       tipoC= lector.next();
       System.out.println("Ingrese el saldo inicial: ");
       saldoIni= lector.nextDouble();
       System.out.println("Ingrese el saldo: ");
       saldo= lector.nextDouble();
       System.out.println("Ingrese el numero de identificación del titular: ");
       cc= lector.next();
       System.out.println("Ingrese el nombre: ");
       nom= lector.next();
       System.out.println("Ingrese el apellido: ");
       apellido= lector.next();
       System.out.println("Indique el sexo:");
       sexo= lector.next().charAt(0);
       Persona titular = new Persona(cc,nom,apellido,sexo);
       cuentas [i]=new Cuenta(numCuenta,tipoC,saldoIni,saldo,titular);
           System.out.println("Cuenta creada con exito");
       
               }
}
 public void consultarCuenta(){
     int numC;
      System.out.println("numero de cuenta: ");
      numC=lector.nextInt();
      
      for (Cuenta cuenta : cuentas) {
           if (cuenta.getNumCuenta()==numC) {
               System.out.println("Búsqueda exitosa");
               System.out.println(cuenta);
           }else{
               System.out.println("No se encuentra registrado este numero de cuenta");
               
           }
       }
              
   }
      
   

    
    @Override
    public String toString(){
        
     return "\n Nombre de la Sede:  " + this.getNombre()
             + "\n Dirección de la Sede: " + this.getDireccion()
             + "\n Ciudad: " + this.getCiudad()
             + "\n codigo: " + this.getCodigo(); 
             
            
    }
            
}
