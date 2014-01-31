import Robot.*;

public class Ubot{

	private int current = 1;
	private int min = 1;
	private int max = 3;

	public int tellName(){
		System.out.println("Ubot !!");
		return 1;
	}

	public void goTo(int l){	
		if(current <= l && l <= max){
			Robot.moveRight();
			current++;
			goTo(l);
		}
		else if(current >= l && l >= min){
			Robot.moveLeft();
			current--;
			goTo(l);
		} 
	}

	public void moveBlock(int from, int to){
		goTo(from);
		Robot.pickBlock();
		goTo(to);
		Robot.putBlock();
	}

	public int read(int l){
		goTo(l);
		Robot.pickBlock();
		int a = Robot.readBlock();
		Robot.putBlock();
		return a;
	}

	public boolean isEmpty(int l){
		goTo(l);
		Robot.pickBlock();
		boolean a = Robot.isEmptyColumn();
		Robot.putBlock();
		return a;
	}

	public void play(){
		Robot.play();
	}

	public static void main(String[] args) {
		System.out.println("The Ubot class");
		Ubot u = new Ubot(1);
			
	}
}