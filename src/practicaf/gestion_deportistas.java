
package practicaf;
import java.util.ArrayList;
import java.util.Scanner;

public class gestion_deportistas {
    private ArrayList<deportista> deportistas = new ArrayList<deportista>();
    private Scanner teclado= new Scanner(System.in);
    public void abrir_gestion(){
        System.out.print("(1) Ingresar deportista\n" + 
                         "(2) Actualizar deportista\n" + 
                         "(3) Eliminar deportista\n" + 
                         "(4) Buscar deportistas\n" + 
                         "(5) Salir\n");
        
        int x;
        x=obteclado();
        abrir_accion(x);
    
    }
    public int obteclado(){
        int n;
        teclado = new Scanner(System.in);
        n= teclado.nextInt();
        
        return n;
    }
    public void abrir_accion(int x){
          switch(x){
            case 1: ingresar_deportista();
            break;
            case 2:
            break;
            case 3: eliminar();
            break;
            case 4: buscar();
            break;
            case 5:
            System.exit(0);
            break;
            default: System.out.println("Dato invalido solo debe ingresar un numero valido");
            abrir_gestion();
            break;
        }
          abrir_gestion();
    }
    public void ingresar_deportista(){
        int edad;
        String nombre= new String();
        deportista d = new deportista();
        int documento = 0;
        String sexo = new String();
        int anio=0;
        System.out.print("Ingrese el nombre completo: ");
        teclado = new Scanner(System.in);
        nombre= teclado.nextLine();
        System.out.print("Ingrese el documento de identidad: ");
        teclado = new Scanner(System.in);
        documento= teclado.nextInt();
        System.out.print("Ingrese el año de nacimiento: ");
        teclado = new Scanner(System.in);
        anio= teclado.nextInt();
        edad= 2016-anio;
        if(edad>=6&&edad<=10){
            d.setCategoria("Infantil A");
        }
         if(edad>=11&&edad<=17){
            d.setCategoria("Infantil B");
        }
          if(edad>=18&&edad<=25){
            d.setCategoria("Juvenil");
        }
           if(edad>25){
            d.setCategoria("Senior");
        }
        System.out.print("Ingrese el sexo (masculino/femenino): ");
        teclado = new Scanner(System.in);
        sexo= teclado.next();
        d.setNombre(nombre);
        d.setDocumento(documento);
        d.setSexo(sexo);
        d.setAnio(anio);
        deportistas.add(d);
    }
    public int buscar(){
        int documento=0;
        System.out.print("Ingrese el documento de identidad: ");
        teclado = new Scanner(System.in);
        documento= teclado.nextInt();
        deportista d= new deportista();
        for(int i=0;i<deportistas.size();i++){
            d=deportistas.get(i);
            if(documento==d.getDocumento()){
               System.out.print("Nombre: "+ d.getNombre() + 
                       "\n Documento: " + d.getDocumento() + 
                       "\n Sexo: " + d.getSexo() + 
                       "\n Año: " + d.getAnio() + 
                       "\n Categoria: " + d.getCategoria() + "\n");
               return i;
            }
        }
        System.out.print("El deportista no ha sido ingresado: \n");
        return -1;
    }
    public void eliminar(){
           int i=buscar();
           String decision = new String();
           if(i!=-1){
               System.out.print("¿Esta seguro que desea borrar el deportista(y: si/n: no)?");
               teclado = new Scanner(System.in);
               decision = teclado.next();
               if(decision.equals("y")||decision.equals("si")){
                   deportistas.remove(i);
                   System.out.println("Se ha borrado exitosamente");
               }
           }
    }
    public void actualizar(){
       eliminar();
       ingresar_deportista();
    }
}
