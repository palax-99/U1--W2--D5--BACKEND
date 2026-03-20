package AntoninoPalazzolo;

public abstract class Game {
    private long id;
    private String title;
    private int annoPubblicazione;
    private double price;

    public Game(long id, String title, int annoPubblicazione, double price) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Il titolo non può essere vuoto"); // gestisco il problema
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Il prezzo deve essere positivo"); // gestisco il problema
        }
        this.id = id;
        this.title = title;
        this.annoPubblicazione = annoPubblicazione;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
