enum TicketPrice
{
 BOX(150,0.0f),BALCONY(100,1.0f),GANDHI(30,0.0f),MIDDLE(50,0.5f);
 int price;
 float tax;
 
 TicketPrice(int price,float tax)
 {
	 this.price=price;
	 this.tax=tax;
 }
 
}