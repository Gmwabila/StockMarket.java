//Name: Gloire Mwabila
//Date: 10/18/2023
//Description: Casino

//PSEUDOCODE
// Creates class a class of type stockMarket
//Creates four variables which will refer to new of type Trader, using the non-standard constructor (trader1, 2, 3, to 4)
// set stock change percentage (stockChangePercentage) for each player(sample percentages) and assign to them a specific value
//invoke the getter method for TraderName and StockChangePercentage for each Trader object, to retrieve that information, and print to the screen
//create a variable, keyboard, of type Scanner, set it equal to a new object of type Scanner(listens to System.in)
// iterate a while loop 
//retrieve the trader's name, ask them how muchmoney they spent and currently have, and the trader's net profit.Print to the screen
//ask the user the amount of money that they should bet, and iterate an exit statement to end the trade
//declare a varible of type double give it the value of dollarSpend(use keyboard.nextDouble())
//iterate an if and else statement, for the else statement invoke the tradeSomeMore method of each Trader, give it the value of dollarsSpend
 //close the scanner

import java.util.Scanner;
// Creates class a class of type stockMarket
    public class StockMarket {
        public static void main(String Args[]) {
        //Creates four variables which will refer to new of type Trader, using the non-standard constructor (trader1, 2, 3, to 4)
        Trader trader1 = new Trader("Mwabila");
        Trader trader2 = new Trader("Gloire");
        Trader trader3 = new Trader("Mbo");
        Trader trader4 = new Trader("Matala");

        // set stock change percentage (stockChangePercentage) for each player(sample percentages)
        trader1.setStockChangePercentage(0.61);
        trader2.setStockChangePercentage(0.19);
        trader3.setStockChangePercentage(0.81);
        trader4.setStockChangePercentage(0.42);

        //invoke the getter method for TraderName and StockChangePercentage
        System.out.println("Here are the Traders, and their stock change percentages: ");
        System.out.println(trader1.getTraderName() + ", Stock Change Percentage: " + trader1.getStockChangePercentage());
        System.out.println(trader2.getTraderName() + ", Stock Change Percentage: " + trader2.getStockChangePercentage());
        System.out.println(trader3.getTraderName() + ", Stock Change Percentage: " + trader3.getStockChangePercentage());
        System.out.println(trader4.getTraderName() + ", Stock Change Percentage: " + trader4.getStockChangePercentage());
        
        //create a variable, keyboard, of type Scanner, set it equal to a new object of type Scanner(listens to System.in)
        Scanner keyboard = new Scanner(System.in);

    // iterate a while loop 
    while (true) {
        //output the result to the screen 

        System.out.println("Trader 1: " + trader1.getTraderName() + ", Spent: $" + trader1.getDollarsSpent()
                    + ", Currently has: $" + trader1.getDollarsMade() + ", Net Profit: $" + trader1.getNetProfit());
        
        System.out.println("Trader 2: " + trader2.getTraderName() + ", Spent: $" + trader2.getDollarsSpent()
                    + ", Currently has: $" + trader2.getDollarsMade() + ", Net Profit: $" + trader2.getNetProfit());
                
        System.out.println("Trader 3: " + trader3.getTraderName() + ", Spent: $" + trader3.getDollarsSpent()
                    + ", Currently has: $" + trader3.getDollarsMade() + ", Net Profit: $" + trader3.getNetProfit());

        System.out.println("Trader 4: " + trader4.getTraderName() + ", Spent: $" + trader4.getDollarsSpent()
                    + ", Currently has: $" + trader4.getDollarsMade() + ", Net Profit: $" + trader4.getNetProfit());

        //use a System.out.print statement to ask how much money each tradershould bet.
        System.out.print("Enter the amount of money each trader should bet (enter 0 to end the trade): ");

        //declare a varible of type double give it the value of dollarSpend(use keyboard.nextDouble())
        double dollarsSpend = keyboard.nextDouble();

        //iterate an if and else statement 
        if (dollarsSpend == 0) {
            break;
        } else {
            trader1.tradeSomeMore(dollarsSpend); 
            trader2.tradeSomeMore(dollarsSpend); 
            trader3.tradeSomeMore(dollarsSpend);
            trader4.tradeSomeMore(dollarsSpend);
        }
    }
        //close the scanner
        keyboard.close();
    }
}
