class LaboratoryRunner
{
	public static void main(String[] shiva)
	{
		String name="Phy";
		String location="1st Floor";
		int noOfRooms=2;
		
		Laboratory lab=new Laboratory();
		System.out.println(lab.name);
		System.out.println(lab.location);
		System.out.println(lab.noOfRooms);
		lab.type=LabType.CS;
		System.out.println(lab.type);
		
		
	}
}