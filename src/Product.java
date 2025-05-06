public class Product {
    protected String prodName;
    protected int stock;

    protected String[] prodNames;
    protected int[] stocks;



    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String[] getProdNames() {
        return prodNames;
    }

    public void setProdNames(String[] prodNames) {
        this.prodNames = prodNames;
    }

    public int[] getStocks() {
        return stocks;
    }

    public void setStocks(int[] stocks) {
        this.stocks = stocks;
    }
}
