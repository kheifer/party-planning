import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import planning.Party;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

        try {
            while (programRunning) {
                System.out.println("Welcome to the Pink Footed Dinosaur's Boutique event planning!");
                System.out.println("We're so glad you chose us to cater your super special event!");
                System.out.println("Would you like to book a reservation?(yes or no)");
                String answer = bufferedReader.readLine();
                if (answer.equalsIgnoreCase("yes")) {
                    programRunning = true;
                    System.out.println("Great! Let's begin!");
                    System.out.println("##########################################################");
                } else if (answer.equalsIgnoreCase("no")) {
                    programRunning = false;
                    System.out.println("Thanks for visiting! We hope to see you again!");
                    System.out.println("##########################################################");
                }
                System.out.println("##########################################################");
                System.out.println("How many guests do you plan on hosting? At current, we're only able to host up to 1000 guests and our minium is 10");
                int guests = Integer.parseInt(bufferedReader.readLine());
                if (guests > 1000 || guests < 10) {
                    System.out.println("We won't be able to accomodate that many people, Have a great day!");
                    System.out.println("##########################################################");
                    programRunning = false;
                } else {
                    System.out.println("Magnificent! You'd like us to provide the decorations, right?(true or false)");
                    boolean decor = Boolean.parseBoolean(bufferedReader.readLine());
                    String decorations;
                    if(decor){decorations ="have us do ";
                    }else {decorations = "provide your own ";
                    }
                    System.out.println("##########################################################");
                    System.out.println("Delightful! Now as for food! Here are our options. Please pick one!");
                    System.out.println("none, snack, family style, food stations, buffet, brunch, dinner");
                    String food = bufferedReader.readLine();
                    System.out.println("##########################################################");
                    System.out.println("Excellent choice! Now we all know no party is complete without music! Here are our options. Please pick one!");
                    System.out.println("none, equipment only, dj, band");
                    String music = bufferedReader.readLine();
                    System.out.println("##########################################################");
                    System.out.println("Great! Now let's pick the drinks! Here are our options. Please pick one!");
                    System.out.println("Water, Non-Alcoholic, Beer/Wine, One Signature Drink, Full Bar, Full Bar with servers");
                    String beverages = bufferedReader.readLine();
                    Party newParty = new Party(guests,  music,  food,  beverages, decor );
                    System.out.println("##########################################################");
                    System.out.println("This is shaping up to be a great party!");
                    System.out.println("We're going to go ahead and calculate your choices!");
                    System.out.println("But before we do let's make sure we've got your choices all set.");
                    System.out.println("##########################################################");
                    System.out.println("Your soiree will have hopefully "+ newParty.getNumOfGuests()+" guests");
                    System.out.println("You meticulously chose "+ newParty.getTypeOfBeverages()+" to keep them satiated!");
                    System.out.println("You artfully picked "+ newParty.getTypeOfFood()+" to delight all "+newParty.getNumOfGuests()+" palates");
                    System.out.println("For musical entertainment you've chosen to have " + newParty.getTypeOfMusic());
                    System.out.println("Oh and before I forget, you also chose to "+ decorations + "decorations");
                    System.out.println("Does this all seem correct?(yes or no)");
                    System.out.println("##########################################################");
                    String choicesCorrect = bufferedReader.readLine();
                    if(choicesCorrect.equalsIgnoreCase("yes")){
                        programRunning = true;
                        System.out.println("Great here's your total");
                    }else{
                        System.out.println("I guess there must have been some miscommunication please try again!");
                        programRunning = false;
                    }
                    System.out.println("Your estimated decor cost is: "+ newParty.calculateDecorationCost());
                    System.out.println("Your estimated Music cost is: "+ newParty.calculateMusicCost());
                    System.out.println("Your estimated Food cost is: "+ newParty.calculateFoodCost());
                    System.out.println("Your estimated Beverage cost is: "+ newParty.calculateBeverageCost());
                    System.out.println("Your estimated total cost is: "+ newParty.calculateTotalCost());
                    System.out.println("##########################################################");
                    System.out.println("We do offer discounts.");
                    System.out.println("We have a yelp discount(10% off), a first time visitor discount(10% off), and we also offere a discount for those who join our newsletter(10% off)");
                    System.out.println("Please enter one of the following: none, yelp, first time, newsletter");
                    String discount = bufferedReader.readLine();
                    System.out.println("Here's your new discounted price: "+ newParty.discountedPrice(discount));

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}