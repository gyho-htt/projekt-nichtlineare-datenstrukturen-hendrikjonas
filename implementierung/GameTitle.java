public class GameTitle implements ComparableContent<GameTitle> {

    private Game game;
    public GameTitle(Game pGame) {
        game = pGame;
    }

    public Game getGame(){
        return game;
    }

    static GameTitle createSearchTitle(String pString){
        return new GameTitle(new Game(0,0,pString,null,null));
    }

    @Override
    public boolean isGreater(GameTitle pContent) {
        return this.game.getTitel().compareTo(pContent.getGame().getTitel()) > 0;
    }

    @Override
    public boolean isEqual(GameTitle pContent) {
        return this.game.getTitel().compareTo(pContent.getGame().getTitel()) == 0;
    }

    @Override
    public boolean isLess(GameTitle pContent) {
        return this.game.getTitel().compareTo(pContent.getGame().getTitel()) < 0;
    }
}
