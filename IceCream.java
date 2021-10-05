class IceCream
{
	String flavor;
	IceColor color;
	float temp;
	String type;
	Brand brand;
	
	IceCream(float temp)
	{
		this.temp=temp;
	}
    IceCream(float temp,String flavor,IceColor color)
	{
		this(temp);
		this.flavor=flavor;
		this.color=color;
	}	
	
}