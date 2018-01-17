public class Drink extends Item{
    public Drink()
    {
	price = 0;
	foodVal = 0;
    }
    public Drink(String n, int c, int d, int drink)
    {
	this();
	name = n;
	cost = c;
	deliveryTime = d;
	drinkVal = drink;
    }
    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\tType: Drink";
      s += "\tHydration Value:" + foodVal;
      s += "\n";
      return s;
    }
}
