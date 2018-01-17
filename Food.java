public class Food extends Item{
    public Food(){
	price = 0;//Food cannot sell
	drinkVal = 0;
    }
    public Food(String n, int c, int d, int food)
    {
	this();
	name = n;
	cost = c;
	deliveryTime = d;
	foodVal = food;
    }
    // should we add an overloaded constructor?
    
    //should be similar for Drink, except the type becomes Drink, and value added to "Hunger" becomes "Thirst"
    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\tType: Food";
      s += "\tNutrition Value:" + foodVal;
      s += "\n";
      return s;
    }

}

