class Samosa
{
float cost;
boolean taste;
String[] ingredients;
SamosaSize size;

Samosa(float cost,boolean taste)
{
	System.out.println("Created with float,boolean");
	this.cost=cost;
	this.taste=taste;
}
Samosa(SamosaSize size,String[] ingredients)
{
	System.out.println("Created with samosasize,String[]");
	this.size=size;
	this.ingredients=ingredients;
}
Samosa(float cost,boolean taste,SamosaSize size,String[] ingredients)
{
this(cost,taste);
this.size=size;
this.ingredients=ingredients;
System.out.println("Created using float,boolean,samosasize,String[]");	
}
}