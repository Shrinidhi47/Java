class HelmetRunner
{
	public static void main(String[] args)
	{
		Helmet helmet=new Helmet();
		helmet.type="Moter Cycle Helmet";
		helmet.cost=800;
		helmet.brand="SteelBird";
		helmet.color="Black";
		
		Helmet helmet1=new Helmet();
		helmet1.type="Cycle Helmet";
		helmet1.cost=2200;
		helmet1.brand="abcd";
		helmet1.color="Green";
		
		helmet.Protect();
		helmet1.Protect();
	}
}