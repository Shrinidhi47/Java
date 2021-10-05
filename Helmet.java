class Helmet
{
	String type;
	float cost;
	String brand;
	String color;
	
	void Protect()
	{
		System.out.println("Invoked Protect");
		System.out.println(type);
		System.out.println(cost);
		System.out.println(brand);
		System.out.println(color);
	}
}