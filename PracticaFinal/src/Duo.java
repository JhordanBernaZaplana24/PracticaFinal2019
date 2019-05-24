public class Duo extends GrupoMusica{
    private String nombreDuo;
    private String nombreArtisticoCantante1;
    private String nombreArtisticoCantante2;

    public Duo (String nombreArtisticoCantante1, String nombreArtisticoCantante2 , String nombreDuo) {
        super();
        this.nombreArtisticoCantante1 = nombreArtisticoCantante1;
        this.nombreArtisticoCantante2 = nombreArtisticoCantante2;
        this.nombreDuo = nombreDuo;

    }

    public String getNombreDuo() {
        return nombreDuo;
    }

    public void setNombreDuo(String nombreDuo) {
        this.nombreDuo = nombreDuo;
    }

    public String getNombreArtisticoCantante1() {
        return nombreArtisticoCantante1;
    }

    public void setNombreArtisticoCantante1(String nombreArtisticoCantante1) {
        this.nombreArtisticoCantante1 = nombreArtisticoCantante1;
    }

    public String getNombreArtisticoCantante2() {
        return nombreArtisticoCantante2;
    }

    public void setNombreArtisticoCantante2(String nombreArtisticoCantante2) {
        this.nombreArtisticoCantante2 = nombreArtisticoCantante2;
    }

    public String infoDeIntegrantes(){
        return "Nombre del grupo: "+nombreDuo+"\n"+
                "Nombre artistico del primer cantante: "+nombreArtisticoCantante1+"\n"+
                "Nombre artistico del segundo cantante: "+nombreArtisticoCantante2+"\n";

    }

    @Override
    public String toString() {
        return "Duo{" +
                "nombreDuo='" + nombreDuo + '\'' +
                ", nombreArtisticoCantante1='" + nombreArtisticoCantante1 + '\'' +
                ", nombreArtisticoCantante2='" + nombreArtisticoCantante2 + '\'' +
                '}';
    }
}
