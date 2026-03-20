package AntoninoPalazzolo;

import java.util.*;

public class Collection {

    private Map<Long, Game> giochi = new HashMap<>();

    public Map<Long, Game> getGame() {
        return giochi;
    }

    public void setGame(Map<Long, Game> giochi) {
        this.giochi = giochi;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "giochi=" + giochi +
                '}';
    }

    public void addGame(Game game) {
        if (giochi.containsKey(game.getId())) {
            // ID già esistente, non aggiungo
            System.out.println("Errore: esiste già un gioco con questo ID");
        } else {
            // ID non esiste, aggiungo
            giochi.put(game.getId(), game);
        }

    }

    public Game searchById(long id) {
        if (giochi.containsKey(id)) {
            return giochi.get(id);
        } else {
            System.out.println("Gioco non trovato");
            return null;
        }
    }

    public List<Game> searchByPrice(double price) { // creato il metodo cerca per prezzo
        return giochi.values().stream().filter(game -> game.getPrice() < price).toList();
    }

    public List<Game> searchBynumberOfPlayer(int numeroGiocatori) { // creato il metodo per cercare tramite il numero dei giocatori
        return giochi.values().stream()
                .filter(game -> game instanceof BoardGame && ((BoardGame) game).getNumeroGiocatori() == numeroGiocatori)
                .toList();
    }

    public void removeById(long id) {
        if (giochi.containsKey(id)) {
            giochi.remove(id);
            System.out.println("Il gioco è stato rimosso");
        } else {
            System.out.println("Il gioco non esiste");

        }

    }

    public void updateById(long id, String title, int annoPubblicazione, double price) {
        if (giochi.containsKey(id)) {
            Game giocoInConsiderazione = giochi.get(id);
            giocoInConsiderazione.setTitle(title);
            giocoInConsiderazione.setAnnoPubblicazione(annoPubblicazione);
            giocoInConsiderazione.setPrice(price);
            System.out.println("Il gioco è stato aggiornato");
        } else {
            System.out.println("Gioco non trovato");
        }

    }

    public void getTheStatics() {
        long numberOfVideogames = giochi.values().stream().filter(game -> game instanceof Videogame).count();
        long numberOfBoardGame = giochi.values().stream().filter(game -> game instanceof BoardGame).count();
        System.out.println(numberOfBoardGame);
        System.out.println(numberOfVideogames);
        Optional<Game> maxPrice = giochi.values().stream()
                .max(Comparator.comparing(game -> game.getPrice()));

        if (maxPrice.isPresent()) {
            System.out.println("Gioco più costoso: " + maxPrice.get());
        }
        OptionalDouble statics = giochi.values().stream().mapToDouble(game -> game.getPrice()).average();

        if (statics.isPresent()) {
            System.out.println("Media prezzi: " + statics.getAsDouble());
        }


    }

}



