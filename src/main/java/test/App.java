package test;

import java.util.Scanner;
import java.util.ArrayList;
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        //this is start of the program
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to poketmon vending machine");
        
        //create poketmon
        ArrayList<Poketmon>pmList = new ArrayList<>();
        
         Poketmon pm1 = new Poketmon(650 , "イーブイ(Eevee)" , "normal" , 1 , 40 , "**");
         Poketmon pm2 = new Poketmon(50 , "コイキング(Magikarp)" , "water" , 2 , 99 , "*");
         Poketmon pm3 = new Poketmon(750 , "ゼニガメ(squirtle) " , " water " , 3 , 100 , "***");
         Poketmon pm4 = new Poketmon(750 , "カビゴン(Snorlax) " , " normal " , 4 , 1 , "*");
         Poketmon pm5 = new Poketmon(999 , "ピッピ(Clefairy) " , " normal " , 5 , 25 , "*"); 
         Poketmon pm6 = new Poketmon(1200 , "ラプラス（Lapras)" , " water/ice " , 6 , 80 , "***");
         Poketmon pm7 = new Poketmon(2700 , "リザードン(Charizard) " , " fire " , 7 , 35 , "**");
         Poketmon pm8 = new Poketmon(300 , "フシギダネ(Bulbasaur) " , " grass " , 8 , 3 , "**");
         Poketmon pm9 = new Poketmon(500 , "ピカチュウ(Pikachu)" , " thunder " , 9 , 10 , "**");


         pmList.add(pm1);
         pmList.add(pm2);
         pmList.add(pm3);
         pmList.add(pm4);
         pmList.add(pm5);
         pmList.add(pm6);
         pmList.add(pm7);
         pmList.add(pm8);
         pmList.add(pm9);
         //end creation
        //show all the pms
        

        for(Poketmon pm: pmList){
            System.out.println(Controller.display(pm));
        }
       
        //create user
        User user = new User(0,0);
        boolean continuePutMoney = true;
        int userMoney = user.getMoney();
            while(continuePutMoney){
            // ask user to put money
            System.out.println("please insert money(10,50,100,500,1000):");
            int userIn = scan.nextInt();
            while( ! Controller.isValideMoney(userIn)){
               System.out.println("wrong input, plz input again");
               userIn = scan.nextInt();
               
           }
          
               userMoney +=userIn;
               
               System.out.println("contine put money? true-yes false-no");
               continuePutMoney = scan.nextBoolean();
            }
            user.setMoney(userMoney);
           //end insert money

            
            //display avaliable poketmon
            for (Poketmon poketmon : pmList) {
             System.out.println( Controller.displayAvaliablePocketmon(poketmon, user));
            }
            //end display avaliable poketmon

            //choose poketmon
            
                
              
            int selectedPoketmonIndex=0;
            int selectedPoketmonPrice=0;
                    do{
                    System.out.println(" please select the poketmon with $:");
                    selectedPoketmonIndex= scan.nextInt();
                    
                    for (Poketmon poketmon : pmList) {
                        if(poketmon.getPoketmonID()==selectedPoketmonIndex){
                            selectedPoketmonPrice=poketmon.getPrice();
                            break;
                        }
                    }
                }while(!Controller.isValideChoice(selectedPoketmonPrice, user));
                user.setChoice(selectedPoketmonIndex);
                   
                
                
            //endchoose poketmon

            //display choose poketmon

            
            //display successful information
           
                ShowImage.showImage(user.getChoice());
            
            //return money
            //get poketmon by arrayList
            int change=0;
            for (Poketmon poketmon : pmList) {
                if(poketmon.getPoketmonID()==user.getChoice()){
                    change = Controller.change(user, poketmon.getPrice());
                }
            }
           
            System.out.println(
                " your change: "+change
            );
            //end return money

         

        
		scan.close();
        System.out.println("Bye-Bye");
    }
}
