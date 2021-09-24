class MedicineDetails
{
	public static float TotalPrice(String name,String company,float price,int quantity)
	{
		System.out.println("Medicine Details");
		System.out.println(name+ "\n" +company+ "\n" +price+ "\n" +quantity);
		float total=quantity*price;
		return total;
	}
	public static void main(String[] mad)
	{
		float price=Float.parseFloat(mad[2]);
		int quantity=Integer.parseInt(mad[3]);
		float total=TotalPrice(mad[0],mad[1],price,quantity);
		System.out.println("Total Price"+total);
	}
}