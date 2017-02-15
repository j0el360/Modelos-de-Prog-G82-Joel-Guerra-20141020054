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
public class Banda {   
    Instrumento[] usar; 
    Instrumento instrumentos;
    
    //funcion que crea La banda con n instrumentos diferentes
    void crearBanda(int cant){
       
        instrumentos=new Instrumento();
        instrumentos.crearInstrumentos();
        usar=new Instrumento[cant]; 
       
        for(int i=0;i<cant;i++){
              do{
                usar[i]=usar[i].getInstrumentos().get((int)(Math.random()*(10)));
                
           }while(repetido(i));
 
        }
    }
    
    //Funcion que analiza si algun instrumento en la banda esta repetido
    boolean repetido(int i){
       for(int j=0;j<i;j++){
            if(usar[j].getNombre()==usar[i].getNombre()){
                return true;
            }
        }
        return false;
    }
    
    //Funcion donde la banda toca una nota
    void Tocar(Nota nota){
        System.out.println("tocando una nota de "+nota.getAutor()+" con:");
        int i=1;
        while((i-1)<usar.length){
            System.out.println(usar[i-1].getNombre());
            i++;
        }
    }

}
