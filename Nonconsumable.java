public class Nonconsumable extends Item{

    public Nonconsumable(){
	drinkVal = 0;
	foodVal = 0;
	//healthVal = 0;
    }

    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\nType: Nonconsumable";
      s += "\nPrice that can be sold at:" + price;
      s += "\n";
      return s;
    }
}

