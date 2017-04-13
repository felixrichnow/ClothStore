package clothsStore;

import clothsStore.Cloths;

import java.util.ArrayList;

/**
 * Created by user on 2017-04-12.
 */
public class Shop {
    ArrayList<Cloths> clothsArrayList =  new ArrayList<Cloths>();

    public Shop(){

    }
    public void printInformationOfAllTheCloths(){
        for(int i=0; i<clothsArrayList.size();i++) {
            Cloths printCloths = clothsArrayList.get(i);
            printCloths.printInformation();
            System.out.println("\n");
        }
    }

    public void printTotalMoneyMade(){
        int totalMoney = 0;
        for(int i=0; i<clothsArrayList.size();i++) {
            Cloths printCloths = clothsArrayList.get(i);
            if(printCloths.findIsOneSale()){
              totalMoney += printCloths.calculatePriceAfterSale();
            }
            else if(!printCloths.findIsOneSale()){
                totalMoney += printCloths.price;
            }
        }
        System.out.println("Total money made from all sales : "+ totalMoney +" \n");
    }

    public void printTotalMoneyMadeDress(){
        int totalDressMoney = 0;
        for(int i=0; i<clothsArrayList.size();i++) {
            Cloths printCloths = clothsArrayList.get(i);
            if(printCloths.getTypeOfCloth().equalsIgnoreCase("dress")){
                if(printCloths.findIsOneSale()){
                    totalDressMoney += printCloths.calculatePriceAfterSale();
                }
                else if(!printCloths.findIsOneSale()){
                    totalDressMoney += printCloths.price;
                }
            }
        }
        System.out.println("Total money made from all dress sales : "+ totalDressMoney +" \n");
    }

    public void printTotalMoneyMadePants(){
        int totalPantsMoney = 0;
        for(int i=0; i<clothsArrayList.size();i++) {
            Cloths printCloths = clothsArrayList.get(i);
            if(printCloths.getTypeOfCloth().equalsIgnoreCase("pants")){
                if(printCloths.findIsOneSale()){
                    totalPantsMoney += printCloths.calculatePriceAfterSale();
                }
                else if(!printCloths.findIsOneSale()){
                    totalPantsMoney += printCloths.price;
                }
            }
        }
        System.out.println("Total money made from all pants sales : "+ totalPantsMoney +" \n");
    }

    public void printTotalMoneyMadeTshirts(){
        int totaltshirtMoney = 0;
        for(int i=0; i<clothsArrayList.size();i++) {
            Cloths printCloths = clothsArrayList.get(i);
            if(printCloths.getTypeOfCloth().equalsIgnoreCase("tshirt")){
                if(printCloths.findIsOneSale()){
                    totaltshirtMoney += printCloths.calculatePriceAfterSale();
                }
                else if(!printCloths.findIsOneSale()){
                    totaltshirtMoney += printCloths.price;
                }
            }
        }
        System.out.println("Total money made from all Tshirt sales : "+ totaltshirtMoney +" \n");
    }




    public void addClothToArrayList(Cloths clothToBeAdded){
        clothsArrayList.add(clothToBeAdded);
    }

    public  void printTotalSales(){
        System.out.println("Total cloths created :" +Cloths.clothCounter);
    }

    public void printTotalDress(){
        System.out.println("Total dress's created :" +Dress.dressCounter);
    }

    public void printTotalPants(){
        System.out.println("Total pants's created :" +Pants.pantsCounter);
    }

    public void printTotalTshirts(){
        System.out.println("Total Tshirts's created :" +Tshirt.tShirtCounter);
    }
}
