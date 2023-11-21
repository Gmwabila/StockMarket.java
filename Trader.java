//Name: Gloire Mwabila
//Date: 11/15/2023
//Description: The Trader

//PSEUDOCODE
//import java.util.Random
//creates a class that defines an object of type trader
//fields put all the variables
//iterate getter and setter method
// iterate keepTrdading method of type double, and increment dollarSpent by input value dollars 
//declare randomNumbers of be of type Random, and instantiate new random class
//declare variable randomDouble of type double, and assign it the value randomNumbers.nextDouble();
//Check if randomDouble is less than stockChangePercentage
//iterate getter method for traderName, DollarsSpent, DollarsMade, NetProfit
//set a method for traderName give it the value of name, and set dollars made and spent (1000, 0)
//create a method for tradeSomeMore to read the else statement in the stockMarket

import java.util.Random;

//creates a class that defines an object of type trader
public class Trader {

    // fields
    private String traderName;
    private double stockChangePercentage;
    private double dollarsSpent;
    private double dollarsMade;

    //iterate getter and setter method
    public double getStockChangePercentage() {
        return stockChangePercentage;
    }
    public void setStockChangePercentage(double percentage){
        stockChangePercentage = percentage;
    }
    // iterate keepTrdading method of type double, and increment dollarSpent by input value dollars 
    public void keepTrading(double dollars) {
        dollarsSpent += dollars;

        //declare randomNumbers of be of type Random, and instantiate new random class
        Random randomNumbers = new Random();
        
        //declare variable randomDouble of type double, and assign it the value randomNumbers.nextDouble();
        double randomDouble = randomNumbers.nextDouble();

        //Check if randomDouble is less than stockChangePercentage
        if (randomDouble < stockChangePercentage) {
            System.out.println(traderName + " made money");
            dollarsMade += (dollars*2);
        } else {
            System.out.println(traderName + " lost money");
            dollarsMade -= dollars*3;
        }
    }
    //iterate getter method 

    // method: getTraderName, public
    // input parameter: none
    // output: value of field traderName
    public String getTraderName() {
        return traderName;
    }
    // method: getDollarsSpent, public
    // input parameter: none
    // output: value of field dollarsSpent
    public double getDollarsSpent(){
        return dollarsSpent;
    }
    public double getDollarsMade() {
        return dollarsMade;
    }   
    public double getNetProfit() {
        return dollarsMade - dollarsSpent;
    }
    // Non-default constructor
    // input paramter: name, which is of type String
    // output: NA
    //

    //set a method for traderName give it the value of name, and set dollars made and spent (1000, 0)
    public Trader(String name) {
        traderName = name;
        dollarsMade = 1000;
        dollarsSpent = 0;
    }
    //create a method for tradeSomeMore to read the else statement in the stockMarket
    public void tradeSomeMore(double dollars) {
        keepTrading(dollars);
    }
     
}

