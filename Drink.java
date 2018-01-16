public class Drink extends Item{
    public Drink()
    { price = 0;
    }
    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\nType: Drink";
      s += "\nValue added to thirst:" + healthVal;
      s += "\n";
      return s;
    }
}
