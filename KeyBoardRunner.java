class KeyBoardRunner
{
	public static void main(String[] poori)
	{
	    String type="Qwetry";
		float price=2000f;
		String brand="Dell";
		KeyBoard refkey=new KeyBoard(type,price,brand);
		System.out.println(refkey.type +"\n"+ refkey.price +"\n"+ refkey.brand);
	}
}