class SamosaRunner{
	public static void main(String[] chakli)
	{
		float cost=20.0f;
		boolean taste=true;
		
		Samosa samosa=new Samosa(cost,taste);
		System.out.println(samosa.cost + "\n"+samosa.taste +"\n"+ samosa.size +  "\n"+samosa.ingredients);
	    
        String[] ing={"Potato","Onion","Chilli","Corinder","Salt","oil","Maida"};
		
        Samosa samosa1=new Samosa(15.0f,false,SamosaSize.SMALL,ing);
		String inc=samosa1.ingredients[0];
		System.out.println(inc);
        System.out.println(samosa1.cost + "\n"+samosa1.taste +"\n"+ samosa1.size + "\n"+samosa1.ingredients);		
		
	}
}