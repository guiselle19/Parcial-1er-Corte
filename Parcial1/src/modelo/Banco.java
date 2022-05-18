
package modelo;


import java.util.Scanner;


public class Banco {
  private String nombre;
  private final int maxSedes=5; 
  private Sede[] sedes;
  static Scanner lector =new Scanner(System.in);
  
    public Banco() {
        this.sedes=new Sede[maxSedes];
    }

    public Banco(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sede[] getSedes() {
        return sedes;
    }

    public void setSedes(Sede[] sedes) {
        this.sedes = sedes;
    }
   
   
  public void crearSede(){
      String nom,direc,ciud;
      int cod,n;
      
      
      
      System.out.println("Cuantas sedes desea crear: ");
       n=lector.nextInt();
      if (n>5){
          System.out.println("No se puede crear esta cantidad de sedes ");
            
      }
      
      else {
        
          for(int i=0;i<n;i++){
               System.out.println("Ingrese el nombre de la sede ");
              nom=lector.next();
               System.out.println("Ingrese la dirección de la sede ");
               direc=lector.next();
               System.out.println("Ciudad donde estará ubicada la sede ");
               ciud=lector.next();
               System.out.println("Ingrese el código de la sede ");
               cod=lector.nextInt();
               
               sedes[i]=new Sede(nom,direc,ciud,cod);
               
               
          }
      }
  }
  public void consultarSede(){
      int codig;
      System.out.println("Ingrese el código de la sede a consultar: ");
      codig=lector.nextInt();
      
      for (Sede sede : sedes) {
           if (sede.getCodigo()==codig) {
               System.out.println("Búsqueda exitosa");
               System.out.println(sede);
           }else{
               System.out.println("No se encuentra registrado este código de sede");
           }
       }
              
   }
   public void listaSedes(){
       System.out.println("Lista de sedes");
       for(int i=0;i<sedes.length;i++){
           
        System.out.println(sedes[i]);   
       }
       
   }   
  
  @Override
  public String toString(){
      return
              "\n Nombre:  "+ this.getNombre();
               
  }
}


