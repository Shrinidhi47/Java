class MobileDetails
{
	public static float GetMobileDetails(String brand,String color,String model,float price,int quantity,float emi,String country)
	{
		System.out.println("Mobile Details");
		System.out.println(brand +"\n"+ color +"\n"+ model +"\n"+ price +"\n"+ quantity+ "\n" +emi+ "\n" +country);
		float total=quantity*price;
		return total;
	}
	public static void main(String[] cut)
	{
		float price=Float.parseFloat(cut[3]);
		int quantity=Integer.parseInt(cut[4]);
		float emi=Float.parseFloat(cut[5]);
		float total=GetMobileDetails(cut[0],cut[1],cut[2],price,quantity,emi,cut[6]);
		System.out.println("Total Price"+total);
	}
}