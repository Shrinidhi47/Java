package com.xworkz.crudOperator.crud;

public class DeleteRunner {

	public static void main(String[] args) 
	{
		UpdateDeleteOperation op=new UpdateDeleteOperation();
		System.out.println("Invoking CoolDrinks");
		op.addCooldrinks("7 up");
		op.addCooldrinks("Pepsi");
		op.addCooldrinks("Maaza");
		op.addCooldrinks("Dew");
		op.addCooldrinks("Limca");
		op.addCooldrinks("Mirinda");
		op.addCooldrinks("Sprite");
		
		op.delete(-1);
		op.update(2,"Zynga");
		op.displayCoolDrinks();
		
		
	}

}
