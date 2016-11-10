import java.util.*;
import javafx.util.Pair;


public abstract class Move {
  protected Player player;

  public Move(Player p) {
    player = p;
  }

  public abstract Map<Pair<Integer,Integer>,Stone> alterBoard(Map<Pair<Integer,Integer>,Stone> boardstate);

  public Player getPlayer() {
    return player;
  }

}
