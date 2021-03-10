import java.util.ArrayList;

public class Main {

    //buyers, brokers and sellers declaration
    public static Buyer bu1, bu2;
    public static Broker br1;
    public static Seller s1, s2, s3;
    public static ArrayList<Buyer> buyerList;
    public static ArrayList<Seller> sellerList;

    public static void main(String[] args) {

        //buyer instantiation
        Item bu1i = new Item(1, 150, 3);
        bu1 = new Buyer(0, bu1i);

        Item bu2i = new Item(0, 100, 1);
        bu2 = new Buyer(1, bu2i);

        buyerList = new ArrayList<Buyer>();

        buyerList.add(bu1);
        buyerList.add(bu2);


        //seller stock creation (real world would have a larger dataset in db, but for the sake of this simulation
        //a hard coded array list will work)

        //seller 1 stock
        Item I01 = new Item(0, 100, ((int)(Math.random()*(5))));
        Item I11 = new Item(1, 150, ((int)(Math.random()*(5))));
        Item I21 = new Item(2, 200, ((int)(Math.random()*(5))));
        Item I31 = new Item(3, 250, ((int)(Math.random()*(5))));
        Item I41 = new Item(4, 300, ((int)(Math.random()*(5))));

        ArrayList<Item> sellerStock1 = new ArrayList<Item>();

        sellerStock1.add(I01);
        sellerStock1.add(I11);
        sellerStock1.add(I21);
        sellerStock1.add(I31);
        sellerStock1.add(I41);

        //seller 2 stock
        Item I02 = new Item(0, 100, ((int)(Math.random()*(5))));
        Item I12 = new Item(1, 150, ((int)(Math.random()*(5))));
        Item I22 = new Item(2, 200, ((int)(Math.random()*(5))));
        Item I32 = new Item(3, 250, ((int)(Math.random()*(5))));
        Item I42 = new Item(4, 300, ((int)(Math.random()*(5))));

        ArrayList<Item> sellerStock2 = new ArrayList<Item>();

        sellerStock2.add(I02);
        sellerStock2.add(I12);
        sellerStock2.add(I22);
        sellerStock2.add(I32);
        sellerStock2.add(I42);

        //seller 3 stock
        Item I03 = new Item(0, 100, ((int)(Math.random()*(5))));
        Item I13 = new Item(1, 150, ((int)(Math.random()*(5))));
        Item I23 = new Item(2, 200, ((int)(Math.random()*(5))));
        Item I33 = new Item(3, 250, ((int)(Math.random()*(5))));
        Item I43 = new Item(4, 300, ((int)(Math.random()*(5))));

        ArrayList<Item> sellerStock3 = new ArrayList<Item>();

        sellerStock3.add(I03);
        sellerStock3.add(I13);
        sellerStock3.add(I23);
        sellerStock3.add(I33);
        sellerStock3.add(I43);


        //Seller instantiation
        s1 = new Seller(1, sellerStock1);
        s2 = new Seller(2, sellerStock2);
        s3 = new Seller(3, sellerStock3);


        //Creates a list of sellers
        sellerList = new ArrayList<Seller>();

        sellerList.add(s1);
        sellerList.add(s2);
        sellerList.add(s3);

        //broker instantiation
        br1 = new Broker(1, buyerList, sellerList);

        //starting the simulation run
        br1.Start();
    }
}
