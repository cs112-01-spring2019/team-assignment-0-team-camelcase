import java.util.*;

class Coin{
	private static int HEADS;
	private int value; 
	Coin(){
		HEADS = 1;
		value = 0;
	}
	public void flip(){
		if (Math.random()<0.5){
			value = 0;
		}
		else{
			value = 1;
		}
	}
	public String toString(){
		if(value ==HEADS)
			return "Heads";
		else{
			return "Tails";
		}
	}
	
}