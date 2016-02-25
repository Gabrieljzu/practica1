package practicaf;

import java.util.Scanner;

public class Menu_principal {
    private Scanner teclado;
    private int n;
    public void abrir_menu() {
        System.out.print("(1) Gestion de deportistas\n" + "(2) Inscripcion en competencia\n" + "(3)Salir\n");
        int x;
        x=obteclado();
        abrir_submenu(x);    
    }
    public void abrir_submenu(int x){
        switch(x){
            case 1: 
            break;
            case 2:
            break;
            case 3:
            System.exit(0);
            break;
            default: System.out.println("Dato invalido solo debe ingresar un numero valido");
            abrir_menu();
            break;
        }
    
    }
    public int obteclado(){
        teclado = new Scanner(System.in);
        n= teclado.nextInt();
        
        return n;
    }
}
