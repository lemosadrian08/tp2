public class Persona implements Comparable <Persona> {
    private String apellido;

    private String nombre;

    public Persona (){
        apellido="";
        nombre="";
    }


    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    @Override
    public int compareTo(Persona persona) {

        return nombre.compareTo(persona.getNombre());
    }


}
