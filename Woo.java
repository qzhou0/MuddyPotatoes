import java.io.*;
import java.util.*;

public class Woo {
    // instance variables
    public final static int MAX_DURATION = 10;
<<<<<<< HEAD
    private int day, balance, hunger, thirst, gameOver;//Should some variables be static or called from an Object?
=======
    private int day, balance, hunger, thirst, gameStatus;
>>>>>>> 1fbf5e98dfd1e55985a4786d207c8731dd97e008
    private ArrayList<Item> inventory;
    private InputStreamReader isr;
    private BufferedReader in;

    // default constructor
    public Woo() {
	day = 0;
	balance = Math.random() * 101 + 100;
	hunger = 80;
	thirst = 80;
<<<<<<< HEAD
	// must be an int:  gameOver = false;
=======
	gameStatus = false;
>>>>>>> 1fbf5e98dfd1e55985a4786d207c8731dd97e008
    }

    public static int locate (Item item) {
	
    }

    public static void buy (Item item) {

    }

    public static void sell (Item item) {

    }

    public static String getValues() {
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

    public static void run(){
	if (day > 10){
	    gameStatus = 2; // option 2: You won the game
	}
	else {
	    
	}
    }
	
    public static void main (String[] args) {
	Woo test = new Woo();

        while (gameStatus == 0) {
	    Woo.run();
	}

	if (day <= 10) {
	    System.out.println("GAME OVER!");
	    
    }
    }
}
