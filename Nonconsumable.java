public class Nonconsumable extends Item{
    public Nonconsumable(){
	// is this necessary?
	NutritionVal = 0;
	HydrationVal = 0;
    }

    public String toString(){
	String s = "";
      s += super.toString(); // will this work?
      s += "\nType: Nonconsumable";
      s += "\nSelling Price:" + price;
      return s;
    }
}
