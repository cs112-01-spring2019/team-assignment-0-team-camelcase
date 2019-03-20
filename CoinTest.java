
class CoinTest{
	public static void main(String[] args){
		Coin myCoin = new Coin();
		for(int i =0; i<10;i++){
			myCoin.flip();
			System.out.println(myCoin);
		}
	}

}