public class Order  {


    Snack snack = new Snack();
    Customer customer = new Customer();

    public Order(){}

    public Order(Customer customer,Snack snack,  int amount){
        System.out.println(customer.getName() + " " + "has" + " " + customer.getCash() + " cash at hand");
        System.out.println("snack quantity" + " " + snack.getQuantity());

        double  balance = customer.getCash() - snack.buySnack(amount);
        System.out.println("balance" + " " + balance);

        customer.setCash(balance);

       }

   public void receipt(Snack snack, VendingMachine vendingMachine){
       System.out.print("Snack name:" + snack.getName() + "\t");
       System.out.print(" Vending machine: " + vendingMachine.getName());
       System.out.print(" Snack quantity: " + snack.getQuantity());
       System.out.print(" Total Cost of all quantities: " + snack.buySnack(snack.getQuantity()) + "\n");



   }
}

