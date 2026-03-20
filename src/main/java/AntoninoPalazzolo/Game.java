package AntoninoPalazzolo;

public abstract class Game {
    private long id;
    private String title;
    private int annoPubblicazione;
    private double price;

    public Game(long id, String title, int annoPubblicazione, double price) {
        this.id = id;
        this.title = title;
        this.annoPubblicazione = annoPubblicazione;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", price=" + price +
                '}';
    }
}
