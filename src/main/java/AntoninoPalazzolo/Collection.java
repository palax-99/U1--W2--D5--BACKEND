package AntoninoPalazzolo;

import java.util.HashMap;
import java.util.Map;

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


}
