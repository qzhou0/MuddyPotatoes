public class Food extends Item{
    public Food(){
	price = 0;//Food cannot sell
	drinkVal = 0;
    }
    // should we add an overloaded constructor?
    
    //should be similar for Drink, except the type becomes Drink, and value added to "Hunger" becomes "Thirst"
    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\tType: Food";
      s += "\tValue added to hunger:" + foodVal;
      s += "\n";
      return s;
    }

}

