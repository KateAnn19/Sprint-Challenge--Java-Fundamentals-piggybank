package piggybank;


abstract class AbstractMoney{
    protected int amount; //this is int because amount is a whole number 
    protected String name;
    protected double value; //this is double because the value of currency is using decimals
    protected double total; //this is double because the total of currency is using decimals

    //constructor
    public AbstractMoney(){
        this.amount = 1; 
    }
    //constructor overloaded
    public AbstractMoney(int amount){
        this.amount = amount; 
    }

    public String getName(){
        return name; 
    }

    public double getValue(){
        return value;
    }
    public int getAmount(){
        return amount; 
    }
    public double getTotal(){
        return amount * value; 
    }

    protected void subtract(int x){
        this.amount = amount - x; 
    }
    protected void emptyCurrency(){
        this.amount = 0;
    }
    protected int getValueTimes100(){
        return (int) (this.value * 100);
    }
    abstract String setPlural();

}