public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;



    public Persona(String nombre,String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {}

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
    public String infoPersona(){
        return "Nombre: "+nombre+"\n"+
                "Apellidos: "+apellidos+"\n"+
                "Edad: "+edad+"\n";
    }
}
