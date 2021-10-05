class Saloon
{
	String name;
	String location;
	float openTime;
	float closeTime;
	SaloonBranch branch;
	
	void haircut()
	{
		System.out.println("invoked Haircut");
		System.out.println("Saloon Details");
		System.out.println(name);
		System.out.println(location);
		System.out.println(openTime);
		System.out.println(closeTime);
		System.out.println(branch);		
	}
	
	void smooth()
	{
		System.out.println("invoked Smooth");
		System.out.println("Smooth Details");
		System.out.println(name);
		System.out.println(location);
		System.out.println(openTime);
		System.out.println(closeTime);
		System.out.println(branch);		
	}
}