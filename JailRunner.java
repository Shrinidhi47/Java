class JailRunner
{
	public static void main(String[] ganesha)
	{
		String location="Ballary";
		String name="Ballary Central Jail";
		int yearOfConstruction=1872;
		Jail jail=new Jail(location,name,yearofConstruction);
		System.out.println(jail.location,jail.name,jail.yearOfConstruction,
		jail.noOfCells,jail.noOfCriminals,jail.strict,jail.personnel,jail.areaInAcres);
		System.out.println(location=jail.location);
	}
}