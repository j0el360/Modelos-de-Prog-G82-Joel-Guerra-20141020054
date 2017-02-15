/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Nota {
    String autor;
    void crearNotas(){
    Nota nota1=new Nota("Beethoven");
    Nota nota2=new Nota("Mozart");
    Nota nota3=new Nota("Vivaldi");
    }
    
    private static ArrayList<Nota> notas =new ArrayList<Nota>();

public Nota(String Autor){
    this.autor=Autor;
    notas.add(this);
}    
public Nota(){
    crearNotas();
}

    public String getAutor() {
        return autor;
    }

    public static ArrayList<Nota> getNotas() {
        return notas;
    }


        
}
