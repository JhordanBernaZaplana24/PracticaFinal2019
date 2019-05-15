import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GrupoMusica {
    private String nombreGrupo;
    List<Integrante> listaIntegrante;
    private int numeroIntegrantes;
    private int numeroDiscosPublicados;
    private GeneroMusical genero;

    public GrupoMusica(String nombreGrupo, int numeroDiscosPublicados, int numeroIntegrantes) {
        this.nombreGrupo = nombreGrupo;
        this.numeroDiscosPublicados = numeroDiscosPublicados;
        if (nombreGrupo.equals("")) {
            throw new IllegalArgumentException("Tiene que haber algun nombre");
        }
        if (numeroDiscosPublicados <= 0) {
            throw new IllegalArgumentException("Tiene que haber algun disco publicado.");
        }
        if (numeroIntegrantes <= 0) {
            throw new IllegalArgumentException("Tiene que haber algun integrante en el grupo.");
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrupoMusica that = (GrupoMusica) o;
        return Objects.equals(nombreGrupo, that.nombreGrupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreGrupo);
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public List<Integrante> getListaIntegrante() {
        return listaIntegrante;
    }

    public void setListaIntegrante(List<Integrante> listaIntegrante) {
        this.listaIntegrante = listaIntegrante;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public int getNumeroDiscosPublicados() {
        return numeroDiscosPublicados;
    }

    public void setNumeroDiscosPublicados(int numeroDiscosPublicados) {
        this.numeroDiscosPublicados = numeroDiscosPublicados;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "GrupoMusica{" +
                "nombreGrupo='" + nombreGrupo + '\'' +
                ", numeroIntegrantes=" + numeroIntegrantes +
                ", numeroDiscosPublicados=" + numeroDiscosPublicados +
                '}';
    }
    public String info() {
        String salida = "";
        salida += this.getGenero() + " - " + this.getNombreGrupo() + "Son " + this.getListaIntegrante() +
                " los intregrantes del grupo. Tienen" + this.getNumeroDiscosPublicados() + "discos publicados.";
        return salida;
    }

}
