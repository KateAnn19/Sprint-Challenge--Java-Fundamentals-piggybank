package piggybank;

public class Penny extends AbstractMoney{
    public Penny(int amount){
        super(amount);
        this.name = "dime";
        this.value = .01;
        this.total = getTotal();
    }
    public Penny(){
        this.name = "dime";
        this.value = .01;
        this.total = getTotal();
    }

    @Override
    protected String setPlural(){
        return this.name = "pennies";
    }
    @Override
    public String toString(){
        return getAmount() + " " + (this.amount == 1 ? name : setPlural());
    }
    
}