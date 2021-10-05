class IpodRunner
{
	public static void main(String[] args)
	{
		Ipod pod=new Ipod();
		pod.name="Apple";
		pod.price=100000f;
		pod.type="nano";
		pod.color="Red";
		pod.storage=IpodStorage.SIXTEEN;
		
		
		Ipod pod1=new Ipod();
		pod1.name="Sony";
		pod1.price=15000f;
		pod1.type="classic";
		pod1.color="blue";
		pod1.storage=IpodStorage.THIRTY_TWO;
		
		
		
		Ipod pod2=new Ipod();
		pod2.name="Samsung";
		pod2.price=20000;
		pod2.type="nano";
		pod2.color="Black";
		pod2.storage=IpodStorage.SIXTY_FOUR;
		
		
		pod.listenMusic();
		pod1.playGames();
		pod2.chatting();
		
		
		
		
	}
}