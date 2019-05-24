import java.util.ArrayList;
import java.util.List;

public class Banda extends GrupoMusica{
    private String nombreBanda;
    private String nombreCantante;
    private int numeroIntegrantes;



    public Banda(String nombreBanda, String nombreCantante, int numeroIntegrantes) {
        super();
        this.nombreBanda = nombreBanda;
        this.nombreCantante = nombreCantante;
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public List<String> mostrarMusicos(List<String> nombreMusicos){
        for (String s: nombreMusicos) {
            System.out.println(s);
        }
        return nombreMusicos;
    }

    @Override
    public String toString() {
        return "Banda{" +
                "nombreBanda='" + nombreBanda + '\'' +
                ", nombreCantante='" + nombreCantante + '\'' +
                ", numeroIntegrantes=" + numeroIntegrantes +
                '}';
    }
}