public class Customer {
    private int id;
    private double cash;
    private String name;


    public Customer(int id, double cash, String name) {
        this.id = id;
        this.cash = cash;
        this.name = name;
    }
    public Customer(){}

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double addCash(double amount){
        this.cash += amount;
        return this.cash;
    }


}
