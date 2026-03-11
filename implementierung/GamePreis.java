public class GamePreis implements ComparableContent<GamePreis> {

    private Game game;
    public GamePreis(Game pGame) {
        game = pGame;
    }

    public Game getGame(){
        return game;
    }

    static GamePreis createSearchPreis(int pInt){
        return new GamePreis(new Game(0,pInt,null,null,null));
    }

    public boolean isGreater(GamePreis pContent) {
        return (this.game.getPreis() > pContent.game.getPreis());
    }

    public boolean isEqual(GamePreis pContent) {
        return (this.game.getPreis() == pContent.game.getPreis());
    }

    public boolean isLess(GamePreis pContent) {
        return (this.game.getPreis() < pContent.game.getPreis());
    }
}
