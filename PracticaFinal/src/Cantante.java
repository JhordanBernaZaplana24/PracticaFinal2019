public class Cantante extends Persona{
    protected String nombreArtistico;

    public Cantante (String nombreArtistico) {
        super();
        this.nombreArtistico = nombreArtistico;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    @Override
    public String toString() {
        return "Cantante{" +
                "nombreArtistico='" + nombreArtistico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
