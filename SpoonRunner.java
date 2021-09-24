class SpoonRunner
{
	public static void main(String[] args)
	{
		Spoon spoo=new Spoon();
		spoo.type="Silver";
		spoo.weight=5.5f;
		spoo.color="Silver";
		System.out.println(spoo.type +"\n"+ spoo.weight +"\n"+ spoo.color);
		
		Spoon spoo1=new Spoon();
		spoo1.type="Wooden";
		spoo1.weight=2.5f;
		spoo1.color="Brown";
		System.out.println(spoo1.type +"\n"+ spoo.weight +"\n"+ spoo.color);
		
		Spoon spoo2=new Spoon();
		spoo2.type="Gold";
		spoo2.weight=1f;
		spoo2.color="gold";
		System.out.println(spoo2.type +"\n"+ spoo2.weight +"\n"+ spoo2.color);
		
		Spoon spoo3=new Spoon();
		spoo3.type="Steel";
		spoo3.weight=3f;
		spoo3.color="Silver";
		System.out.println(spoo3.type +"\n"+ spoo3.weight +"\n"+ spoo3.color);
		
		Spoon spoo4=new Spoon();
		spoo4.type="Plastic";
		spoo4.weight=0.5f;
		spoo4.color="Red";
		System.out.println(spoo4.type +"\n"+ spoo4.weight +"\n"+ spoo4.color);
		
	}
}