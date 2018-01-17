public class  Item{
    // ----------instance variables-------------
    protected int deliveryTime, cost, foodVal, drinkVal, price;
    //           to determine info in shop and inventories, health val is effect on thirst/hunger determined by subclasses; price is selleable value
    protected String name;

    // --------------methods -----------------
    public Item(){
	// ??? what should we add here
    }
    public String toString(){
	String retVal = "";
	retVal += "Name: " + name;
	retVal += "\nCost:" + cost;
	retVal += "Time of Delivery Left:" + deliveryTime;
	return retVal;
    }
    //accessors
    
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
	// insert code here
	return 0;
    }

    public int getDrinkVal() {
	// insert code here
	return 0;
    }

    //mutators 
    public int changeDelTime(int change){// to be used for user (or shop) to change deliveryTime
	int n = deliveryTime;
	deliveryTime+= change;
	return n; // return old value 
    }
    public int changeCost(int change){//to be used for shops to change cost
	int n = cost;
	cost += change;
	return n;
    }
    public int changePrice(int change){//used for shops to change the price they pay for
	int n = price;
	price += change;
	return n;
    }
}
    
