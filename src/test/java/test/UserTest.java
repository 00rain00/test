package test;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserTest {

    int choice;
    int money;

    public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
    }
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your action (A:return B:next C:cancel)");
        String action = scanner.nextLine();

        switch(action){
            case "A" :
            System.out.println();
            break;

            case "B" :
            System.out.println();
            break;

            case "C" :
            System.out.println("");
            break;
    }

       

        
    }
}
