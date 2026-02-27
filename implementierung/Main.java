public class Main{
    public static void main(String[] args) {
        BinarySearchTree<Game> gamePreisTree = new BinarySearchTree<>();
        BinarySearchTree<Game> gameErscheinungsjahrTree = new BinarySearchTree<>();
        BinarySearchTree<Game> gameTitelTree = new BinarySearchTree<>();
        BinarySearchTree<Game> gamePublisherTree = new BinarySearchTree<>();
        BinarySearchTree<Game> gameGenreTree = new BinarySearchTree<>();
        Game g1 = new Game(2026, 70, "Resident Evil 9", "CapCom", "Survival-Horror");
        Game g2 = new Game(2020, 60, "Cyberpunk 2077", "CD PROJEKT RED", "RPG");
        Game g3 = new Game(2013, 0, "Warframe", "Digital Extremes", "Third-Person-Shooter");
        Game g4 = new Game(2019, 60, "Mortal Kombat 11", "Warner Bros.", "Fighting");
        gamePreisTree.insert(g2,"preis");
        gamePreisTree.insert(g1,"preis");
        gamePreisTree.insert(g3,"preis");
        gamePreisTree.insert(g4,"preis");

        gameGenreTree.insert(g2,"genre");
        gameGenreTree.insert(g1,"genre");
        gameGenreTree.insert(g3,"genre");
        gameGenreTree.insert(g4,"genre");

        gameTitelTree.insert(g2,"titel");
        gameTitelTree.insert(g1,"titel");
        gameTitelTree.insert(g3,"titel");
        gameTitelTree.insert(g4,"titel");

        gamePublisherTree.insert(g2,"publisher");
        gamePublisherTree.insert(g1,"publisher");
        gamePublisherTree.insert(g3,"publisher");
        gamePublisherTree.insert(g4,"publisher");
    }
}