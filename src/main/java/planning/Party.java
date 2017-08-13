package planning;


import java.util.Arrays;

public class Party {
    //private encapsulated values
    private int numOfGuests;
    private String typeOfMusic;
    private String typeOfFood;
    private String typeOfBeverages;
    private boolean decorations;
    private int beverageCost;
    private int foodCost;
    private int musicCost;
    private int totalCost;
    private int decorationCost;
    private int discountedPrice;

    //inputs needed to calculate cost
    public Party(int guests, String music, String food, String beverages,boolean decor ){
        numOfGuests = guests;
        typeOfMusic = music;
        typeOfFood = food;
        typeOfBeverages = beverages;
        decorations = decor;
    }

    //options and corresponding prices
    private String[] foodOptions = {"none","snack", "family style", "food stations", "buffet", "brunch", "dinner"};
    private String[] beverageChoices = {"water", "non-alcoholic", "beer/wine", "signature drink", "full bar", "bottle service"};
    private String[] musicOptions = {"none", "equipment only", "dj", "band"};
    private String[] discountOptions = {"none", "yelp", "first time", "newsletter"};
    private int[] foodPrices = {0, 10, 15, 20, 30, 20, 60};
    private int[] beveragePrices = {0, 5, 20, 30, 45, 60};
    private int[] musicPrices = {0git remote add kf , 100, 350, 500};



    //Cost Calculators
    public int calculateTotalCost(){
        totalCost = calculateBeverageCost()+calculateFoodCost()+calculateMusicCost()+calculateDecorationCost();
        return totalCost;
    }
    public int calculateBeverageCost(){
        for (int i = 0; i <beverageChoices.length ; i++) {
            if(typeOfBeverages.equalsIgnoreCase(beverageChoices[i])){
                beverageCost = beveragePrices[i]*numOfGuests;
            }
        }
        return beverageCost;
    }
    public int calculateFoodCost(){
        for (int j = 0; j <foodOptions.length ; j++) {
            if (typeOfFood.equalsIgnoreCase(foodOptions[j])) {
                foodCost = foodPrices[j] * numOfGuests;
            }
        }
        return foodCost;
    }
    public int calculateMusicCost(){
        for (int k = 0; k < musicOptions.length ; k++) {
            if (typeOfMusic.equalsIgnoreCase(musicOptions[k])) {
                musicCost = musicPrices[k];
            }
        }
        return musicCost;
    }
    public int calculateDecorationCost(){
        if(decorations){
          decorationCost = 50*numOfGuests;
        }
        return decorationCost;
    }
    public int discountedPrice(String discount){
        for (String discountOption : discountOptions) {
            if (discount.equalsIgnoreCase(discountOption)) {
                discountedPrice = (int) (totalCost * (80.0 / 100.0f));
            }
        }
        return discountedPrice;
    }
    public boolean isAnOption(String input,String[] list){
        return (Arrays.asList(list).contains(input));
    }


    //GETTERS
    public int getNumOfGuests() {
        return numOfGuests;
    }

    public String getTypeOfMusic() {
        return typeOfMusic;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getTypeOfBeverages() {
        return typeOfBeverages;
    }

    public boolean iDecorations() {
        return decorations;
    }
    public String[] getFoodOptions() {
        return foodOptions;
    }

    public String[] getBeverageChoices() {
        return beverageChoices;
    }

    public String[] getMusicOptions() {
        return musicOptions;
    }

    public String[] getDiscountOptions() {
        return discountOptions;
    }

}
