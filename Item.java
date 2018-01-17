public class  Item{
    // instance variables
    protected int deliveryTime, cost, foodVal, drinkVal, price; // to determine info in shop and inventories; price is selleable value
    protected String name;

    // methods
    // default constructor
    public Item(){
	deliveryTime = 0;
	cost = 0;
	foodVal = 0;
	drinkVal = 0;
	price = 0;
    }

    public String toString(){
	String retVal = "";
<<<<<<< HEAD
	retVal += "Name: " + name;
	retVal += "\tCost:" + cost;
	retVal += "\tTime of Delivery Left:" + deliveryTime;
=======
	retVal += "\nName: " + name;
	retVal += "\nCost: " + cost;
	retVal += "\nDelivery Time Left:" + deliveryTime;
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
	return retVal;
    }

    // accessors
    public int getDelTime(){
	return deliveryTime;
    }
    
    public int getCost(){
	return cost;
    }
    public int getPrice(){
	return price;
    }
    
    public int getFoodVal() {
<<<<<<< HEAD
	
=======
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
	return foodVal;
    }
    
    public int getDrinkVal() {
<<<<<<< HEAD
	
=======
>>>>>>> 61c3d0f22d2ccc8f505a3e411057794e43bf9e02
	return drinkVal;
    }
    
    // mutators 
    public int changeDelTime (int change) {
	// to be used for user (or shop) to change deliveryTime
	int n = deliveryTime;
	deliveryTime += change;
	return n; // return old value 
    }
    
    public int changeCost (int change) {
	//to be used for shops to change cost
	int n = cost;
	cost += change;
	return n;
    }
    public int changePrice (int change) {
	//used for shops to change the price they pay for
	int n = price;
	price += change;
	return n;
    }
}
    
