package com.mycompany.bibliotecapoo;


import java.util.Scanner;

public class Principal {//abre principal

   
    public static void main(String[] args) { //abre main Complejidad Temporal: Tiempo Constante 0(1)
        Scanner sc = new Scanner(System.in);
        Biblioteca bib = new Biblioteca ();
        int opcion;
        
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Menú");
            System.out.println("1) Ingresar Libro");
            System.out.println("2) Mostrar todos los Libros");
            System.out.println("3) Buscar Libros");
            System.out.println("4) Marcar libro como leido");
            System.out.println("5) Mostrar libros no leidos");
            System.out.println("Elija una de las Opciones");
            opcion = sc.nextInt();
            switch(opcion){
            
               case 1:                                      
                   System.out.print("Ingrese el Titulo del libro, su autor, el genero y el año de publicacion ");
                   sc.nextLine();            
                   String titulo = sc.nextLine(); 
                   String autor = sc.nextLine();     
                   String genero = sc.nextLine();
                   int anoPublicacion = sc.nextInt();            
                   Libro nuevoLibro = new Libro(titulo, autor, genero, anoPublicacion);
                   bib.registrarLibro(nuevoLibro);
                   break;
               case 2:
                   bib.mostrarLibros();
                   break;
               case 3:
                   System.out.println("Ingrese una palabra clave");
                   sc.nextLine();
                   String palabraBusqueda = sc.nextLine();
                   String resultadoBusqueda = bib.buscarLibro(palabraBusqueda);
                   if (resultadoBusqueda != null) {
                       System.out.println("El libro encontrado es: " + resultadoBusqueda);
                   }else{
                       System.out.println("No se encontro ningun Libro");
                   }
                   break;
               case 4:
                   
                   break;
               case 5:
                   System.out.println("Libros no leidos: ");
                   bib.mostrarLibrosNoLeidos();
                   break;
               case 0:
                   System.out.println("Saliendo... ");
               default:
                   System.out.println("Operacion Invalida, intente nuevamente ");
                   break;
            }  
      } while (opcion != 0);
        /*System.out.println("Ingrese el titulo del libro, el nombre de su autor, el genero y año de aplicacion");
        String titulo = sc.nextLine();
        String autor = sc.nextLine();
        String genero = sc.nextLine();
        int anoPublicacion = sc.nextInt();
        Libro libro = new Libro(titulo, autor, genero, anoPublicacion);
        System.out.println(libro.mostrarInformacion());
        libro.marcarLeido();
        if (libro.leido == true) {
            System.out.println("El Libro ya fue leído");
        }else{
            System.out.println("El Libro no ha sido leído");
        }//cierra else
        System.out.println("EL libro es Antiguo? " + libro.esAntiguo());*/
    
    
    }//cierra main
    
    
}//cierra principal
