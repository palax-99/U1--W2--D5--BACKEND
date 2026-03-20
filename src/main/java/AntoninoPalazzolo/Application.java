package AntoninoPalazzolo;

public class Application {

    public static void main(String[] args) {
        Collection collection = new Collection();
        Videogame videogame1 = new Videogame(1L, "Zelda", 2006, 49.95, "PS2",
                45, Genre.ADVENTURE);
        BoardGame boardGame1 = new BoardGame(2L, "Monopoly", 1935, 29.99, 6, 120.0);
        collection.addGame(videogame1);
        collection.addGame(videogame1);
        System.out.println(collection); // test per provare il metodo addgame

    }
}
