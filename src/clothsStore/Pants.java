package clothsStore;

import clothsStore.Cloths;

/**
 * Created by Felix Richnau on 2017-04-12.
 */
public class Pants extends Cloths {
    private int priceAfterSale;
    static int pantsCounter;
    private final static int PPERCANTAGE = 30;

    public Pants(String color, int size, int price,boolean isOnSale){
        super(color, size,  price, isOnSale);
        this.color=color;
        this.size=size;
        this.price=price;
        typeOfCloth = "Pants";
        pantsCounter++;

    }

    public void printInformation(){
        if(isOnSale){
            priceAfterSale = this.calculatePriceAfterSale();
            System.out.print("The " +color +" " +typeOfCloth +" size " +size +" is on sale. ");
            System.out.print("The original price was " +price +" SEK , now it is "+PPERCANTAGE +"% off. ");
            System.out.print(+priceAfterSale +" SEK!");
        }

        else if(!isOnSale){
            System.out.print("The " +color +" " +typeOfCloth +" size " +size +" is not on sale");
            System.out.print(" and the price is "+price +" SEK");
        }

    }

    public int calculatePriceAfterSale(){
        return priceAfterSale = price - ((price/100)*PPERCANTAGE);
    }

}
