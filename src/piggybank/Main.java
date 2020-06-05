package piggybank; 

import java.util.*; 

public class Main{
    //variable to hold total when looping
   

    //function to loop through list and getTotal from each currency and add to total
    public static double bankTotal(List<AbstractMoney> moneyList){
        double total = 0;
        for(AbstractMoney m : moneyList){
            total += m.getTotal();
        }
        System.out.println("The piggy bank holds $" + total);
        return total;
    }

    //Stretch ---------------------------------------------------------
    //function to withdraw money from total
    public static void withdraw(List<AbstractMoney> moneyList, double transaction){
        //sort by amount and then sort by value
        moneyList.sort(Comparator.comparing(o -> o.getAmount(), Comparator.reverseOrder()));
        moneyList.sort(Comparator.comparing(o -> o.getValue(), Comparator.reverseOrder()));
        int amtToSub; 
        int newVal;
        double multipliedTrans = transaction * 100; 
        //if transaction > amount in vault exit with print statement
        if(transaction > bankTotal(moneyList)){
            System.out.println("Insufficient Funds");
        }
        for(AbstractMoney m : moneyList){
            newVal = m.getValueTimes100(); 
            amtToSub = (int)(multipliedTrans / newVal); 
           
            //if the division of the transaction and val is greater than 0 
            if(amtToSub > 0){
                if(m.getAmount() >= amtToSub){
                    m.subtract(amtToSub);
                    multipliedTrans = (int)multipliedTrans - ((int)amtToSub* newVal);
                }
                else{
                    multipliedTrans = (int)multipliedTrans - ((int)m.getAmount()* newVal);
                    m.emptyCurrency();        
                }
           
                if(multipliedTrans == 0){
                    break;
                }            
            }
            else{
                continue;
            }          
        }
        //filter out all 0 amounts here
        System.out.println(moneyList.toString());      
        bankTotal(moneyList);
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
       
        withdraw(bankVault, 3.83);

    }

}
// compiling code:
// inside src
// javac folderNameUnderSrcFiles/*.java (compile)
// jar cvfe folderNameUnderSrcFiles.jar folderNameUnderSrcFiles.Main folderNameUnderSrcFiles/*.class (make an archive)
// java -jar foldernameUnderSrcFiles.jar (run it)