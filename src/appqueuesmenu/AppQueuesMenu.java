/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqueuesmenu;

import java.util.Scanner;


public class AppQueuesMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int op, nP;
        System.out.print("Cuantos datos tiene la queue: ");
        nP=t.nextInt();
        ccircular cc1 = new ccircular(nP);
        do{
          System.out.println("\t Menu de queue");
          System.out.println("1. Insertar");
          System.out.println("2. eliminar");
          System.out.println("3. Mostrar completa");
          System.out.println("4. Salida");
          
          System.out.print("Ingresa un numero pedido: \n");
          op=t.nextInt();
          
          switch(op){
              case 1:
                  System.out.print("Insertar: ");
                  int valor=t.nextInt();
                  cc1.insertar(valor);
                  break;
              case 2:
                  if(!cc1.esta_vacia()){
                  Numero vE = new Numero();
                  cc1.eliminar(vE);
                  System.out.println("Valor extraido: "+vE.num);
                  } else {
                      System.out.println("esta cola esta vacia");
                  }
                  break;
              case 3:
                  System.out.print("Mostrar queue: \n");
                  for(int i=0;i<cc1.datos.length;i++)
                      System.out.print(cc1.datos[i]+"-");
                  break;
              default:
                  System.out.print("Error, opción no valida.");
          }
        } while(op!=4);

    }
    
}
