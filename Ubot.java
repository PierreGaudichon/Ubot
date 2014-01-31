import Robot.*

public class Ubot{

	private int current = 1;
	private boolean containsBlock = false;
	
	private void goto(int l){
		if(current <= l && l <= max){
			Robot.moveRight();
			current++;
			goto(l);
		}
		else if(current >= l && l <= min){
			Robot.moveLeft();
			current--;
			goto(l);
		} 
	}

	public void moveBlock(int from, int to){
		goto(from);
		Robot.pickBlock();
		goto(to);
		Robot.putBlock();
	}

	public int read(int l){
		goto(l);
		Robot.pickBlock();
		int a = Robot.readBlock();
		Robot.putBlock();
		return a;
	}

	public void isEmpty(int l){
		goto(l);
		Robot.pickBlock();
		int a = Robot.isEmptyColumn();
		Robot.putBlock();
		return a;
	}

	public void play(){
		Robot.play();
	}

	public Ubot(int start = 1, int min = 1, int max = 1){
		current = start;

	}

	public static void main(String[] args) {
		System.out.print("The Ubot class");
	}
}