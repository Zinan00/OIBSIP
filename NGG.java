import java.util.*;
public class NGG{ // Number Guessing Game

    // Function to perform level 1
    public static int level1(Scanner input){

        System.out.println("Level 1 Started...");
        System.out.println("Guess The Number Between 1-100- ");

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1; 

        int attempts = 10;

        while(attempts >= 1){

            System.out.print("Total Attempts are "+attempts+": ");
            int player = input.nextInt();
        
            if(player == randomNumber){
                System.out.println("\nCongratulations! Your Guess is Correct");
                System.out.println("Completed Level 1, You earned "+ attempts +" points ");
                System.out.println(); System.out.println("-------------------------------");
                return attempts;
            }
            else if(player < randomNumber){
                System.out.print("Hint: The number is Greater!\n");
            }
            else{
                System.out.print("Hint: The number is Lesser!\n");
            }

            if(attempts == 1){
                System.out.println("Game Over!"); 
                return 0;
            }
            else{
                System.out.print("Guess again: ");
            }

        attempts--;
        }

        return 0;
    }

    // Function to perform level 2
    public static int level2(Scanner input){

        System.out.println("Level 2 Started...");

        System.out.println("Guess The Number Between 1-100- ");

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1; 

        int attempts = 8;

        while(attempts >= 1){

            System.out.print("Total Attempts are "+attempts+": ");
            int player = input.nextInt();
        
            if(player == randomNumber){
                System.out.println("\nCongratulations! Your Guess is Correct");
                System.out.println("Completed Level 2, You earned "+ attempts +" points ");
                System.out.println(); System.out.println("-------------------------------");
                return attempts;
            }
            else if(player < randomNumber){
                System.out.print("Hint: The number is Greater!\n");
            }
            else{
                System.out.print("Hint: The number is Lesser!\n");
            }

            if(attempts == 1){
                System.out.println("Game Over!");
                return 0;
            }
            else{
                System.out.print("Guess again: ");
            }

        attempts--;
        }

        return 0;
    }

    // Function to perform level 3
    public static int level3(Scanner input){

        System.out.println("Level 3 Started... ");
        System.out.println("Guess The Number Between 1-100- ");

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1; 

        int attempts = 5;

        while(attempts >= 1){

            System.out.print("Total Attempts are "+attempts+": ");
            int player = input.nextInt();
        
            if(player == randomNumber){
                System.out.println("\nCongratulations! Your Guess is Correct");
                System.out.println("Completed Level 3, You earned "+ attempts +" points ");
                System.out.println(); System.out.println("-------------------------------");
                return attempts;
            }
            else if(player < randomNumber){
                System.out.print("Hint: The number is Greater!\n");
            }
            else{
                System.out.print("Hint: The number is Lesser!\n");
            }

            if(attempts == 1){
                System.out.println("Game Over!");
                return 0;
            }
            else{
                System.out.print("Guess again: ");
            }

        attempts--;
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int level1Points = NGG.level1(input);

        if(level1Points > 0){
            int level2Points = NGG.level2(input);
            level1Points += level2Points;
            
            if(level2Points > 0){
                int level3Points = NGG.level3(input);
                level2Points += level3Points;
            }

            System.out.println("Total points earned: " + level1Points);
        }
        else{
            System.out.println("No points earned. Game over!");
        }
    }
}