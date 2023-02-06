import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class Number_guessing {
    int min_num=1;
    int max_num=100;

    public int getUserGuessNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.print("Please Guess the number-: ");
        int Guess=sc.nextInt();
        return Guess;
    }

    public int getNumByComputer(){
        return ThreadLocalRandom.current().nextInt(min_num,max_num+1);
    }

    public void number_guessing(){
        boolean UserGuessCorrect=false;
        int guessNum=0;

        int computerNum=getNumByComputer();

        while(! UserGuessCorrect){
            int userNum=getUserGuessNumber();
            if(userNum > computerNum){
                System.out.println("Try Lower Number \n");
            }else if(userNum < computerNum ){
                System.out.println("Try Higher Number \n");
            }else if(userNum == computerNum){
                System.out.println("\n--------------------");
                System.out.println("Congratulation! Your Guess is Correct!");
                UserGuessCorrect=true;
            }
            guessNum++;       
        }
        System.out.println("You found the number in "+ guessNum +" guesses");
        System.out.println("--------------------");
    }

    public static void main(String args[]){
        Number_guessing game= new Number_guessing();
        game.number_guessing();
    }
}
