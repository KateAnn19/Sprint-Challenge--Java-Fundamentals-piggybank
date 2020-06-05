package piggybank; 

import java.util.*; 

public class Main{
    public static void main(String[] args){
        System.out.println("Piggy Bank");

        Quarter q_1 = new Quarter(); 
        System.out.println(q_1);
        Quarter q_2 = new Quarter(10);
        System.out.println(q_2);

        Dollar d_1 = new Dollar();
        System.out.println(d_1);
        Dollar d_2 = new Dollar(5);
        System.out.println(d_2);

        Dime dd_1 = new Dime();
        System.out.println(dd_1);
        Dime dd_2 = new Dime(5);
        System.out.println(dd_2);
        
        Nickel n_1 = new Nickel();
        System.out.println(n_1);
        Nickel n_2 = new Nickel(5);
        System.out.println(n_2);

        Penny p_1 = new Penny();
        System.out.println(p_1);
        Penny p_2 = new Penny(5);
        System.out.println(p_2);








    }

}
// compiling code:
// inside src
// javac folderNameUnderSrcFiles/*.java (compile)
// jar cvfe folderNameUnderSrcFiles.jar folderNameUnderSrcFiles.Main folderNameUnderSrcFiles/*.class (make an archive)
// java -jar foldernameUnderSrcFiles.jar (run it)