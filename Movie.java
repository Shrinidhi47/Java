class Movie{
	public static String[] getActorsByMovieName(String MovieName)
	{
		System.out.println("invoked getActorsByMovieName, arg passed"+MovieName);
		if(MovieName.equals("KGF"))
		{
			System.out.println("KGF is Matched");
			String hero="Yash";
			String heroin="Shrinidhi";
			String narrator="AnanthNag";
			String[] actors={hero,heroin,narrator};
			return actors;
		}
		else{
			System.out.println("Movie is not KGF");
		}
		return null;
	}
	
}