package piggybank;

public class Quarter extends AbstractMoney{

    public Quarter(int amount){
        super(amount); 
        this.name = "quarter";
        this.value = .25;
        this.total = getTotal();
    }

    public Quarter(){
        this.name = "quarter";
        this.value = .25;
        this.total = getTotal();
    }
    @Override
    protected String setPlural(){
        return this.name = "quarters";
    }

    @Override
    public String toString(){
        return "Name: " + (this.amount == 1 ? name : setPlural()) + " Amount: " + getAmount() +  " Face Value: " + "$" + getValue() + " total: " + getTotal();
    }
    
}