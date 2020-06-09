package piggybank;

public class Nickel extends AbstractMoney{
    public Nickel(int amount){
        super(amount);
        this.name = "nickel";
        this.value = .05;
        this.total = getTotal();
    }
    public Nickel(){
        this.name = "nickel";
        this.value = .05;
        this.total = getTotal();
    }

    @Override
    protected String setPlural(){
        return this.name = "nickels";
    }
    @Override
    public String toString(){
        return getAmount() + " " + (this.amount == 1 ? name : setPlural());
    }
    
}