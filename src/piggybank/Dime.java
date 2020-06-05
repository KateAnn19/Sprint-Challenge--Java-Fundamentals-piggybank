package piggybank;

public class Dime extends AbstractMoney{

    public Dime(int amount){
        super(amount);
        this.name = "dime";
        this.value = .10;
        this.total = getTotal();
    }
    public Dime(){
        this.name = "dime";
        this.value = .10;
        this.total = getTotal();
    }
    @Override
    protected String setPlural(){
        return this.name = "dimes";
    }

    @Override
    public String toString(){
        return "Name: " + (this.amount == 1 ? name : setPlural()) + " Amount: " + getAmount() +  " Face Value: " + "$" + getValue() + " total: " + getTotal();
    }
    
}