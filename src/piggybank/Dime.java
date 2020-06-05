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
        return getAmount() + " " + (this.amount == 1 ? name : setPlural());
    }
    
}