import java.io.*;
import java.util.*;

public class Woo {
    // instance variables
    public final static int MAX_DURATION = 10; // 10 days

    //Should some variables be static or called from an Object?

    private int day, time, balance, nutrition, hydration;
    private boolean gameOver;
    private ArrayList<Item> inventory;
    //private ArrayList<Item> deliveringItems; //should we separate items that are in a delivery for easiness's sake in updating the delivery time?
    private InputStreamReader isr;
    private BufferedReader in;

    // default constructor
    public Woo() {
	day = 1;
	time = 0;
	balance = (int) (Math.random() * 101) + 100;
	nutrition = 80;
	hydration = 80;
	isr = new InputStreamReader (System.in);
	in = new BufferedReader (isr);
    }

    public int locate (Item item) {
	for (int i = 0; i < inventory.size(); i++){
	    if (inventory.get(i).equals(item)) {
		return i;
	    }
	}
	return -1;
    }

    public static void buy (Item item) {
	
    }

    public static void sell (Item item) {

    }

    public String getInfo() {
	String  s = "Day: " + day;
	s += "\nTime: " + time;
	s += "\nBalance: " + balance;
	s += "\nNutrition Lvl: " + nutrition;
	s += "\nHydration Lvl: " + hydration;
	return s;
    }

    public static String getInventory() {
	String s = "";
	// insert code here
	return s;
    }

    public void nextDay() {
	// update instance variables
      	day += 1;
	time = 0;
      	nutrition -= 50;
      	hydration -= 50;
      	
      	if ((day > 10) || (nutrition <= 0) || (hydration <= 0)) {
	    gameOver == true;
	    return;
	}
	playDay();
    }
    
    public void playDay(){
	if (time == 24) {
	    nextDay();
	}
	
	// if the item being delivered has arrived, it gives a notification message to the user and the user will be given a the choice of viewing their information or not
	// insert code here (notification)
	// System.out.println("Your " + item + " has arrived.\n"
	// if (item == unconsumable) {
	//     int x;
	//     String retString = "Would you like to view your inventory?\n";
	//     retString += "\t1: Yes\n";
	//     retString += "\t2: No\n";
	//     retString += "Selection: ";

	//     try {
	// 	x = Integer.parseInt(in.readLine());
	//     }
	//     catch (IOException e) {}

	//     if (x == 1) {
	// 	getInventory();
	//     }
	// }
	// else {
	//     int x;
	//     String retString = "Would you like to view your user information?\n";
	//     retString += "\t1: Yes\n";
	//     retString += "\t2: No\n";
	//     retString += "Selection: ";

	//     try {
	// 	x = Integer.parseInt(in.readLine());
	//     }
	//     catch (IOException e) {}

	//     if (x == 1) {
	// 	getInfo();
	//     }
	// }

	int command;
	String c = "\n Choose your command: \n";
	c += "\t1: View User Information\n";
	c += "\t2: View Delivery Status\n";
	c += "\t3: View Inventory\n";
	c += "\t4: Go To Store\n";
	c += "\t5: Update Time\n";
	c += "Selection: ";
	System.out.println(c);

	try {
	    command = Integer.parseInt(in.readLine());
	}
	catch (IOException e) {}
	
	while (c != 5) {
	    if (c == 1) {
		System.out.println(getInfo());
	    }
	    else if (c == 2) {
		// insert code here (Delivery Status)
	    }
	    else if (c == 3) {
		getInventory();
	    }
	    else if (c == 4) {
		// insert code here --> goes to store() where you can decide whether you are buying or selling items
	    }
	    else {
		System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	    }
	    time += 3;
	    nutrition -= 10;
	    hydration -= 10;

	    if ((nutrition <= 0) || (hydration <= 0)) {
		gameOver == true;
		return;
	    }

	    playDay();
	}
    }
	
    public static void main (String[] args) {
	Woo test = new Woo();
	
        while (test.gameStatus == 0) {
	    test.();
	}

	playDay();
	
	if (test.day > MAX_DURATION) {
	    System.out.println("\n~~~ CONGRADULATIONS! YOU WON THE GAME! ~~~");  
	}
	else {
	    System.out.println("\n~~~ SORRY, YOU HAVE DIED AND LOST THE GAME. ~~~");
	}
    }
}
