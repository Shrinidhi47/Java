class CoronaPatients
{
	public static void getPatientDetails(String name,int age,String from,boolean admitted,String admittedTo,int infectedDays,boolean alive,boolean discharged)
	{
		System.out.println("Corona Patient Details");
		System.out.println(name+ "\n"+age+ "\n" +from+ "\n" +admitted+ "\n" +admittedTo+ "\n" +infectedDays+ "\n" +alive+ "\n" +discharged);
	}
	public static void main(String[] shri)
	{
		int age=Integer.parseInt(shri[1]);
		boolean admitted=Boolean.parseBoolean(shri[3]);
		int infectedDays=Integer.parseInt(shri[5]);
		boolean alive=Boolean.parseBoolean(shri[6]);
		boolean discharged=Boolean.parseBoolean(shri[7]);
		getPatientDetails(shri[0],age,shri[2],admitted,shri[4],infectedDays,alive,discharged);
	}
}