public enum GeneroMusical {
    BLUES("Blues"),
    COUNTY("County"),
    ELECTRO("Electronica"),
    FLAMENCO("Flamenco"),
    FUNK("Funk"),
    RAP("Rap"),
    REGGAE("Reggae"),
    REGGAETON("Reggaeton"),
    ROCK_AND_ROLL("Rock and Roll"),
    HEAVY_METAL("Heavy Metal"),
    HIP_HOP("Hip Hop");

    private String tipoGenero;

    GeneroMusical(String tipoGenero) {
        this.tipoGenero=tipoGenero;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

}
