import java.util.*;
import javafx.util.Pair;

public class TextGUI extends FooGUI {

	public TextGUI(Observable o) {
		super(o);
	}

	private void print(Stone input) {
		if (input == null) {
			System.out.print(" ");

		//} else if (input instanceof Player){
			//System.out.print(playerlist.indexOf((Player)input)+1);
		} else {
			if(FooGame.getTurn()%2 != 0){
				if (input.owner.toString() == "Computer1"){
					System.out.print("1");
				}
				else{
					System.out.print("2");
				}
				
			}else{
				if (input.owner.toString() == "Computer1"){
					System.out.print("1");
				}else{
					System.out.print("2");
				}
			}
		}
	}

	private void println(Object input){
		System.out.println(input);
	}

	private void println() {
		System.out.println();
	}

	private Pair<Integer,Integer> t(int x, int y) {
		return new Pair<Integer,Integer>(x,y);
	}

	public void draw() {
		println("-------------------------");
		System.out.print("| ");
		print(boardstate.get(t(1,6)));
		System.out.print(" | ");
		print(boardstate.get(t(2,6)));
		System.out.print(" | ");
		print(boardstate.get(t(3,6)));
		System.out.print(" | ");
		print(boardstate.get(t(4,6)));
		System.out.print(" | ");
		print(boardstate.get(t(5,6)));
		System.out.print(" |");
		print(boardstate.get(t(6,6)));
		System.out.print("  |");
		println();

		println("-------------------------");
		System.out.print("| ");
		print(boardstate.get(t(1,5)));
		System.out.print(" | ");
		print(boardstate.get(t(2,5)));
		System.out.print(" | ");
		print(boardstate.get(t(3,5)));
		System.out.print(" | ");
		print(boardstate.get(t(4,5)));
		System.out.print(" | ");
		print(boardstate.get(t(5,5)));
		System.out.print(" |");
		print(boardstate.get(t(6,5)));
		System.out.print("  |");
		println();

		println("-------------------------");
		System.out.print("| ");
		print(boardstate.get(t(1,4)));
		System.out.print(" | ");
		print(boardstate.get(t(2,4)));
		System.out.print(" | ");
		print(boardstate.get(t(3,4)));
		System.out.print(" | ");
		print(boardstate.get(t(4,4)));
		System.out.print(" | ");
		print(boardstate.get(t(5,4)));
		System.out.print(" |");
		print(boardstate.get(t(6,4)));
		System.out.print("  |");
		println();

		println("-------------------------");
		System.out.print("| ");
		print(boardstate.get(t(1,3)));
		System.out.print(" | ");
		print(boardstate.get(t(2,3)));
		System.out.print(" | ");
		print(boardstate.get(t(3,3)));
		System.out.print(" | ");
		print(boardstate.get(t(4,3)));
		System.out.print(" | ");
		print(boardstate.get(t(5,3)));
		System.out.print(" |");
		print(boardstate.get(t(6,3)));
		System.out.print("  |");
		println();

		println("-------------------------");
		System.out.print("| ");
		print(boardstate.get(t(1,2)));
		System.out.print(" | ");
		print(boardstate.get(t(2,2)));
		System.out.print(" | ");
		print(boardstate.get(t(3,2)));
		System.out.print(" | ");
		print(boardstate.get(t(4,2)));
		System.out.print(" | ");
		print(boardstate.get(t(5,2)));
		System.out.print(" |");
		print(boardstate.get(t(6,2)));
		System.out.print("  |");
		println();

		println("-------------------------");
		System.out.print("| ");
		print(boardstate.get(t(1,1)));
		System.out.print(" | ");
		print(boardstate.get(t(2,1)));
		System.out.print(" | ");
		print(boardstate.get(t(3,1)));
		System.out.print(" | ");
		print(boardstate.get(t(4,1)));
		System.out.print(" | ");
		print(boardstate.get(t(5,1)));
		System.out.print(" |");
		print(boardstate.get(t(6,1)));
		System.out.print("  |");
		println();
		println("-------------------------");


	}

	public static void main(String[] args) {
		Map<Pair<Integer,Integer>,Player> bm = new HashMap<Pair<Integer,Integer>,Player>();
		for (int i=1; i<6; i++) {
			for (int i2=1; i2<6; i++) {
				bm.put(new Pair<Integer,Integer>(i,i2), null);
			}
		}


	}
}
