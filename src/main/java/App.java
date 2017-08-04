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
            while (programRunning){
                System.out.println("Welcome to the Pink Footed Dinosaur's Boutique event planning!");
                System.out.println("We're so glad you chose us to cater your super special event!");
                System.out.println("Would you like to book a reservation?(yes or no)");
                String answer = bufferedReader.readLine();
                if (answer.equalsIgnoreCase("yes")){programRunning = true;
                    System.out.println("Great! Let's begin!");
                    System.out.println("##########################################################");
                }else if(answer.equalsIgnoreCase("no")){
                    programRunning = false;
                    System.out.println("Thanks for visiting! We hope to see you again!");
                    System.out.println("##########################################################");
                }
                System.out.println("##########################################################");
                System.out.println("How many guests do you plan on hosting? At current, we're only able to host up to 1000 guests and our minium is 10");
                int guests = Integer.parseInt(bufferedReader.readLine());
                if(guests >1000|| guests < 10){
                    System.out.println("We won't be able to accomodate that many people, Have a great day!");
                    System.out.println("##########################################################");
                }
                System.out.println("Great! You'd like us to provide the decorations, right?(true or false)");
                boolean party = Boolean.parseBoolean(bufferedReader.readLine());
                System.out.println("Great! Now as for food! Here are our options. Please pick one!");
                System.out.println("");
//                Party newParty = new Party(guests; String music; String food; String beverages; decor );
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}