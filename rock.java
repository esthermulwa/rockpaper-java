//the rock paper Scissors Java version 🎉😍❤️

import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissors {
    public static String computerMove(){
        Random number = new Random();
        int random = number.nextInt(3);
        String [] words = {"rock", "paper", "scissors"};
        return words[random];
    }
    static void tie(String player,String computer){
        System.out.printf("\nPlayer Move: %s", player);
        System.out.printf("\nComputer Move: %s", computer);
        System.out.print("\nGame is Tie !!");
    }
    static void Rock(String computer){
        if(computer.equals("scissors")){
            System.out.print("\nPlayer Move: rock");
            System.out.printf("\nComputer Move: %s", computer);
            System.out.print("\nPlayer Wins😂!!");
        } else if(computer.equals("paper")){
            System.out.print("\nPlayer Move: rock");
            System.out.printf("\nComputer Move: %s", computer);
            System.out.print("\nComputer Wins 👩🏿‍💻:( ");
        }
    }
    static void Paper(String computer){
        if(computer.equals("rock")){
            System.out.print("\nPlayer Move: paper");
            System.out.printf("\nComputer Move: %s", computer);
            System.out.print("\nPlayer Wins😍😂!!");
        } else if(computer.equals("scissors")) {
            System.out.print("\nPlayer Move: paper");
            System.out.printf("\nComputer Move: %s", computer);
            System.out.print("\nComputer Wins😂 :(");
        }
    }
    static void Scissors(String computer){
        if(computer.equals("rock")){
            System.out.print("\nPlayer Move: scissors");
            System.out.printf("\nComputer Move: %s", computer);
            System.out.print("\nComputer Wins 😍 :(");
        } else if(computer.equals("paper")){
            System.out.print("\nPlayer Move: scissors");
            System.out.printf("\nComputer Move: %s", computer);
            System.out.print("\nPlayer Wins 😂!!");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //System.out.print("Choose between 'rock', 'paper' or 'scissors'\n");
        //System.out.print("Enter your choice: ");
        String choice = sc.next().toLowerCase();
        String Computer_move = computerMove();
        if(choice.equals(Computer_move)){
            tie(choice, Computer_move);
        } else if(choice.equals("rock")){
            Rock(Computer_move);
        } else if(choice.equals("paper")){
            Paper(Computer_move);
        } else if(choice.equals("scissors")){
            Scissors(Computer_move);
        } else {
            System.out.println("Make sure your input is correct! ");
        }
    }
}
