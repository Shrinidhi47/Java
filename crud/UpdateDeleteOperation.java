package com.xworkz.crudOperator.crud;

public class UpdateDeleteOperation 
{
	private String[] brandName=new String[7];
	private int a;
	
	public void addCooldrinks(String name)
	{
		System.out.println("CoolDrinks ".concat(name));
		if(this.a<brandName.length)
		{
			this.brandName[this.a++]=name;
		}
		else
		{
			System.err.println("CoolDrinks Array is full");
		}
	}
	public void displayCoolDrinks()
	{
		for(int i=0;i<brandName.length;i++)
		{
			System.out.println(brandName[i]);
		}
	}
	
	public void delete(int jalebi)
	{
		if(jalebi>=0 && jalebi<brandName.length)
		{
			this.brandName[jalebi]=null;
		}	
		else
		{
			System.err.println("Cannot Delete");	
		}
	}
	
	public void update(int jamoon,String ref)
	{
		System.out.println("updated string");
		if(jamoon>=0 && jamoon<brandName.length)
		{
			this.brandName[jamoon]=ref;
		}
		else
		{
			System.err.println("Cannot Update");
		}
	}	
}
