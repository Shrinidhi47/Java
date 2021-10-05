class NailCutterRunner
{
	public static void main(String[] args)
	{
		NailCutter cutter=new NailCutter();
		cutter.cost=50;
		cutter.color="Silver";
		cutter.size=CutterSize.MEDIUM;
		cutter.DirtCleaner=true;
		
		NailCutter cutter1=new NailCutter();
		cutter1.cost=30;
		cutter1.color="blue";
		cutter1.size=CutterSize.SMALL;
		cutter1.DirtCleaner=false;
		
		cutter.Cutting();
		cutter1.Shaping();
	}
	
}