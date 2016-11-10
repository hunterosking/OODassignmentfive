import java.util.Observer;
import java.util.Observable;
import java.util.*;
import javafx.util.Pair;

public class maxStones extends WinCondition{

	public maxStones(Observable observable) {
		super(observable);
	}

    public Player checkForWinner(){
			//check if either player is out of stones
        for(Player p:playerlist){
					//if either of them are count the number each one has on the board, the one with more stones wins
            if(p.getStones()<1){
                int max_stones = 0;
								Player winner = null;
								for (Player p3:playerlist) {
									int counter = 0;
									for (Stone s2:boardstate.values()) {
										if(s2 != null){
											if(p3 == s2.owner) counter++;
										}
									if (counter > max_stones) {
										max_stones = counter;
										winner = p;
									}
									}
								}
								return winner;
            }
        }
        return null;
    }

}
