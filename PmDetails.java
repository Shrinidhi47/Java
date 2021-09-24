class PmDetails{
	public static void getPmDetails(String name,String countryname,int age,boolean married,boolean alive,int duration)
	{
		System.out.println("Prime Minister Details");
		System.out.println(name+ "\n" +countryname+ "\n" +age+ "\n" +married+ "\n" +alive+ "\n" +duration);
		}
	public static void main(String[] args)
	{
		int age=Integer.parseInt(args[2]);
		boolean married=Boolean.parseBoolean(args[3]);
		boolean alive=Boolean.parseBoolean(args[4]);
		int duration=Integer.parseInt(args[5]);
		getPmDetails(args[0],args[1],age,married,alive,duration);
	}
}
