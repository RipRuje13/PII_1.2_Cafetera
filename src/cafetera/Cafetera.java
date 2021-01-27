
package cafetera;

import java.util.Scanner;

public class Cafetera {

    public static void main(String[] args) {
        
        Funciones caf = new Funciones(1000); 
        Scanner leer = new Scanner(System.in);
        
        int op,cantidad;
        
        System.out.println("Menu de la Cafetera");
        
        do{
            System.out.println("seleccione una opcion");
            System.out.println("1.- Llenar cafetera");
            System.out.println("2.- Servir taza");
            System.out.println("3.- Agregar cafe");
            System.out.println("4.- Vaciar cafetera");
            System.out.println("5.- Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    caf.llenarCafetera();
                    System.out.println("capacidad maxima: "+caf.getcapacidadMaxima()+"ml");
                    System.out.println("cantidad actual: "+caf.getcapacidadActual()+"ml");
                break;
                    
                case 2:
                    System.out.println("de cuantos ml es su taza? (ingrese cantidad en ml)");
                    cantidad = leer.nextInt();
                    caf.servirTaza(cantidad);
                    System.out.println("capacidad maxima: "+caf.getcapacidadMaxima()+"ml");
                    System.out.println("cantidad actual: "+caf.getcapacidadActual()+"ml");
                break;
                    
                case 3:
                    System.out.println("Cuanto cafe desea agregar?(ingrese cantidad en ml)");
                    cantidad = leer.nextInt();
                    caf.agregarCafe(cantidad);
                    System.out.println("capacidad maxima: "+caf.getcapacidadMaxima()+"ml");
                    System.out.println("cantidad actual: "+caf.getcapacidadActual()+"ml");
                break;
                    
                case 4:
                    caf.vaciarCafetera();
                    System.out.println("capacidad maxima: "+caf.getcapacidadMaxima()+"ml");
                    System.out.println("cantidad actual: "+caf.getcapacidadActual()+"ml");
                break;
                
            }
        }while(op!=5);
        System.out.println("Hasta pronto :)");

    }
    
}
