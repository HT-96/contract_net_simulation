public class Buyer {

    //object variables
    private int id;
    private Item purchase;

    //buyer object creation
    public Buyer(int buId, Item buItem){
        id = buId;
        purchase = buItem;
        System.out.println("Buyer " + id + " created.");
    }

    //getter methods
    public int getId() { return id; }

    public Item getPurchase() { return purchase; }

    //evaluates bid chosen by broker agent
    public boolean evaluate(Bid fBid){
        Item bItem = fBid.getBidItem();
        if (bItem.getId() == purchase.getId() && bItem.getCost() <= purchase.getCost() && bItem.getStock()>= purchase.getStock() && fBid.getResponse()){
            return true;
        }else{
            return false;
        }
    }
}
