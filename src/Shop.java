import java.util.Scanner;

public class Shop {
    protected String name;
    protected Customer[] custCapacity = new Customer[5];
    protected Cart cart;
    protected Product prod;
    private String optionMenu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer[] getCustCapacity() {
        return custCapacity;
    }

    public void setCustCapacity(Customer[] custCapacity) {
        this.custCapacity = custCapacity;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public Shop() {
        optionMenu = "";

        Scanner sc = new Scanner(System.in);

        while(!optionMenu.equalsIgnoreCase("exit")) {
            mainMenu();
            optionMenu = sc.next();

            switch (optionMenu){
                case "1" :
                    while(!optionMenu.equalsIgnoreCase("exit1")){

                        customerMenu();
                        optionMenu = sc.next();

                        switch (optionMenu){

                            case "1" :
                                String confirm = "";
                                while(!confirm.equalsIgnoreCase("y")) {
                                    System.out.println("Input Customer Full Name : ");
                                    Customer c = new Customer();
                                    String name = sc.next();
                                    c.setName(name);
                                    populateCust(0, new Customer());
                                    System.out.println("Customer Full Name is : " + c.getName() + " is that correct? (y/n)");
                                    confirm = sc.next();


                                }
                                break;

                            case "2" :
                                break;

                            case "3" :
                                break;

                            case "4" :
                                break;

                            case "exit" :
                                optionMenu = "exit1";
                                break;


                            default:
                                System.out.println("Please input with a correct format e.g 1,2, exit, etc");
                                System.out.print("Type");
                                optionMenu = sc.next();
                                break;
                        }

                    }
                    break;



                case "2" :
                    while(optionMenu != "exit1"){
                        customerCheckInMenu();
                        optionMenu = sc.next();

                        switch (optionMenu){
                            case "1" :
                                break;

                            case "2" :
                                break;

                            case "3" :
                                break;

                            case "exit" :
                                optionMenu = "exit1";
                                break;


                            default:
                                System.out.println("Please input with a correct format e.g 1,2, exit, etc");
                                System.out.print("Type");
                                optionMenu = sc.next();
                                break;
                        }
                    }

                    break;

                case "3" :
                    System.out.println("This Feature will be available on the next update! :)");
                    switch (optionMenu){
                        default:
                            System.out.print("Type");
                            optionMenu = sc.next();
                            break;
                    }
                    break;

                case "exit" :
                    optionMenu = "exit";
                    break;

                default :
                    System.out.println("Please input with a correct format e.g 1,2, exit, etc");
                    System.out.print("Type");
                    optionMenu = sc.next();
                    break;
            }
        }
    }

    public void mainMenu(){
        System.out.println("Welcome to Josh's Shop");
        System.out.println("Please choose what do you want to do : ");
        System.out.println("[1] Register Customer");
        System.out.println("[2] Customer Check-in");
        System.out.println("[3] Start Shopping! (Coming Soon)");
        System.out.println("Type exit if you want to leave this menu");
        System.out.print("Your Input : ");
    }

    public void customerMenu(){
        System.out.println("Customer Registration Menu");
        System.out.println("[1] Register a New Customer");
        System.out.println("[2] View all Customers");
        System.out.println("[3] Edit an Existing Customer");
        System.out.println("[4] Remove an Existing Customer");
        System.out.println("Type exit if you want to leave this menu");
        System.out.print("Your Input : ");
    }

    public void customerCheckInMenu(){
        System.out.println("Customer Check-in Menu");
        System.out.println("[1] Check-in a New Customer");
        System.out.println("[2] View all Checked-in Customers");
        System.out.println("[3] Check-out a Customer");
        System.out.println("Type exit if you want to leave this menu");
        System.out.print("Your Input : ");
    }

    public void populateCust(int i, Customer customer){
        custCapacity[i] = customer;
    }
}
