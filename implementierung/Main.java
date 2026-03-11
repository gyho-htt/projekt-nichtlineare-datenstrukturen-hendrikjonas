public class Main{
    public static void main(String[] args) {
        BinarySearchTree<GameTitle> gameTitelTree = new BinarySearchTree<>();
        BinarySearchTree<GamePreis> gamePreisTree = new BinarySearchTree<>();
        List<Game> games = new List<>();

        games.append(new Game(2025, 70, "Resident Evil 9", "CapCom", "Survival-Horror"));
        games.append(new Game(2020, 40, "Cyberpunk 2077", "CD PROJEKT RED", "Sci-Fi"));
        games.append(new Game(2013, 0, "Warframe", "Digital Extremes", "Third-Person-Shooter"));
        games.append(new Game(2019, 60, "Mortal Kombat 11", "Warner Bros.", "Fighting"));
        games.append(new Game(2026, 120, "Forza Horizon 6", "Xbox Game Studios", "Racing"));
        games.append(new Game(2018, 80, "Red Dead Redemption 2", "Rockstar Games", "RPG"));

        games.toFirst();
        while(games.hasAccess()){
            gameTitelTree.insert(new GameTitle(games.getContent()));
            gamePreisTree.insert(new GamePreis(games.getContent()));
            games.next();
        }
        GameTitle result = gameTitelTree.search(GameTitle.createSearchTitle("Resident Evil 9"));
        GamePreis kosten = gamePreisTree.search(GamePreis.createSearchPreis(60));
        System.out.println(kosten.getGame().getTitel());

        System.out.println(result.getGame().getPreis());

    }
}