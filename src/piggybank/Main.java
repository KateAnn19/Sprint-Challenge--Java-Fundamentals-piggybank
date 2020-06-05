package piggybank; 

import java.util.*; 

public class Main{
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








    }

}
// compiling code:
// inside src
// javac folderNameUnderSrcFiles/*.java (compile)
// jar cvfe folderNameUnderSrcFiles.jar folderNameUnderSrcFiles.Main folderNameUnderSrcFiles/*.class (make an archive)
// java -jar foldernameUnderSrcFiles.jar (run it)