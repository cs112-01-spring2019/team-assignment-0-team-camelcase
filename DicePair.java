public class DicePair{

	private int sum;
	private Die die1; 
	private Die die2; 

	public DicePair(){
		die1 = new Die();
		die2 = new Die();
		sum = 0;
	}

	public int roll(){
		die1.roll();
		die2.roll();
		sum = die1.getFaceValue() + die2.getFaceValue();
		return sum;
	}

	public String toString(){
		return "Die 1: " + die1.getFaceValue() + " Die 2: " + die2.getFaceValue();
	}

	public int getSum(){ 
		return sum;
	}

	public void setSum(int in){
		sum = in;
	}

	public int getDie1(){
		return die1.getFaceValue();
	}

	public void setDie1(int in){
		die1.setFaceValue(in);
	}

	public int getDie2(){
		return die2.getFaceValue();
	}

	public void setDie2(int in){
		die2.setFaceValue(in);
	}

}