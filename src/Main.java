import javax.swing.border.AbstractBorder;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, 45.25, "Jane");
        Customer customer2 =  new Customer(2, 33.14, "Bob");
        Customer customer = new Customer();

        VendingMachine vendingMachine1 = new VendingMachine(1, "Food");
        VendingMachine vendingMachine2 = new VendingMachine(2, "Drink");
        VendingMachine vendingMachine3 = new VendingMachine(3, "Office");
        VendingMachine vendingMachine = new VendingMachine();

        Snack snack1 = new Snack(1, 36, 1, "Chips", 1.75);
        Snack snack2 = new Snack(2, 36, 1, "Chocolate Bar", 1.00);
        Snack snack3 = new Snack(3, 30,1 ,"Pretzel" ,2.00 );
        Snack snack4 = new Snack(4, 24,2 ,"Soda" ,2.50 );
        Snack snack5 = new Snack(5, 20,2 ,"Water" ,2.75 );
        Snack snack = new Snack();

        if(customer.getCash() >= snack.getCost()) {
            double balance = customer.getCash() - snack.getCost();
            customer.setCash(balance);
        }
        else {
            System.out.println("you don't have enough cash at hand");
        }




        Order order1 = new Order(customer1, snack4, 3);
        Order order2 = new Order(customer1, snack3, 1);
        Order order3 = new Order(customer2, snack4, 2);

        customer1.addCash(10);
        System.out.println(customer1.getName() + "new balance is " + customer1.getCash());

        Order order4 = new Order(customer1, snack2, 1);

        snack3.addQuantity(12);
        System.out.println(snack3.getName() + " new quantity is " + snack3.getQuantity());
        Order order5 = new Order(customer2, snack3, 3);

        Order order = new Order();

        order.receipt(snack1, vendingMachine1);
        order.receipt(snack2, vendingMachine1);
        order.receipt(snack3, vendingMachine1);
        order.receipt(snack4, vendingMachine2);
        order.receipt(snack5, vendingMachine2);





    }
}
