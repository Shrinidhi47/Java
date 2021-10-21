package com.xworkz.crudOperator.crud;

public class CrudExamples 
{
  private String[] chocolates=new String[5];
  private String[] gins=new String[5];
  private String[] restaurants=new String[5];
  private String[] resorts=new String[5];
  private String[] islands=new String[5];
  private String[] waterfalls=new String[5];
  private int counter=0;
  
  //chocolate
  
  public void addChocolate(String name)
  {
	System.out.println("Chocolate name ".concat(name));
	if(this.counter<this.chocolates.length)
	{
		this.chocolates[this.counter]=name;
		this.counter++;
	}
	else
	{
		System.err.println("Chocolate Array is full");
	}
 }
  public void displayChocolate()
  {
	  System.out.println("Elements of chocolate");
	  for(int i=0;i<chocolates.length;i++)
	  {
		  System.out.println(chocolates[i]);
	  }
  }
  
  public void addGin(String name)
  {
	  System.out.println("Gin Names ".concat(name));
	  if(this.counter<this.gins.length)
	  {
		  this.gins[this.counter]=name;
		  counter++;
	  }
	  else
	  {
		  System.err.println("Gin array is full");
	  }
  }
  
  public void ginDisplay()
  {
	  System.out.println("Elements of Gin");
	  for(int x=0;x<gins.length;x++)
	  {
		  System.out.println(gins[x]);
	  }
  }
  
  //Restaurant
  public void addRestaurents(String name)
  {
	  System.out.println("Restaurent Names ".concat(name));
	  if(this.counter<this.restaurants.length)
	  {
		  this.restaurants[this.counter]=name;
		  this.counter++;
	  }
	  else
	  {
		  System.err.println("Restaurant array is full");
	  }
  }
  
  public void restaurantDisplay()
  {
	  for(int v=0;v<restaurants.length;v++)
	  {
		  System.out.println(restaurants[v]);
	  }
  }
  
  //Resort
  public void addResorts(String name)
  {
	System.out.println("Resort name ".concat(name));
	if(this.counter<this.resorts.length)
	{
		this.resorts[this.counter]=name;
		this.counter++;
	}
	else
	{
		System.err.println("Resort Array is full");
	}
 }
  public void resortDisplay()
  {
	  for(int n=0;n<resorts.length;n++)
	  {
		  System.out.println(resorts[n]);
	  }
  }
  
  public void addIslands(String name)
  {
	System.out.println("Island name ".concat(name));
	if(this.counter<this.islands.length)
	{
		this.islands[this.counter]=name;
		this.counter++;
	}
	else
	{
		System.err.println("Island Array is full");
	}
 }
  public void islandDisplay()
  {
	  for(int p=0;p<islands.length;p++)
	  {
		  System.out.println(islands[p]);
	  }
  }
  
  
}
