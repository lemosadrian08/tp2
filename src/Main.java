import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Lemos","Juan");
        Persona persona2 = new Persona("Rodriguez","Adrian");
        Persona persona3 = new Persona("Garcia","Pedro");
        Persona persona4 = new Persona("Santos","Javier");
        Persona persona5 = new Persona("Pagni","Carlos");


        List<Persona> litaPersonas = new ArrayList<>();

        litaPersonas.add(persona1);
        litaPersonas.add(persona2);
        litaPersonas.add(persona3);
        litaPersonas.add(persona4);
        litaPersonas.add(persona5);

        Collections.sort(litaPersonas);

        for (Persona elemento:litaPersonas){
            System.out.println(elemento.getNombre());
        }


    }
}