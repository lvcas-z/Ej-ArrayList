package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

     List <Persona> listaAmigos = new ArrayList<Persona> ();
        listaAmigos.add(new Persona(1,"Alex",30));
        listaAmigos.add(new Persona(2,"Sander",21));
        //recorrer por indice
        System.out.println("--FOR--");
        for (int i = 0; i< listaAmigos.size(); i++){
            System.out.println(listaAmigos.get(i).getNombre());
        }
        System.out.println("--FOREACH--");
        //recorre con forEach
        for (Persona persona: listaAmigos){
            System.out.println("Usando forEach"+""+ persona.getEdad());
        }
        System.out.println("--ITERATOR--");
        //recorrer con iterator
        Iterator iterator = listaAmigos.iterator();
        while (iterator.hasNext()){
            System.out.println("iterador"+iterator.next());
        }
    }
}
