public class Food extends Item{
    public Food(){
	price = 0; //Food cannot sell
    }
    // should we add an overloaded constructor?
    
    public String toString(){
      String s = "";
      s += super.toString();// will this work?
      s += "\nType: Food";
      s += "\nNutrition Value: " + foodVal;
      s += "\nHydration Value: " + drinkVal;
      return s;
    }
}

