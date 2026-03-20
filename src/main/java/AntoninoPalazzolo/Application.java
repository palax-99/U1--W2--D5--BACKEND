package AntoninoPalazzolo;

import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        boolean scannerFunzionante = true;
        while (scannerFunzionante) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi gioco");
            System.out.println("2. Cerca per ID");
            System.out.println("3. Cerca per prezzo");
            System.out.println("4. Cerca per numero di giocatori");
            System.out.println("5. Rimuovi tramite ID");
            System.out.println("6. Aggiorna tramite ID");
            System.out.println("7. Ottieni le statistiche generali");

            System.out.println("0. Esci");

            int sceltaDeiNumeri = Integer.parseInt(scanner.nextLine().trim());

            switch (sceltaDeiNumeri) {
                case 1:
                    System.out.println("Che tipo di gioco vuoi aggiungere? 1. Videogame 2. BoardGame");
                    int tipo = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Inserisci l'ID:");
                    long id = Long.parseLong(scanner.nextLine().trim());
                    System.out.println("Inserisci il titolo:");
                    String title = scanner.nextLine();
                    System.out.println("Inserisci l'anno di pubblicazione:");
                    int anno = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Inserisci il prezzo:");
                    double price = Double.parseDouble(scanner.nextLine());
                    if (tipo == 1) {
                        System.out.println("Inserisci la piattaforma");
                        String piattaforma = scanner.nextLine();
                        System.out.println("Inserisci la durata gioco in ore");
                        int durataGioco = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println("Inserisci il genere fra:");
                        System.out.println(" 1 ADVENTURE");
                        System.out.println("2 FIGHTING");
                        System.out.println("3 PUZZLE");
                        System.out.println("4 SIMULATION");
                        System.out.println("5 ACTION");
                        int sceltaGenere = Integer.parseInt(scanner.nextLine().trim());
                        Genre genere;
                        switch (sceltaGenere) {
                            case 1:
                                genere = Genre.ADVENTURE;
                                break;
                            case 2:
                                genere = Genre.FIGHTING;
                                break;
                            case 3:
                                genere = Genre.PUZZLE;
                                break;
                            case 4:
                                genere = Genre.SIMULATION;
                                break;
                            case 5:
                                genere = Genre.ACTION;
                                break;
                            default:
                                genere = Genre.ACTION;
                        }
                        try { // prova a fare questo sennò
                            Videogame videoGameUtente = new Videogame(id, title, anno, price, piattaforma, durataGioco, genere);
                            collection3.addGame(videoGameUtente);
                            System.out.println(videoGameUtente);
                        } catch (IllegalArgumentException e) { // gestisco l'errore
                            System.out.println("Errore: " + e.getMessage());
                        }


                    } else {
                        System.out.println("Inserisci il numero dei giocatori");
                        int numeroDeiGiocatori = Integer.parseInt(scanner.nextLine());
                        System.out.println("Inserisci la durata media di una partita");
                        double durataMedia = Double.parseDouble(scanner.nextLine());
                        try { // prova a fare questo sennò
                            BoardGame boardGameUtente = new BoardGame(id, title, anno, price, numeroDeiGiocatori, durataMedia);
                            collection3.addGame(boardGameUtente);
                            System.out.println(boardGameUtente);
                        } catch (IllegalArgumentException e) { // gestisco l'errore
                            System.out.println("Errore: " + e.getMessage());
                        }


                    }
                    break;
                case 2:
                    System.out.println(" Digita l'ID, in modo tale da trovatre il gioco");
                    long idDigitato = Long.parseLong(scanner.nextLine());
                    Game gameTrovatoDallUtente = collection3.searchById(idDigitato);
                    System.out.println(gameTrovatoDallUtente);
                    break;
                case 3:
                    System.out.println(" Digita il prezzo, in modo tale da trovare i giochi");
                    double prezzoDigitato = Double.parseDouble(scanner.nextLine());
                    List<Game> gameTrovatoDallUtenteTramitePrezzo = collection3.searchByPrice(prezzoDigitato);
                    gameTrovatoDallUtenteTramitePrezzo.forEach(games -> System.out.println(games));
                    break;
                case 4:
                    System.out.println(" Digita il numero di giocatori, in modo tale da trovare i giochi");
                    int numeroDiPersoneDigitato = Integer.parseInt(scanner.nextLine());
                    List<Game> gameTrovatoDallUtenteTramiteNumeroGiocatori = collection3.searchBynumberOfPlayer(numeroDiPersoneDigitato);
                    gameTrovatoDallUtenteTramiteNumeroGiocatori.forEach(games -> System.out.println(games));
                    break;
                case 5:
                    System.out.println(" Digita l'ID, in modo tale da rimuovere il gioco");
                    long idDigitato2 = Long.parseLong(scanner.nextLine());
                    collection3.removeById(idDigitato2);
                    break;
                case 6:
                    System.out.println("Inserisci l'ID del gioco da aggiornare:");
                    long idAggiornamento = Long.parseLong(scanner.nextLine());
                    System.out.println("Inserisci il nuovo titolo:");
                    String nuovoTitolo = scanner.nextLine();
                    System.out.println("Inserisci il nuovo anno:");
                    int nuovoAnno = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il nuovo prezzo:");
                    double nuovoPrezzo = Double.parseDouble(scanner.nextLine());
                    collection3.updateById(idAggiornamento, nuovoTitolo, nuovoAnno, nuovoPrezzo);
                    break;
                case 7:
                    collection3.getTheStatics();
                    break;
                case 0:
                    scannerFunzionante = false;
                    break;
            }
        }


    }
}
