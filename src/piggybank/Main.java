package piggybank; 

import java.util.*; 

public class Main{
    //variable to hold total when looping
    public static double total = 0;

    //function to loop through list and getTotal from each currency and add to total
    public static void bankTotal(List<AbstractMoney> moneyList){
        for(AbstractMoney m : moneyList){
            total += m.getTotal();
        }
        System.out.println("The piggy bank holds $" + total);
    }


    //Stretch ---------------------------------------------------------
    //function to withdraw money from total
    public static void withdraw(List<AbstractMoney> moneyList, double transaction){
        moneyList.sort(Comparator.comparing(o -> o.getValue(), Comparator.reverseOrder()));
        double originalAmountToWithdraw = transaction;
        double amountLeftToWithdraw = transaction; 
        double temp; 
        int amt = 1; 
        if(transaction > total){
            System.out.println("Insufficient Funds");
        }
        for(AbstractMoney m : moneyList){
            //dollar
                if(m.getName() == "dollar" && m.getTotal() < transaction){
                   // m.subtract(amt);
                }
            //quarters
                if (m.getName() == "quarter" && m.getTotal() < transaction){
                    //m.subtract(amt);
                }
             //dimes
                if(m.getName() == "dime" && m.getTotal() < transaction){
                    //m.subtract(amt);
                }
             //nickels
                if(m.getName() == "nickel" && m.getTotal() < transaction){
                    //m.subtract(amt);
                }
            //pennies
                if(m.getName() == "penny" && m.getTotal() < transaction){
                    //m.subtract(amt);
                }                  
            
        }
        System.out.println(moneyList.toString());
        System.out.println(total);
    }

    //Stretch ---------------------------------------------------------


    public static void main(String[] args){
        System.out.println("Piggy Bank");

        Quarter q_1 = new Quarter(); 
        Dime dd_1 = new Dime();
        Dollar d_2 = new Dollar(5);
        Nickel n_2 = new Nickel(3);
        Dime dd_2 = new Dime(7);
        Dollar d_1 = new Dollar();
        Penny p_2 = new Penny(10);
        
        System.out.println(q_1.getTotal());
        System.out.println(d_2.getTotal());
        System.out.println(p_2.getAmount());

        List<AbstractMoney> bankVault = new ArrayList<>();
        bankVault.add(q_1);
        bankVault.add(dd_1);
        bankVault.add(d_2);
        bankVault.add(n_2);
        bankVault.add(dd_2);
        bankVault.add(d_1);
        bankVault.add(p_2);

        System.out.println("List of All");
        System.out.println(bankVault.toString());

        bankTotal(bankVault);
       
        withdraw(bankVault, 1.50);

    }

}
// compiling code:
// inside src
// javac folderNameUnderSrcFiles/*.java (compile)
// jar cvfe folderNameUnderSrcFiles.jar folderNameUnderSrcFiles.Main folderNameUnderSrcFiles/*.class (make an archive)
// java -jar foldernameUnderSrcFiles.jar (run it)