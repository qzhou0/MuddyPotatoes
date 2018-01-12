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
    /*
    public int getDelTime(){
	return deliveryTime;
    }
    
    public int getCost(){
	return cost;
    }
*/
	/* WHAT!!?!?! user cant choose what they pay, works against entire idea
	Re: What shop has the custumer choosing what price they pay? The price is set by the shops
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
    */
}
    
