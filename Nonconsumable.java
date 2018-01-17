public class Nonconsumable extends Item{
    public Nonconsumable(){
<<<<<<< HEAD
	drinkVal = 0;
	foodVal = 0;
	//healthVal = 0;
=======
	// is this necessary?
	NutritionVal = 0;
	HydrationVal = 0;
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
    }

    public String toString(){
	String s = "";
      s += super.toString(); // will this work?
      s += "\nType: Nonconsumable";
      s += "\nSelling Price:" + price;
      return s;
    }
}
