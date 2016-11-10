import java.util.Observer;
import java.util.Observable;
import java.util.*;
import javafx.util.Pair;

public class RandomWallAIPlayer extends Player {
	private Random rand;

	public RandomWallAIPlayer(Observable o) {
  		super(o, "The Computer");
  		rand = new Random();
  	}

	public RandomWallAIPlayer(Observable o, String name) {
	  	super(o, name);
	  	rand = new Random();
	  }

	private Pair<Integer,Integer> pickRandomSpace() {
		int x = rand.nextInt(5)+1;
		int y = rand.nextInt(5)+1;
		//System.out.println(x+" "+y);
		return new Pair<Integer,Integer>(x,y);
	}

    public Move makeMove(){
    	//picks a random space
        Pair<Integer,Integer> space = pickRandomSpace();
        
        //decides whether to play a wall or not
        if(rand.nextInt(3) < 2){
        	//if that space is empty places wall there
            if (boardstate.get(space) == null) {
            	return new PlaceStone(this, space, 1);
            }
        } else{
        	//if that space is empty places stone there
            if (boardstate.get(space) == null) {
            	return new PlaceStone(this, space, 0);
            }
        }

        //if space contains ally stone, checks surrounding spaces for enemy stones to move onto
        if (boardstate.get(space).owner == this) {
        	Pair<Integer,Integer> target = new Pair<Integer,Integer>(space.getKey(), space.getValue()+1);
        	if (boardstate.get(target) != null && boardstate.get(target).owner != this) {
        		return new MoveStone(this, space, target);
        	}

        	target = new Pair<Integer,Integer>(space.getKey(), space.getValue()-1);
        	if (boardstate.get(target) != null && boardstate.get(target).owner != this) {
        		return new MoveStone(this, space, target);
        	}

        	target = new Pair<Integer,Integer>(space.getKey()+1, space.getValue());
        	if (boardstate.get(target) != null && boardstate.get(target).owner != this) {
        		return new MoveStone(this, space, target);
        	}

        	target = new Pair<Integer,Integer>(space.getKey()-1, space.getValue());
        	if (boardstate.get(target) != null && boardstate.get(target).owner != this) {
        		return new MoveStone(this, space, target);
        	}
		}

		//if it doesn't make any moves, try again
		return makeMove();
    }
    /*
    MoveStone movePiece( Integer x, Integer y, Pair<Integer, Integer> space){
    	Pair<Integer, Integer> target = new Pair<Integer,Integer>(space.getKey()+x, space.getValue()+y);
    	if (boardstate.get(target) != null && boardstate.get(target) != this) {
    		return new MoveStone(this, space, target);
    	}else{
    		return null;
    	}
    }
    */
}
