import java.util.Scanner;

public class Shop {
    protected String name;
    protected Customer[] custCapacity = new Customer[5];
    protected Cart cart;
    protected Product prod;

    protected Product[] productsList = new Product[5];
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
        populateProducts();
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
                                    String name = sc.next();
                                    Customer c = new Customer();
                                    c.setName(name);
                                    System.out.println("Customer Full Name is : " + c.getName() + " is that correct? (y/n)");
                                    confirm = sc.next();
                                    populateCust(c);
                                }
                                break;

                            case "2" :
                                System.out.println("View Customers List:");
                                viewCust();
                                break;

                            case "3" :
                                String nameEdit = "";
                                String nameTarget = "";
                                System.out.println("Input Customer Name to Edit : ");
                                nameTarget = sc.next();
                                System.out.println(("Input new Customer Name : "));
                                nameEdit = sc.next();
                                editCust(nameTarget, nameEdit);
                                break;

                            case "4" :
                                String nameDelete = "";
                                System.out.println("Input Customer Name to remove : ");
                                nameDelete = sc.next();
                                deleteCust(nameDelete);
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
                    Product p = new Product();
                    custShopMenu(p);
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

    public void populateCust(Customer customer){
        int index = 0;
        for(int j = 0; j<custCapacity.length; j++){
            if(custCapacity[j]==null){
                index = j;

                break;
            }else{
                System.out.println(custCapacity[j].getName());
            }

        }

//        System.out.println("Index null yaitu index ke :"+index);
        custCapacity[index] = customer;
    }

    public void viewCust(){
        for(int i=0; i<custCapacity.length; i++){
            if(custCapacity[i]==null){
                break;
            }
//            System.out.println("loop ke : "+i);
            System.out.println(custCapacity[i].getName());

        }
    }

    public void editCust(String name, String newName){
        for(int i=0; i<custCapacity.length;i++){
            if(custCapacity[i].getName().equalsIgnoreCase(name)){
                custCapacity[i].setName(newName);
                break;
            }
        }
    }

    public void deleteCust(String name){
        for(int i=0; i<custCapacity.length;i++){
            if(custCapacity[i].getName().equalsIgnoreCase(name)){
                custCapacity[i] = null;
                break;
            }
        }
    }

    public void populateProducts(){
        Product[] p = {new Product(), new Product()};
        Product a = new Product();
        productsList[0] = p[0];
        productsList[1] = a;
        productsList[2].setProdName("Shampoo");
        productsList[3].setProdName("Meat");
        productsList[4].setProdName("Condiments");
        productsList[0].setStock(10);
        productsList[1].setStock(10);
        productsList[2].setStock(10);
        productsList[3].setStock(10);
        productsList[4].setStock(10);


    }
    public void custShopMenu(Product products){

        System.out.println("Berikut List Product Yang Tersedia : ");

        for(int i = 0; i<productsList.length; i++) {
            System.out.println("Nama Produk" + productsList[i].getProdName());
            System.out.println("Stock Produk" + productsList[i].getStock());
        }
    }
}
