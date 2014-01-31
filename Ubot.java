import Robot.*;

public class Ubot{

	private int current = 1;
	private int min = 1;
	private int max = 3;

	private void goTo(int l){
		if(current < l && l <= max){
			Robot.moveRight();
			current++;
			goTo(l);
		}
		else if(current > l && l >= min){
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
		if(isEmpty(l)){
			return -1;
		}
		else{
			goTo(l);
			Robot.pickBlock();
			int a = Robot.readBlock();
			Robot.putBlock();
			return a;	
		}	
	}

	public boolean isEmpty(int l){
		goTo(l);
		boolean a = Robot.isEmptyColumn();
		return a;
	}

	public void play(){
		goTo(1);
		Robot.play();
	}

	public static void main(String[] args) {
		System.out.println("The Ubot class");
		System.out.println("See https://github.com/PierreGaudichon/Ubot for more informations.");
	}
}