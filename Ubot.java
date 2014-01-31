import Robot.;

public class Ubot{

	private int current = 1;
	private int min = 1;
	private int max = 3;
	
	public Ubot(int _start, int _min, int _max){
		current = _start;
		min = _min;
		max = _max;
	}

	public int tellName(){
		System.out.println("Ubot !!");
		return 1;
	}

	/*public void goto(int l){	
		if(current <= l && l <= max){
			Robot.moveRight();
			current++;
			goto(l);
		}
		else if(current >= l && l >= min){
			Robot.moveLeft();
			current--;
			goto(l);
		} 
	}*/

	public void moveBlock(int from, int to){
		//this.goto(from);
		tellName();
		//Robot.pickBlock();
		//goto(to);
		//Robot.putBlock();
	}

	/*public int read(int l){
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

	*/

	public static void main(String[] args) {
		System.out.println("The Ubot clss");
		Ubot u = new Ubot(1,1,1);
		
	}
}