package clothsStore;

import javax.swing.*;

/**
 * Created by Felix Richnau on 2017-04-12.
 */
public class main {
    public static void main(String[] args) {

        String stringClothsNumber = JOptionPane.showInputDialog("How many random pieces " +
                "of cloths do you want to create?");
        int whileMax = Integer.parseInt(stringClothsNumber);
        Shop testShop = new Shop();

        int whileCounter = 0;
        while (whileCounter < whileMax) {
            RandomClothCreator testCreator =  new RandomClothCreator();
            Cloths testCloth = testCreator.createARandomCloth();
            testShop.addClothToArrayList(testCloth);
            whileCounter++;
        }

        //All the methods we wanna test
        testShop.printInformationOfAllTheCloths();
        testShop.printTotalSales();
        testShop.printTotalDress();
        testShop.printTotalPants();
        testShop.printTotalTshirts();
        testShop.printTotalMoneyMade();
        testShop.printTotalMoneyMadeDress();
        testShop.printTotalMoneyMadePants();
        testShop.printTotalMoneyMadeTshirts();

    }

}
