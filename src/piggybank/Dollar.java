package piggybank;


public class Dollar extends AbstractMoney{
    //constructor
    public Dollar(int amount){
        super(amount);//parent class
        this.name = "dollar";
        this.value = 1.00;
        this.total = getTotal();
    }
    //constructor
    public Dollar(){
        //no amount passed so defaults to 1 from super
        this.name = "dollar";
        this.value = 1.00;
        this.total = getTotal(); 
    }

    //this is to see the dollar total 
    public double setDollarAmount(){
        return amount * value; 
    }

    @Override
    protected String setPlural(){
        return this.name = "dollars";
    }

    @Override
    public String toString(){
        return "$"+ getAmount() + " " + (this.amount == 1 ? name : setPlural());
    }
    
}