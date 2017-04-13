package clothsStore;

/**
 * Created by Felix Richnau on 2017-04-12.
 */
public class Dress extends Cloths {
        int priceAfterSale;
        static int dressCounter;
        private final static int DPERCANTAGE = 30;

        public Dress(String color, int size, int price,boolean isOnSale){
            super(color, size,  price, isOnSale);
            this.color=color;
            this.size=size;
            this.price=price;
            typeOfCloth = "Dress";
            dressCounter++;
        }

        public void printInformation(){
            if(isOnSale){
                priceAfterSale= this.calculatePriceAfterSale();
                System.out.print("The " +color +" " +typeOfCloth +" size " +size +" is on sale. ");
                System.out.print("The original price was " +price +" SEK , now it is " +DPERCANTAGE +"% off. ");
                System.out.print(+priceAfterSale +" SEK!");
            }

            else if(!isOnSale){
                    System.out.print("The " +color +" " +typeOfCloth +" size " +size +" is not on sale");
                    System.out.print(" and the price is "+price +" SEK");
                }

        }

        public int getDressCounter(){
            return dressCounter;
        }

        public int calculatePriceAfterSale(){
           return priceAfterSale = price - ((price/100)*DPERCANTAGE);
        }

}
