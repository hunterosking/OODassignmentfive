import java.util.*;
import javafx.util.Pair;

public class PlaceStone extends Move {
  private Pair<Integer,Integer> target;
  private int type;
  public PlaceStone(Player p, Pair<Integer,Integer> c, int type) {
    super(p);
    target = c;
    this.type = type;
  }

  public  Map<Pair<Integer,Integer>,Stone> alterBoard(Map<Pair<Integer,Integer>,Stone> boardstate) {
      //System.out.println(player);
      player.useStone();
      Stone stone = new Stone(player, type);
      boardstate.put(target, stone);
      return boardstate;
  }

  public Pair<Integer,Integer> getTarget() {
    return target;
  }

  public static void main(String[] args) {
    FooGame game = new FooGame(new Default());
    Player p = new DefaultRandomAIPlayer(game);
    PlaceStone ps = new PlaceStone(p, new Pair<Integer,Integer>(1,1), 0);
    Map<Pair<Integer,Integer>,Stone> bs = game.getBoardState();
    System.out.println(bs);
    System.out.println(p.getStones());
    ps.alterBoard(bs);
    System.out.println(bs);
    System.out.println(p.getStones());
  }
}
