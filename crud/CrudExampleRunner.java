package com.xworkz.crudOperator.crud;

public class CrudExampleRunner {

	public static void main(String[] args) 
	{
		CrudExamples chocolate=new CrudExamples();
		System.out.println("Invoking Chocolate");
		chocolate.addChocolate("Dairy Milk");
		chocolate.addChocolate("Munch");
		chocolate.addChocolate("Kit-Kat");
		chocolate.addChocolate("Milky Bar");
		chocolate.addChocolate("Kaccha Mango");
		chocolate.addChocolate("Melody");
		chocolate.displayChocolate();
		
		CrudExamples gin=new CrudExamples();
		System.out.println("Invoking gin");
		gin.addGin("aviation gin");
		gin.addGin("monkey 47");
		gin.addGin("Forts gin");
		gin.addGin("Gray whale gin");
		gin.addGin("Bar Hill");
		gin.addGin("Plymounth gin");
		gin.ginDisplay();
		
		CrudExamples res=new CrudExamples();
		System.out.println("Invoking Restaurent");
		res.addRestaurents("Spice Up");
		res.addRestaurents("Onesta");
		res.addRestaurents("Kesariya");
		res.addRestaurents("Malgudi Days");
		res.addRestaurents("Meghana Foods");
		res.addRestaurents("Oberoi");
		res.restaurantDisplay();
		
		CrudExamples sort=new CrudExamples();
		System.out.println("Invoking Resort");
		sort.addResorts("Malgudi Farms");
		sort.addResorts("Taj West End");
		sort.addResorts("Radiant Resort");
		sort.addResorts("Royal Orchid Resort");
		sort.addResorts("Vistar Resort");
		sort.addResorts("Ocean Perl");
		sort.resortDisplay();
		
		CrudExamples land=new CrudExamples();
		System.out.println("Invoking Island");
		land.addIslands("Nicobar");
		land.addIslands("Majuli");
		land.addIslands("Havelock");
		land.addIslands("Barren");
		land.addIslands("Lakshadweep");
		land.addIslands("Golden");
		land.islandDisplay();
		
		
		
		
		
	}

}
