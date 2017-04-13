package clothsStore;

/**
 * Created by user on 2017-04-12.
 */
public abstract class Cloths {
    protected String color;
    protected int size;
    protected int price;
    protected boolean isOnSale;
    static int clothCounter;
    protected int priceAfterSale;
    protected String typeOfCloth;

    public Cloths(String color, int size, int price, boolean isOnSale){
        this.color=color;
        this.size=size;
        this.price=price;
        this.isOnSale=isOnSale;
        clothCounter++;
    }
    public abstract void printInformation();

    public String getTypeOfCloth(){
        return typeOfCloth;
    }

    public int getClothCounter(){
        return clothCounter;
    }

    public int calculatePriceAfterSale(){
        return priceAfterSale;
    }

    public boolean findIsOneSale(){
        return isOnSale;
    }
}
