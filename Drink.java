public class Drink extends Item{
    public Drink()
    {
	price = 0;
	foodVal = 0;
    }
    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\tType: Drink";
      s += "\tValue added to thirst:" + foodVal;
      s += "\n";
      return s;
    }
}
