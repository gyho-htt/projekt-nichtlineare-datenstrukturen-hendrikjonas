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

    @Override
    public boolean isGreater(GamePreis pContent) {
        return (this.game.getPreis() > pContent.game.getPreis());
    }

    @Override
    public boolean isEqual(GamePreis pContent) {
        return (this.game.getPreis() == pContent.game.getPreis());
    }

    @Override
    public boolean isLess(GamePreis pContent) {
        return (this.game.getPreis() < pContent.game.getPreis());
    }
}
