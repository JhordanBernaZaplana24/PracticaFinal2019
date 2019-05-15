public class Integrante extends Persona{
    private String nombreArtistico;
    private String funcionEnElGrupo;

    public Integrante (String nombreArtistico, String funcionEnElGrupo) {
        super();
        this.nombreArtistico = nombreArtistico;
        this.funcionEnElGrupo = funcionEnElGrupo;
    }


    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public String getFuncionEnElGrupo() {
        return funcionEnElGrupo;
    }
    public String infoDelIntegrante(){
        return "Nombre Artistico: "+nombreArtistico+"\n"+
                "En el grupo, él es: "+funcionEnElGrupo+"\n";

    }
    @Override
    public String toString() {
        return "Integrante{" +
                "nombreArtistico='" + nombreArtistico + '\'' +
                "funcion en el grupo='" + funcionEnElGrupo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
