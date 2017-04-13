package clothsStore;

import java.util.Random;

/**
 * Created by Felix on 2017-04-12.
 */
public class RandomClothCreator{

    /**
     *  Method createARandomClothCreator generates a random number between 1 and 3.
     *  Then it generates clothing according to that number,
     *  1 = Dress
     *  2 = Pants
     *  3 = Tshirt
     *  It also generates a random number for what color and if it should be
     *  on sale.
     *  @return returnCloths , the new type of Cloth created randomly
     */

    private Cloths returnCloth = null;

    public Cloths createARandomCloth() {
        Random randomGenerator = new Random();
        int clothNumber = randomGenerator.nextInt(3) + 1;
        if(clothNumber == 1){
            //Dress

            int colorNumber = randomGenerator.nextInt(4) + 1;
            switch(colorNumber) {
                case 1:
                    returnCloth = new Dress("Red", 36, 500, true );
                    break;
                case 2:
                    returnCloth = new Dress("White", 36, 400, true );
                    break;
                case 3:
                    returnCloth = new Dress("Pink", 38, 250, false );
                    break;
                case 4:
                    returnCloth = new Dress("Purple", 38, 250, true );
                    break;
            }
        }

        else if(clothNumber == 2){
            //Pants

            int colorNumber = randomGenerator.nextInt(2) + 1;
            int secondNumber = randomGenerator.nextInt(2) + 1;
            if(colorNumber == 1 ){
                //Blue
                if(secondNumber==1){
                    //Sale
                    returnCloth = new Pants("Blue", 36, 350, true );
                }
                else if(secondNumber==2){
                    //Not on sale
                    returnCloth = new Pants("Blue", 38, 350, false );
                }
            }
            else if(colorNumber==2){
                //Black
                if(secondNumber==1){
                    //Sale
                    returnCloth = new Pants("Black", 36, 400, true );
                }
                else if(secondNumber==2){
                    //Not on sale
                    returnCloth = new Pants("Black", 38, 400, false );
                }
            }

        }
        else if(clothNumber == 3){
            //Tshirt, pNow = priceNow
            int pNow = 150;
            int tSize = 38;
            int colorNumber = randomGenerator.nextInt(5) + 1;
            switch(colorNumber) {
                case 1:
                    returnCloth = new Tshirt("Red", tSize, pNow, false );
                    break;
                case 2:
                    returnCloth = new Tshirt("Blue", tSize, pNow, false );
                    break;
                case 3:
                    returnCloth = new Tshirt("Yellow", tSize, pNow, false );
                    break;
                case 4:
                    returnCloth = new Tshirt("Brown", tSize, pNow, true );
                    break;
                case 5:
                    returnCloth = new Tshirt("Purple", tSize, pNow, true );
                    break;
            }


        }

        return returnCloth;
    }
}
