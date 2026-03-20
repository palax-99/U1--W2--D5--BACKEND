package AntoninoPalazzolo;

public class Videogame extends Game {
    private String piattaforma;
    private int durataGioco;
    private Genre genere;

    public Videogame(long id, String title, int annoPubblicazione, double price, String piattaforma,
                     int durataGioco, Genre genere) {
        super(id, title, annoPubblicazione, price);
        this.piattaforma = piattaforma;
        this.durataGioco = durataGioco;
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public int getDurataGioco() {
        return durataGioco;
    }

    public Genre getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "piattaforma='" + piattaforma + '\'' +
                ", durataGioco=" + durataGioco +
                ", genere=" + genere +
                "} " + super.toString();
    }
}
