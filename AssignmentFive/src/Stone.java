
public class Stone {
	public Player owner; //who owns this stone?
	public int type; //what type of stone is it? wall?
	public Stone(Player owner, int type){
		this.owner = owner;
		this.type = type;
		
	}
}
