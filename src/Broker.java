import java.util.ArrayList;

public class Broker {
    //object variables
    private int id;
    private ArrayList<Buyer> currentClientList;
    private ArrayList<Seller> activeSellerList;
    private ArrayList<Bid> sellerResponses;

    //broker object
    public Broker(int brId, ArrayList<Buyer> bL, ArrayList<Seller> sL){
        id = brId;
        currentClientList = bL;
        activeSellerList = sL;
    }

    //start of simulation; rub my broker class
    public void Start(){

        for (int i = 0; i < currentClientList.size(); i++) { //iterates through client/buyer list
            sellerResponses = new ArrayList<Bid>();
            Bid currentBid = new Bid(i, currentClientList.get(i).getPurchase()); //gets item to be purchased from the buyer

            for (int j = 0; j < activeSellerList.size(); j++) {//iterates through list of sellers
                sellerResponses.add(activeSellerList.get(j).contractResponse(currentBid)); //sends the seller a contract and stores their response
            }
            int bestOfferCost = sellerResponses.get(0).getBidItem().getCost();
            int bestOffer = 0;
            for (int k = 0; k < sellerResponses.size(); k++) { //loops through list of responses to find suitable one
                if (sellerResponses.get(k).getResponse()){
                    bestOfferCost = sellerResponses.get(k).getBidItem().getCost();
                    bestOffer = k;
                }
            }
            if (currentClientList.get(i).evaluate(sellerResponses.get(bestOffer)) == true){ //sends selected offer to buyer to approve or reject
                activeSellerList.get(bestOffer).setSellerStock(sellerResponses.get(bestOffer).getBidItem().getId(), sellerResponses.get(bestOffer)); //updates seller stock if approved
                System.err.println("buyer bu" + (i + 1) + ": has purchased " + sellerResponses.get(bestOffer).getBidItem().getStock() + " of item " + sellerResponses.get(bestOffer).getBidItem().getId() + " for $" + sellerResponses.get(bestOffer).getBidItem().getCost() + " each from seller s" + (bestOffer + 1) + "."); //prints meg
            }else{
                System.err.println("buyer bu" + (i + 1) + " has rejected offer."); //prints msg
            }
        }
    }
}
