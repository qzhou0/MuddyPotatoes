public class Nonconsumable extends Item{

    public Nonconsumable(){
	drinkVal = 0;
	foodVal = 0;
	//healthVal = 0;
    }
    public Nonconsumable(String n, int c, int d, int p)
    {
	this();
	name = n;
	cost = c;
	deliveryTime = d;
	price = p;
    }
    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\tType: Nonconsumable";
      s += "\tPrice that can be sold at:" + price;
      s += "\n";
      return s;
    }
}

