import java.io.*;
import java.util.*;

public class Woo {
    // instance variables
    public final static int MAX_DURATION = 3;
    private int day, time, balance, nutrition, hydration;
    private boolean gameOver;
    private ArrayList<Item> inventory;
    private ArrayList<Item> deliveringItems; //should we separate items that are in a delivery for easiness's sake in updating the delivery time?
    private ArrayList<Item> basicItems;//list of basic Items
    private ArrayList<Item> storeInventory;    
    private InputStreamReader isr;
    private BufferedReader in;

    // default constructor
    public Woo() {
	day = 1;
	time = 0;
	balance = 100 + (int) (Math.random() * 15);
	nutrition = 100;
	hydration = 100;
	inventory = new ArrayList<Item>();
	storeInventory = new ArrayList<Item>();
	deliveringItems = new ArrayList<Item>();
	isr = new InputStreamReader (System.in);
	in = new BufferedReader (isr);
	basicItems = new ArrayList<Item>();

	Food bread = new Food("bread",5,2,5);
	basicItems.add(bread);
	Drink water = new Drink("water", 3,1,5);
	basicItems.add(water);
	Nonconsumable paper= new Nonconsumable("paper",3,1,5);
	basicItems.add(paper);
		       
    }

    public void thief(){
	String s = "";
	int x = (int) (Math.random() * (balance / 2));
	if (x > 0) {
	    balance -= x;
	    s += "~~~ YOU HAVE BEEN ROBBED OF " + x + " DOLLARS! ~~~";
	    s += "Would you like to view your user information?\n";
	    s += "\t1: Yes\n";
	    s += "\t2: No\n";
	    s += "Selection: ";
	    System.out.println(s);
	    
	    int o = 0;
	    try {
		o = Integer.parseInt(in.readLine());
	    }
	    catch (Exception e) {
	    }
	    
	    if (o == 1) {
		System.out.println(getInfo());
	    }
	    else if (o == 2) {
		
	    }
	    else {
		System.out.println("Sorry, there was an error in running your command.");
	    }
	}
    }
    
    public int locate (ArrayList<Item> I, Item item) {
	for (int i = 0; i < I.size(); i++){
	    if (I.get(i).equals(item)) {
		return i;
	    }
	}
	return -1;
    }

    public void buy (Item item) {
	balance -= item.cost;
	deliveringItems.add(storeInventory.remove(locate(storeInventory,item)));	
    }

    public void sell (Item item) {
	balance += item.price;
	deliveringItems.remove(storeInventory.add(item));
    }

    public String getInfo() {
	String  s = "\nDay: " + day;
	s += "\nTime: " + time;
	s += "\nBalance: " + balance;
	s += "\nNutrition Lvl: " + nutrition;
	s += "\nHydration Lvl: " + hydration;
	return s;
    }

    public String getInventory() { //need improvement
	String s = "";
	if (inventory.size() == 0){
	    s = "Your inventory is empty";
	}
	else {
	    for (Item I : inventory){
		s += I;
	    }
	}
	return s;
    }
    
    public String getDelStatus(){ //need improvement
	String s = "";
	if (deliveringItems.size() == 0){
	    s = "Nothing is to be delivered";
	}
	else{
	    for (Item I : deliveringItems){
		s+= I;
	    }
	}
	return s;
    }
    
    public void store(){
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
	 catch (Exception e) {
	 }
	     
	 if (option == 1) {//buy
	     String s ="";
	     int b = -2;
	     s += "Items in sale:";
	     for (int i = 0; i < storeInventory.size(); i++){
		 s += "\n\t" + i + ": " + storeInventory.get(i);
	     }
	     s += "\n\t-1: Exit\n";//we must use -1 because zero could be an index
	     s += "Please select an Item to buy.\nSelection: ";
	     System.out.println(s);
 
	     try {
		 b = Integer.parseInt(in.readLine());
	     }
	     catch (Exception e) {}
	     
	     if (b > -1 && b < storeInventory.size() && storeInventory.get(b).getCost()<balance){
		 buy(storeInventory.get(b));
	     }
	     else if (b == -1){
		 // we don't need a break
	     }
	     else {
		 System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	     }
	 }
	 else if (option == 2) {
	     String s = "";
	     int m = -2;
	     s += "Items to sell:";
	     for (int i = 0; i < inventory.size(); i++){
		 if (inventory.get(i) instanceof Nonconsumable){
		     s += "\n\t" + i + ": " + storeInventory.get(i) + storeInventory.get(i).getPrice();
		 }
	     }
	     s += "\n\t-1: Return\n";
	     s += "Please select an Item to sell.\nSelection: ";
	     System.out.println(s);
		 
	     try {
		 m = Integer.parseInt(in.readLine());
	     }
	     catch (Exception e) {}

	     if (m > -1 && m <storeInventory.size()){
		 sell(inventory.get(m));
	     }
	     else if (m == -1){
	       
	     }
	     else{
		 System.out.println("Sorry, there was an error in running your command.");
	     }
	 }
	 else if (option == 3) {
	     return;
	 }
	 else {
	     System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	 }
	 store();//recursively runs function in case the user put a wrong input or wants to do more than one thing
    }
    
    public void nextDay() {
	day += 1;
      	nutrition -= 50;
      	hydration -= 50;
      	
      	if ((day > MAX_DURATION) || (nutrition <= 0) || (hydration <= 0)) {
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
	// System.out.println("Your " + item + " has arrived.\n");
	// if (item == unconsumable) {
	//     int x = 0;
	//     String retString = "Would you like to view your inventory?\n";
	//     retString += "\t1: Yes\n";
	//     retString += "\t2: No\n";
	//     retString += "Selection: ";
	
	// 	try {
	// 	    x = Integer.parseInt(in.readLine());
	// 	}
	// 	catch (IOException e) {}
		
	// 	if (x == 1) {
	// 	    getInventory();
	// 	}
	// 	else if (x == 2) {
	// 	    break;
	// 	}
	// 	else {
	// 	    System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	// 	    System.out.println(s);
	//          try {
	// 	    x = Integer.parseInt(in.readLine());
	// 	}
	// 	catch (IOException e) {}
	
	// 	if (x == 1) {
	// 	    getInventory();
	// 	}
	// 	else if (x == 2) {
	// 	    break;
	// 	}
	// 	
	// 	}
	// }
	// else {
	//     int x = 0;
	//     String retString = "Would you like to view your user information?\n";
	//     retString += "\t1: Yes\n";
	//     retString += "\t2: No\n";
	//     retString += "Selection: ";
		
	// 	try {
	// 	    x = Integer.parseInt(in.readLine());
	// 	}
	// 	catch (IOException e) {}
		
	// 	if (x == 1) {
	// 	    getInfo();    
	// 	}
	// 	else if (x == 2) {
	// 	    break;
	// 	}
	// 	else {
	// 	    System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	// 	    System.out.println(s);
	// 	try {
	// 	    x = Integer.parseInt(in.readLine());
	// 	}
	// 	catch (IOException e) {}
		
	// 	if (x == 1) {
	// 	    getInfo();    
	// 	}
	// 	else if (x == 2) {
	// 	    break;
	// 	}
	// 	}
        // }
	
	int command = 0;
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
	catch (Exception e) {
	    System.out.println("Sorry, there was an error in running your command.");}
	    
	if (command == 1) {
	    System.out.println(getInfo());
	}
	else if (command == 2) {
	    System.out.println(getDelStatus());
	
	}
	else if (command == 3) {
	    System.out.println(getInventory());
	}
	else if (command == 4) {
	    store();
	}
	else if (command == 5) {
	    //I would rather have the thief here that each time playDay() runs, since it's repeating and may run again due to input error
	    if (((int)Math.random()*4)==0){//maybe add some probablity?
		thief();
	    }
	    storeInventory.add(basicItems.get((int)(Math.random()*basicItems.size())));
	    time += 1;
	    nutrition -= 20;
	    hydration -= 20;
	    for (int i = 0; i < deliveringItems.size(); i++){// updating Items
		deliveringItems.get(i).changeDelTime(-1);
		Item I = deliveringItems.get(i);//make a new variable to avoid calling it again; but below the above fxn because we musn't create an alias I think?
		if (I.getDelTime()==0){
		    nutrition += I.getFoodVal();
		    hydration += I.getDrinkVal();
		    System.out.println("Your " + I + " has arrived.\n");
		    
		    inventory.add(deliveringItems.remove(i));//must remove at the end
		    
		}
	    } //they're not tested for we have no items
	    
	    if ((nutrition <= 0) || (hydration <= 0)) {
		gameOver = true;
		return;
	    }
	}
	else {
	    System.out.println("Sorry, there was an error in running your command. Please input your command again.");
	}
	//We don't need to give the user another chance if they input false, the program is repeating itself so the user will know how to find it if they want to 
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
