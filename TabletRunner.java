class TabletRunner
{
	public static void main(String[] args)
	{
		Tablet tab=new Tablet();
		tab.name="paracetamol";
		tab.weight=0.5f;
		tab.color="White";
		System.out.println(tab.name +"\n"+ tab.weight +"\n"+ tab.color);
		
		Tablet tab1=new Tablet();
		tab1.name="Dolo650";
		tab1.weight=0.45f;
		tab1.color="White";
		System.out.println(tab1.name +"\n"+ tab1.weight +"\n"+ tab1.color);
		
		Tablet tab2=new Tablet();
		tab2.name="Crosin";
		tab2.weight=0.4f;
		tab2.color="White";
		System.out.println(tab2.name +"\n"+ tab2.weight +"\n"+ tab2.color);
		
		Tablet tab3=new Tablet();
		tab3.name="Anacin";
		tab3.weight=0.6f;
		tab3.color="blue";
		System.out.println(tab3.name +"\n"+ tab3.weight +"\n"+ tab3.color);
		
		Tablet tab4=new Tablet();
		tab4.name="Aciloc RD";
		tab4.weight=0.5f;
		tab4.color="blue";
		System.out.println(tab4.name +"\n"+ tab4.weight +"\n"+ tab4.color);
			
	}
}