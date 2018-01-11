public class  Item{
    // ----------instance variables-------------
    private int deliveryTime, cost, healthVal, price;
    //           to determine info in shop and inventories, health val is effect on thirst/hunger determined by subclasses; price is selleable value
    private String name;

    // --------------methods -----------------
    public Item(){
    }
    public String toString(){
	String retVal = "";
	return retVal;
    }
    //accessors
    
    public int getDelTime(){
	return deliveryTime;
    }
    
    public int getCost(){
	return cost;
    }

    //mutators
    public int changeDelTime(int change){// to be used for user to change deliveryTime or shop manage items
	int i = deliveryTime;
	deliveryTime+= change;
	return i; // return old value 
}
    public
