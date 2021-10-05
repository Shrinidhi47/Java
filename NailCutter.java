class NailCutter
{
	float cost;
	String color;
	CutterSize size;
	boolean DirtCleaner;
	
	void Cutting()
	{
		System.out.println("Invoked Cutting");
		System.out.println(cost);    
		System.out.println(color); 
		System.out.println(size);    
		System.out.println(DirtCleaner);    
		
	}
	void Shaping()
	{
		System.out.println("Invoked Shaping");
		System.out.println(cost);
		System.out.println(color);
		System.out.println(size);
		System.out.println(DirtCleaner);
	}
	
}