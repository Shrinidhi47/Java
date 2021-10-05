class Pizza
{
	String name;
	float price;
	
	static void open()
	{
		System.out.println("Invoked open");		
	}
	void look()
	{
		System.out.println("Invoked look");
		open();
	}
	void tasting()
	{
		System.out.println("Invoked tasting");
		this.look();
	}
	static void close()
	{
		System.out.println("Invoked close");
		open();
	}
	
}