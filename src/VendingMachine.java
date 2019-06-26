public class VendingMachine {
    public int id;
    public String name;

    public VendingMachine(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public VendingMachine(){}
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
