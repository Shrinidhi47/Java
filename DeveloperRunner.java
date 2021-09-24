class DeveloperRunner
{
	public static void main(String[] args)
	{
		Developer develop=new Developer();
		develop.name="Shrinidhi";
		develop.role="Associate Engineer";
		develop.salary=50000f;
		System.out.println(develop.name +"\n"+ develop.role +"\n"+ develop.salary);
		
		Developer develop1=new Developer();
		develop1.name="Vineeth";
		develop1.role="Software Developer";
		develop1.salary=45000f;
		System.out.println(develop1.name +"\n"+ develop1.role +"\n"+ develop1.salary);
		
		Developer develop2=new Developer();
		develop2.name="Kiran";
		develop2.role="Process Engineer";
		develop2.salary=50000f;
		System.out.println(develop2.name +"\n"+ develop2.role +"\n"+ develop2.salary);
		
		Developer develop3=new Developer();
		develop3.name="Sanjana";
		develop3.role="Product Engineer";
		develop3.salary=100000f;
		System.out.println(develop3.name +"\n"+ develop3.role +"\n"+ develop3.salary);
		
		Developer develop4=new Developer();
		develop4.name="Kavya";
		develop4.role="Senior Software Developer";
		develop4.salary=150000f;
		System.out.println(develop4.name +"\n"+ develop4.role +"\n"+ develop4.salary);
		
	}
}