//Object referencing

package recur;

public class Game {
	void gameDetails() {
		String name="Cricket";
		System.out.println("Game in Game class is "+name);
	}
	public static void main(String[] args) {
		IndoorGame ig=new IndoorGame();
		Game g;
		Game obj=new Game();
		obj.gameDetails();
		ig.gameDetails();
		g=ig;
		g.gameDetails();
	}
 
}
class IndoorGame extends Game{
	void gameDetails() {
		String gname="T.T";
		System.out.println("Game in Indoor g is "+gname);
	}
	
}
