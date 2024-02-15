public class PetrolPurchase {

    private String stationLocation;
    private String petroleumType;
    private int quantityPurchased;
    private double price;
    private double percentageDiscount;

    public PetrolPurchase( String stationLocation, String petroleumType, int quantityPurchased, double price, double percentageDiscount){

        this.stationLocation = stationLocation;

        this.petroleumType = petroleumType;

        this.quantityPurchased = quantityPurchased;

        this.price = price;

        this.percentageDiscount =percentageDiscount;


    }

    public void setStationLocation(String stationLocation){

        this.stationLocation=stationLocation;

    }
    public void setPetroleumType(String petroleumType){
        this.petroleumType = petroleumType;
    }

    public void setQuantityPurchased(int quantityPurchased){
        this.quantityPurchased = quantityPurchased;
    }

    public void setPrice(double price){

       this.price = price;

    }

    public void setPercentageDiscount(double percentageDiscount){

        this.percentageDiscount = percentageDiscount;
    }


    public String getStationLocation(){
        return stationLocation;
    }

    public String getPetroleumType(){
        return petroleumType;
    }

    public int getQuantityPurchased(){

        return quantityPurchased;

    }
    public double getPrice(){
        return price;
    }

    public double getPercentageDiscount(){
        return percentageDiscount;
    }
    public double getPurchaseAmount(double price, double percentageDiscount){

       double netPurchaseAmount = quantityPurchased * price-(percentageDiscount/100 *price);

       return netPurchaseAmount;

    }





}
