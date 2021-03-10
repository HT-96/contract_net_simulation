public class Item {

    //object variables
    private int id;
    private int cost;
    private int stock;

    //item object creation
    public Item (int aId, int aCost, int aStock){
        id = aId;
        cost = aCost;
        stock = aStock;
    }

    //getter methods
    public int getId(){ return id; }

    public int getCost() { return cost; }

    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }

}
