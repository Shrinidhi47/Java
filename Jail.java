class Jail{
String location;
String name;
int noOfCells;
int personnel;
int noOfCriminals;
float areaInAcres;
int yearOfConstruction;
boolean strict;

Jail(String location,String name,int yearOfConstruction)
{
	this.location=location;
	this.name=name;
	this.yearOfConstruction=yearOfConstruction;
	this.noOfCells=50;
	this.personnel=50;
	this.noOfCriminals=100;
	System.out.println("created with String String int");
	System.out.println(this.noOfCells==this.personnel);
			
}
}