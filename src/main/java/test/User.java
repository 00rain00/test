package test;

public class User {
    private int choice;
    private int money;

    // constructor
	public User(int choice, int money) {
		this.choice = choice;
		this.money = money;
    }

    // choice money の get/set method
    
    public int getChoice() {
		return this.choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money = money;
    }
    
        // //   chooseAction(int:action):action

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter your choice (A:return B:next C:cancel)");
        // String action = scanner.nextLine();

        // switch(action){
        //     case "A" :
        //     System.out.println("go to check");

        //     break;

        //     case "B" :
        //     System.out.println("Go to next page");
            
        //     break;

        //     case "C" :
        //     System.out.println("cancel this page");
        //     break;
}