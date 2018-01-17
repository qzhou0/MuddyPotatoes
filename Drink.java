public class Drink extends Item{
<<<<<<< HEAD
    public Drink()
    {
	price = 0;
	foodVal = 0;
=======
    public Drink() {
	price = 0;
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
    }

    public String toString(){
      String s = "";
      s += super.toString();// will this work?
<<<<<<< HEAD
      s += "\tType: Drink";
      s += "\tValue added to thirst:" + foodVal;
      s += "\n";
=======
      s += "\nType: Drink";
      s += "\nNutrition Value: " + foodVal;
      s += "\nHydration Value: " + drinkVal;
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
      return s;
    }
}
