/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Practica1 {
       public static Scanner teclado = new Scanner (System.in);
       public static String ingreso[][] = new String [20][2];
       static int lugar = 0;
       static int posicion = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usuario;
        String contraseña;
        
        System.out.println(" Nombre del Usuario ");
        usuario = teclado.nextLine();
        System.out.println(" Contraseña ");
        contraseña = teclado.nextLine();
        
        if(usuario.equals("cajero_202106830") && contraseña.equals("ipc1_202106830")){
            
            menu();
       }
        else{     
           System.out.println(" Usuario o contraseña incorrecta ");               
                        }
        
    }
    
    public static void menu()
    {
        int op;
                    System.out.println(" -----ELIGA UNA OPCION----- ");
                    System.out.println("");
                    System.out.println(" 1)Agregar Nuevos Productos ");
                    System.out.println(" 2)Agregar Cupones de descuento ");
                    System.out.println(" 3)Realizar Ventas ");
                    System.out.println(" 4)Realizar Reporte ");
                    op = teclado.nextInt();
                    
                    switch(op){
           case 1 -> nuevosproductos();
           case 2 -> {
            if(posicion<20){
           String codigo = "";
           String descuento = "";
           int continuar = 0;
           do{
              
           
               System.out.println("Ingrese el codigo del Cupon");
               codigo = teclado.next();
               System.out.println("Ingrese el % de descuento del cupon");
               descuento = teclado.next();
               
               ingreso[posicion][0] = codigo;
               ingreso[posicion][1] = descuento;
               posicion = posicion+1;
              
               System.out.println("¿Desea agregar otro cupon de descuento?");
               System.out.println(" 0 = SI ");
               System.out.println(" 1 = NO ");
               continuar = teclado.nextInt();
           }while(continuar == 0);
           
            }
           else{
               System.out.println("No se pueden Ingresar mas Cupones");
           }
           menu(); 
               
               
               }
           case 3 -> {
               
               
               String cliente;
               String NIT = null;
               String agnit;
               String cf = "C/F";
               
               System.out.println("Nombre del cliente");
               cliente = teclado.next();
               System.out.println("¿Desea agregar NIT? ¿si o no?");
               agnit = teclado.next();
               if(agnit.equals("si")){
               System.out.println(" NIT: ");
               NIT = teclado.next();
               }
               else{
                   NIT = cf;
               }
               System.out.println("");
               System.out.println("--------------------");
               System.out.println("cliente: "+cliente);
               System.out.println("NIT: "+NIT);                   
               System.out.println("--------------------");
               System.out.println(""); 
               System.out.println("********LISTADO DE PRODUCTOS********");
               System.out.println("************************************");
               System.out.println("");      
                System.out.println(""+"NO."+"  "+"PRODUCTO"+"        "+"PRECIO");
                
           for(lugar = 0; lugar<20; lugar++){
               
               System.out.println("---------------------------------");
           System.out.println(lugar+"\t"+ingreso[lugar][0]+"\t"+"\t"+"Q."+ingreso[lugar][1]);
               
            }
           
           
        
           
           }

           case 4 -> System.out.println("has entrado a la opcion 4");
           
    }
    
    }
    public static void nuevosproductos()
       {
           if(lugar<20){
           String producto = "";
           String precio = "";
           int continuar = 0;
           boolean verificar = true;
               System.out.println("");
               System.out.println("----------------------------------------------");
               System.out.println("|"+"QUE PRODUCTOS DESEARAS COMPRAR EL DIA DE HOY"+"|");
               System.out.println("----------------------------------------------");
           do{
               System.out.println("Ingrese Nombre del Producto");
               producto = teclado.next();
                   
           
               System.out.println("Ingrese Precio del Producto");
               precio = teclado.next();
               
               ingreso[lugar][0] = producto;
               ingreso[lugar][1] = precio;
               lugar = lugar+1;
              
                  
              double nprecio = parseDouble(precio);
              if(nprecio <= 0){
                  System.out.println("********************************************");
                  System.out.println("*"+"Ingrese un precio mayor que cero por favor"+"*");
                  System.out.println("********************************************");
                  System.out.println("Ingrese Precio del Producto");
                  nprecio = teclado.nextDouble();
              }
             
           
               System.out.println("¿Desea agregar otro producto?");
               System.out.println(" 0 = SI ");
               System.out.println(" 1 = NO ");
               continuar = teclado.nextInt();
           }while(continuar == 0);
       
            }
           else{
               System.out.println("No se pueden Ingresar mas Productos");
           }
           menu();

}
            
             
    }

            
            
    
    

