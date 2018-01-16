public class Nonconsumable extends Item{

    public Nonconsumable(){
	healthVal = 0;
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

}
