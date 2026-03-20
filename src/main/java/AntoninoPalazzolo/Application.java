package AntoninoPalazzolo;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Collection collection = new Collection();
        Collection collection2 = new Collection();
        Collection collection3 = new Collection();
        Videogame videogame1 = new Videogame(1L, "Zelda", 2006, 49.95, "PS2",
                45, Genre.ADVENTURE);
        BoardGame boardGame1 = new BoardGame(2L, "Monopoly", 1935, 29.99, 6, 120.0);
        collection.addGame(videogame1);
        collection.addGame(videogame1);
        System.out.println(collection); // test per provare il metodo addgame
        Game searchGame = collection.searchById(1L);
        System.out.println(searchGame);
        Game searchGame2 = collection.searchById(78L);
        System.out.println(searchGame2);
        Videogame sonic = new Videogame(3L, "Sonic", 1991, 19.99, "Sega", 10, Genre.ACTION);
        Videogame superMario = new Videogame(4L, "Super Mario", 1985, 24.99, "Nintendo", 15, Genre.ADVENTURE);
        Videogame callOfDuty = new Videogame(5L, "Call of Duty", 2003, 59.99, "PC", 20, Genre.ACTION);
        Videogame godOfWar = new Videogame(6L, "God of War", 2018, 49.99, "PS4", 25, Genre.ACTION);
        Videogame ratchetAndClank = new Videogame(7L, "Ratchet and Clank", 2002, 29.99, "PS2", 12, Genre.ADVENTURE);
        Videogame jackAndDexter = new Videogame(8L, "Jak and Daxter", 2001, 19.99, "PS2", 10, Genre.ADVENTURE);
        Videogame spyro = new Videogame(9L, "Spyro", 1998, 14.99, "PS1", 8, Genre.ADVENTURE);
        BoardGame chess = new BoardGame(10L, "Chess", 1475, 19.99, 2, 30.0);
        BoardGame risk = new BoardGame(11L, "Risk", 1957, 34.99, 6, 180.0);
        BoardGame scrabble = new BoardGame(12L, "Scrabble", 1938, 24.99, 4, 60.0);
        BoardGame clue = new BoardGame(13L, "Clue", 1949, 29.99, 6, 45.0);
        BoardGame pandemic = new BoardGame(14L, "Pandemic", 2008, 39.99, 4, 60.0);
        collection.addGame(sonic);
        collection.addGame(superMario);
        collection.addGame(callOfDuty);
        collection.addGame(ratchetAndClank);
        collection.addGame(jackAndDexter);
        collection2.addGame(chess);
        collection2.addGame(risk);
        collection2.addGame(scrabble);
        collection2.addGame(clue);
        collection2.addGame(pandemic);
        collection3.addGame(godOfWar);
        collection3.addGame(spyro);
        collection3.addGame(risk);
        collection3.addGame(pandemic);

        List<Game> testThePrice = collection.searchByPrice(59.90); // testato il metodo cerca per prezzo
        testThePrice.forEach(price -> System.out.println(price));

        List<Game> testThePeople = collection2.searchBynumberOfPlayer(4); // testao il metodo cerca per numero di giocatori
        testThePeople.forEach(player -> System.out.println(player));

        collection.removeById(4L); //testo il metodo removeById
        collection.updateById(3L, "ciao", 1978, 20.01); // testo il metodo aggiorna tramite l'id
        Game provaUpdateById = collection.searchById(3L);
        System.out.println(provaUpdateById);

        collection3.getTheStatics(); // testo il metodo per trovarmi le statistiche


    }
}
