public class Bid {

    //object variable
    private int ownerId;
    private Item bidItem;
    private boolean response;

    //bid object
    public Bid(int bOwnId, Item bItem){
        ownerId = bOwnId;
        bidItem = bItem;
    }

    //bid object with response from agent
    public Bid(int bOwnId, Item bItem, boolean bResponse){
        ownerId = bOwnId;
        bidItem = bItem;
        response = bResponse;
    }

    //getter methods
    public int getOwnerId() { return ownerId; }

    public Item getBidItem() { return bidItem; }

    public boolean getResponse() { return response; }

}
