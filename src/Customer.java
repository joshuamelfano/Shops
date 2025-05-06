public class Customer {
    protected String name;
    protected int age;
    protected String[] inventory;
    protected int[] amountItem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public int[] getAmountItem() {
        return amountItem;
    }

    public void setAmountItem(int[] amountItem) {
        this.amountItem = amountItem;
    }
}
