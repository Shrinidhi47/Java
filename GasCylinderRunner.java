class GasCylinderRunner
{
	public static void main(String[] args)
	{
		float price=887.50f;
		float weight=14.2f;
		int cylinderNo=567;
		
		GasCylinder gas=new GasCylinder(price,weight,cylinderNo);
		System.out.println(gas.price+"\n"+gas.weight+"\n"+gas.cylinderNo);
		gas.size=GasSize.SMALL;
		System.out.println(gas.size);
		gas.company=GasCompany.BHARAT;
		System.out.println(gas.company);
	}
}