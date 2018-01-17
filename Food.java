public class Food extends Item{
    public Food(){
	price = 0; //Food cannot sell
    }
    // should we add an overloaded constructor?
    
    //should be similar for Drink, except the type becomes Drink, and value added to "Hunger" becomes "Thirst"
    public String toString(){
      String s ="";
      s += super.toString();// will this work?
      s += "\nType: Food";
      s += "\nNutrition Value: " + foodVal;
      s += "\nHydration Value: " + drinkVal;
      return s;
    }
    
}

