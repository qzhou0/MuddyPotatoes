public class Food extends Item{
    public Food(){
<<<<<<< HEAD
	price = 0;//Food cannot sell
	drinkVal = 0;
=======
	price = 0; //Food cannot sell
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
    }
    // should we add an overloaded constructor?
    
    public String toString(){
      String s = "";
      s += super.toString();// will this work?
<<<<<<< HEAD
      s += "\tType: Food";
      s += "\tValue added to hunger:" + foodVal;
      s += "\n";
=======
      s += "\nType: Food";
      s += "\nNutrition Value: " + foodVal;
      s += "\nHydration Value: " + drinkVal;
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
      return s;
    }
}

