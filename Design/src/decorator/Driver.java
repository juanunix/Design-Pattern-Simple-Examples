package decorator;

// The Decorator Design Pattern is a Structural based Design Pattern.  It acts as a wrapper class to an original class
// that allows a user to add new functionality to an existing object without having to change the its structure

public class Driver {

	public static void main(String[] args) {
		Sandwich mySandwich = new WhiteBreadSandWich("White bread Sandwich");
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(), 
                                                     mySandwich.price());
       
        //adding extra cheese using Decorator Pattern
        mySandwich = new CheeseDecorator(mySandwich);
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(), 
                                                     mySandwich.price());
        
        //adding extra fillings
        mySandwich = new FillingDecorator(mySandwich);
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(), 
                                                     mySandwich.price());
        
        System.out.println();
        
        Sandwich myOtherSandwich = new BrownBreadSandWich("Brown bread Sandwich");
        System.out.printf("Price of %s is $%.2f %n", myOtherSandwich.getDescription(), 
                                                     myOtherSandwich.price());
       
        //adding extra cheese using Decorator Pattern
        myOtherSandwich = new CheeseDecorator(myOtherSandwich);
        System.out.printf("Price of %s is $%.2f %n", myOtherSandwich.getDescription(), 
                                                     myOtherSandwich.price());
        
        //adding extra fillings
        myOtherSandwich = new FillingDecorator(myOtherSandwich);
        System.out.printf("Price of %s is $%.2f %n", myOtherSandwich.getDescription(), 
                                                     myOtherSandwich.price());
	}

}
