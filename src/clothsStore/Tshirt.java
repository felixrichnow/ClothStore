package clothsStore;

/**
 * Created by user on 2017-04-12.
 */
public class Tshirt extends Cloths {
   private int priceOfSale;
   static int tShirtCounter;
   private final static int TPERCANTAGE = 30;


    public Tshirt(String color, int size, int price,boolean isOnSale){
        super(color, size,  price, isOnSale);
        this.color=color;
        this.size=size;
        this.price=price;
        typeOfCloth = "Tshirt";
        tShirtCounter++;
    }

    public void printInformation(){
        if(isOnSale){
            priceAfterSale=this.calculatePriceAfterSale();
            System.out.print("The " +color +" " +typeOfCloth +" size " +size +" is on sale. ");
            System.out.print("The original price was " +price +" SEK , now it is " +TPERCANTAGE +"% off. ");
            System.out.print(+priceAfterSale +" SEK!");
        }

        else if(!isOnSale){
            System.out.print("The " +color +" " +typeOfCloth +" size " +size +" is not on sale.");
            System.out.print(" and the price is "+price +" SEK");
        }

    }



    public int getTShirtCounter(){
        return tShirtCounter;
    }

    public int calculatePriceAfterSale(){
        return priceAfterSale = price - ((price/100)*TPERCANTAGE);
    }


}
