class MatchBoxRunner
{
	public static void main(String[] hanuman)
	{
		String brand="Cycle";
		int noOfSticks=300;
		boolean empty=false;
		MatchBox box=new MatchBox(brand,noOfSticks,empty);
		System.out.println(box.brand+"\n"+box.noOfSticks+"\n"+ box.empty);
		box.size=MatchSize.SMALL;
		System.out.println(box.size);
	}
}