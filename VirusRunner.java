class VirusRunner
{
	public static void main(String[] args)
	{
		Virus vi=new Virus();
		String v1=vi.name;
		System.out.println(v1);
		
		boolean v2=vi.infectious;
		System.out.println(v2);
		
		boolean v3=vi.attached;
		System.out.println(v3);
	}
}