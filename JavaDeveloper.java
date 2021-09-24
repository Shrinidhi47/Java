class JavaDeveloper
{
	public static void javaDeveloperNames(String[] nayi)
	{
	for(int i=0;i<nayi.length;i++)
	{
		System.out.println(nayi[i]);
	}
	}	
	public static void getMLANames(String[] names)
	{
		for(int x=0;x<names.length;x++)
		{
			System.out.println(names[x]);
		}
	}
	public static void getHotelNames(String[] dog)
	{
		for(int k=0;k<dog.length;k++)
		{
			System.out.println(dog[k]);
		}
	}
	public static void getmallNames(String[] app)
	{
		for(int y=0;y<app.length;y++)
		{
			System.out.println(app[y]);
		}
	}
	public static void gettempleNames(String[] temp)
	{
		for(int s=0;s<temp.length;s++)
		{
			System.out.println(temp[s]);
		}
	}
	public static void main(String[] args)
	{
		String[] name={"Shrinidhi","Vineeth","Sushma","Sneha","Shrilaxmi","Renu","Niranjan",
		"Akshay","Vasant","Sanjana","Kavya","Akshata","Pampa","Soumya","Varsha"};
		javaDeveloperNames(name);
		System.out.println("===========================");
		
		String[] mlaNames={"Shriramulu","Halappa","Ramanna","Somanna","Linganna","Poornima",
		"Jagadish Shetter","Sunil Kumar","S Raghu","P Rajeev"};
		getMLANames(mlaNames);
		System.out.println("===========================");
		
		String[] hotelNames={"Dharwad daba","Gokul Cafe","Cuboidal Cafe","Durga","Ramakrishna","Barbeques",
		"Saptagiri","kanavali","Panchavati","SukhSagar","Peace cafe"};
		getHotelNames(hotelNames);
		System.out.println("===========================");
		
		String[] mallNames={"Banglore Central","Gopalan","Meenakshi","Mantri Mall","Garuda Mall",
		"Orion Mall","Park Square","Phoenix Market City","UB City","Inorbit Mall"};
		getmallNames(mallNames);
		System.out.println("===========================");
		
		String[] templeNames={"Banashankari Temple","Venkateshwara Temple","Ganesh Temple",
		"Tarakeshwara Temple","Someshwara Temple","Anjaneyaswamy Temple","Nandi Temple",
		"Shiva Temple","Gavi Gangadhareshwara Temple","Sri Omkareshwara Temple"};
		gettempleNames(templeNames);
		System.out.println("===========================");
	}
	
}