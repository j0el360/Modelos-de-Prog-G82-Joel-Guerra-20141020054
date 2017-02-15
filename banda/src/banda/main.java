/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

/**
 *
 * @author Estudiantes
 */
public class main {

    static Banda banda;
    static Nota nota;
    public static void main(String[] args) {
        //Inicializamos banda
       banda=new Banda();
       //Se crea la banda con un numero aleatorio de instrumentos
       banda.crearBanda(3+(int)(Math.random()*(8)));
       
       //Incicializamos Nota
       nota=new Nota();
       //Se crean las notas
       nota.crearNotas();
       
       //Se le ordena a la banda tocar unan nota aleatoria
       banda.Tocar(nota.getNotas().get(1+(int)(Math.random()*(3))));
    }
    
}
