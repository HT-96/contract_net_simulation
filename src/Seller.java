import java.util.ArrayList;

public class Seller {

    //object variables
    private int id;
    private ArrayList<Item> sellerStock = new ArrayList<Item>();

    //seller object
    public Seller(int sId, ArrayList sStock){

        id = sId;
        sellerStock = sStock;

    }

    //getters and setters
    public int getId() { return id; }

    public ArrayList<Item> getSellerStock() { return sellerStock; }

    //print seller stock to console
    public void printStock(){

        for (int i = 0; i < sellerStock.size(); i++) {
            System.out.println(String.valueOf(sellerStock.get(i).getId()) + ", " + String.valueOf(sellerStock.get(i).getCost()) + ", " + String.valueOf(sellerStock.get(i).getStock()));

        }
    }

    //sets seller stock; used to update stock after transaction
    public void setSellerStock(int iId, Bid purchase){
        Item temp = new Item(sellerStock.get(iId).getId(), sellerStock.get(iId).getCost(), (sellerStock.get(iId).getStock() - purchase.getBidItem().getStock()));
        sellerStock.set(iId, temp);
    }

    //checking response
    public Bid contractResponse(Bid bIn){
        boolean a = false;
        for (int i = 0; i < sellerStock.size(); i++) {
            if (bIn.getBidItem().getId() == sellerStock.get(i).getId() && bIn.getBidItem().getCost() >= sellerStock.get(i).getCost() && bIn.getBidItem().getStock() <= sellerStock.get(i).getStock()){
                a = true;
            }
        }

        if (a){
            Bid returnBid = new Bid(id, bIn.getBidItem(), true);
            System.out.println("seller s" + id + " has accepted " + bIn.getOwnerId() + "'s contract.");
            return returnBid;
        }else{
            Bid returnBid = new Bid(id, bIn.getBidItem(), false);
            System.out.println("seller s" + id + " has rejected " + bIn.getOwnerId() + "'s contract.");
            return returnBid;
        }

    }
}
