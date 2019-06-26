public class Snack {
    private int id, quantity, vendingId;
    private String name;
    private double cost;

    public int snackQuantity;
    public double totalCost;

    public Snack(){}


    public Snack(int id, int quantity, int vendingId, String name, double cost) {
        this.id = id;
        this.quantity = quantity;
        this.vendingId = vendingId;
        this.name = name;
        this.cost = cost;

    }



    public void setName(String name) {
        this.name =  name;
    }

    public String getName() {
        return name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public double getCost() {
        return  this.cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setVendingId(int vendingId) {
        this.vendingId = vendingId;
    }

    public int getVendingId() {
        return vendingId;
    }

    public int addQuantity(int quantity){
        this.quantity += quantity;
        return this.quantity;
    }

    public double buySnack( int snackQuantity){
       this.quantity -= snackQuantity;
       this.totalCost = snackQuantity * this.cost;
       return totalCost;
    }

}