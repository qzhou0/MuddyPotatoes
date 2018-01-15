import java.io.*;
import java.util.*;

public class Woo {
    // instance variables
    public final static int MAX_DURATION = 10;

    //Should some variables be static or called from an Object?

    private int day, balance, hunger, thirst, gameStatus;
    private ArrayList<Item> inventory;
    //private ArrayList<Item> deliveringItems; //should we separate items that are in a delivery for easiness's sake in updating the delivery time?
    private InputStreamReader isr;
    private BufferedReader in;

    // default constructor
    public Woo() {
	day = 0;
	balance = (int)(Math.random() * 101) + 100;
	hunger = 80;
	thirst = 80;
	// must be an int:  gameOver = false;

	//gameStatus = false; it became int somehow?
	// from YoRPG
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }

    public int locate (Item item) {
	for (int i = 0; i< inventory.size(); i++){
	    if (inventory.get(i).equals(item)){
		return i;}
	}
	return -1;
    }

    public static void buy (Item item) {

    }

    public static void sell (Item item) {

    }

    public String getValues() {
	String  s = "Day: " + day;
	s += "\nBalance: " + balance;
	s += "\nHunger Lvl: " + hunger;
	s += "\nThirst Lvl: " + thirst;
	return s;
    }
    /*
    public static String getDrinks() {
	String s = "";
	// insert code here
    }

    public static String getFoods() {
	String s = "";
	// insert code here
    }
    */
    public static String getUnconsumables() {
	String s = "";
	// insert code here
	return s;
    }

    public void run(){
	if (day > 10){
	    gameStatus = 2; // option 2: You won the game
	}
	else {
	    
	}
    }
    public void /*or String[]?*/ commandReciever(){
	String s="try again";
	String[] command= new String[2];
	try{
	    s = in.readLine();
	}
	catch(Exception e){
	}
	for (int i = 0; i < s.length(); i++){
	    if (s.substring(i,i+1).equals(" ")){
	        command[0]= s.substring(0,i);//main part of the command
		if (i<s.length()-1){
		    command[1]=s.substring(i+1);}//second part of the command
		break;
	    }
	}
	if (command[0].equals(null)){//if there's only the string as command and no second part
	    command[0] = s;
	    }
	/*------------------------
	  part above produces a String list of two elements, that can be checked with an if statement to match corresponding command and be executed,
or returned "wrong command, please match instructions on how to type in commands" if does not match any
	---------------------------*/
    }
	
	
    public static void main (String[] args) {
	Woo test = new Woo();

        while (test.gameStatus == 0) {
	    test.run();
	}

	if (test.day <= 10) {
	    System.out.println("GAME OVER!");
	    
    }
    }
}
