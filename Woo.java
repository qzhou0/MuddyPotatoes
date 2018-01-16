import java.io.*;
import java.util.*;

public class Woo {
    // instance variables
    public final static int MAX_DURATION = 10; // 10 days
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
	String  s = "\nDay: " + day;
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
      	day += 1;
      	nutrition -= 50;
      	hydration -= 50;
      	
      	if ((day > 10) || (nutrition <= 0) || (hydration <= 0)) {
	    gameOver = true;
	    return;
	}
	playDay();
    }
    
    public void playDay(){
	if (time == 24) {
	    time = 0;
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

	int command = 0;
	String c = "\nChoose your command: \n";
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
	
        if (command == 1) {
	    System.out.println(getInfo());
	}
	else if (command == 2) {
	    // insert code here (Delivery Status)
	    }
	else if (command == 3) {
	    getInventory();
	}
	else if (command == 4) {
	    int option = 0;
	    String o = "\nChoose your command: \n";
	    o += "\t1: Buy items\n";
	    o += "\t2: Sell items\n";
	    o += "\t3: Exit\n";
	    o += "Selection: ";
	    System.out.println(o);
	    
	    try {
		option = Integer.parseInt(in.readLine());
	    }
	    catch (IOException e) {}
	
	    if (option == 1) {
		//buy(); //fix buy()
	    }
	    else if (option == 2) {
		//sell(); //fix sell()
	    }
	    else if (option == 3) {
		return;
	    }
	    else {
		System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	    }
	}
	else if (command == 5) {
	    time += 3;
	    nutrition -= 10;
	    hydration -= 10;

	    if ((nutrition <= 0) || (hydration <= 0)) {
		gameOver = true;
		return;
	    }
	}
	else {
	    System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	}
    }
	
    public static void main (String[] args) {
	Woo test = new Woo();

	System.out.println("~~~ WELCOME TO JUAN'S DELIVERY CO.! ~~~\n");
	System.out.println("INSTRUCTIONS: Advance through the game and see whether you can survive for 10 days with your given balance. If your nutrition or hydration level reaches 0, you lose the game. However, you can buy items to replenish those levels and to sell for profit. By command, you can also view your user's information, your inventory, or update time. GOOD LUCK!\n");
	
	while (test.gameOver == false) {
	    test.playDay();
	}
	
	if (test.day > MAX_DURATION) {
	    System.out.println("\n~~~ CONGRADULATIONS! YOU WON THE GAME! ~~~");  
	}
	else {
	    System.out.println("\n~~~ SORRY, YOU HAVE DIED AND LOST THE GAME. ~~~");
	     }
    }
}
