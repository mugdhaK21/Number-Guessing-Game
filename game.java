package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuess=0;

    public int getNoofguess() {
        return noOfGuess;

    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("GUESS THE NUMBER:");
        Scanner sc=new Scanner(System.in);
        inputNumber= sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuess++;
        if(inputNumber==number){
            if(noOfGuess<8){
                System.out.println("WOWWW!! YOU U R BRILLIANT...GOOD JOB");
            }else{
                System.out.println("TRY AGAIN TO MAKE LESS ATTEMPTS..");
            }
            System.out.format("YES,YOU HAVE GUESSED IT RIGHT.THE NUMBER WAS %d\n YOU GUESSED IT IN %d ATTEMPTS" , number,noOfGuess);
           return true;
        }else if(inputNumber<number){
            System.out.println("SORRY!!TOO LOW");
        }else if(inputNumber>number){
            System.out.println("SORRY!!TOO HIGH");
        }
        return false;
    }

}
     public class guessthenumber {
         public static void main(String[] args) {
             Game g=new Game();
             boolean b=false;
             while (!b){
                 g.takeUserInput();
                 b=g.isCorrectNumber();
             }
         }

}
