package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {//abre Class
LinkedList<Libro> libros = new LinkedList();
boolean leido = false;

public void registrarLibro(Libro libro){//abre registrarLibro
libros.add(libro);
}//cierra registrarLibro

public String buscarLibro (String palabraBusqueda){//abre buscar libro
    for (Libro i: libros) {//abre for
        if ((i.getTitulo().equals(palabraBusqueda)) || i.getAutor().equals(palabraBusqueda) || i.getGenero().equals(palabraBusqueda)) {//abre if
          
            return palabraBusqueda;  
        }//cierra if
 
    }//cierra for

return null;
}//cierra buscar libro
public void mostrarLibros(){//abre mostrar libros
    for (Libro libro : libros) {//cierra 2for
        System.out.println(libro.toString());
    }//cierra 2for

}//cierra mostarlibros

public void mostrarLibrosNoLeidos(){//abre libros no leidos
    for (Libro libro : libros) {//abre for
        if (!libro.leido) {//abre if
            System.out.println(libro.mostrarInformacion());
        }//cierra id
    }//cierra for
  }//ciera libros no leidos
}//cierra Class
