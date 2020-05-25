package test;
import test.Poketmon;
import test.User;
public class Controller {

    static String display(Poketmon pocketmon){
       // return information of the poketmon by ID
        Poketmon pm = pocketmon;
       String poketmonName = pm.getName();
       int poketID = pm.getPoketmonID();
       int poketPrice = pm.getPrice();
       String message = poketID+" "+poketmonName+" "+poketPrice;
       return message;
    }
    static boolean isValideMoney(int money){
        //valide the input, only allow 50, 100, 10, 500, 1000,5
        boolean isValide = false;
        if(money==50||money==100||money==10||money==500||money==1000||money==5){
            isValide=true;
        }
        return isValide;
    }

    static String displayAvaliablePocketmon(Poketmon pm, User user){
        //return pockmon infor if user money is affordable
        String message;
        String avaString = "$";
        int userMoney = user.getMoney();
        int pmPrice = pm.getPrice();
        
        String poketmonName = pm.getName();
       int poketID = pm.getPoketmonID();
       int poketPrice = pm.getPrice();
       if(pmPrice>userMoney){
       message = poketID+" "+poketmonName+" "+poketPrice;
        }else{
            message = poketID+" "+poketmonName+" "+poketPrice+" "+avaString;
        }
        return message;
    }

    static int change(User user,int pm){
        //return change 
        int change = 0;
        int userMoney = user.getMoney();
        
        return userMoney-pm;
    }
    static boolean isValideChoice(int price,User user){
        //check null pointer exception
        if(price ==0){
            return false;
        }
        
        int money = user.getMoney();
        if(price>money){
            return false;
        }else{
            return true;
        }
    }
}