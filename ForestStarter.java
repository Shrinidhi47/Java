class ForestStarter
{
 public static void main(String[] args)
 {
   boolean reserved=true;
   Forest forest=new Forest("Bannergatta","Bengaluru");
   System.out.println(forest.name +"\n" + forest.location);
   
   forest.state=new State("Karnataka",31,"Basavaraj Bommayi");
   State state=forest.state;
   System.out.println(state.name);
   System.out.println(state.noofdist);
   System.out.println(state.chiefminister);
  
   state.capitalcity=new CapitalCity("Banglore",2000000l,".....");
   CapitalCity capital=state.capitalcity;
   System.out.println(capital.name);
   System.out.println(capital.population);
   System.out.println(capital.famousfor);

 }
}