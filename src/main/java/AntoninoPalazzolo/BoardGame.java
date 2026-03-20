package AntoninoPalazzolo;

public class BoardGame extends Game {
    private int numeroGiocatori;
    private double mediaDiUnaPartita;

    public BoardGame(long id, String title, int annoPubblicazione, double price, int numeroGiocatori, double mediaDiUnaPartita) {
        super(id, title, annoPubblicazione, price);
        this.numeroGiocatori = numeroGiocatori;
        this.mediaDiUnaPartita = mediaDiUnaPartita;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    public double getMediaDiUnaPartita() {
        return mediaDiUnaPartita;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "numeroGiocatori=" + numeroGiocatori +
                ", mediaDiUnaPartita=" + mediaDiUnaPartita +
                "} " + super.toString();
    }
}
