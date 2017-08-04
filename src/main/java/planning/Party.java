package planning;


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
    //Cost Calculators
    public int calculateTotalCost(){
        totalCost = calculateBeverageCost()+calculateFoodCost()+calculateMusicCost()+calculateDecorationCost();
        return totalCost;
    }
    public int calculateBeverageCost(){
        String[] beverageChoices = {"Water", "Non-Alcoholic", "Beer/Wine", "One Signature Drink", "Full Bar", "Full Bar with servers"};
        int[] beveragePrices = {0, 5, 20, 30, 45, 60};
        for (int i = 0; i <beverageChoices.length ; i++) {
            if(typeOfBeverages.equalsIgnoreCase(beverageChoices[i])){
                beverageCost = beveragePrices[i]*numOfGuests;
            }
        }
        return beverageCost;
    }
    public int calculateFoodCost(){
        String[] foodOptions = {"none","snack", "family style", "food stations", "buffet", "brunch", "dinner"};
        int[] foodPrices = {0, 10, 15, 20, 30, 20, 60};
        for (int j = 0; j <foodOptions.length ; j++) {
            if (typeOfFood.equalsIgnoreCase(foodOptions[j])) {
                foodCost = foodPrices[j] * numOfGuests;
            }
        }
        return foodCost;
    }
    public int calculateMusicCost(){
        String[] musicOptions = {"none", "equipment only", "dj", "band"};
        int[] musicPrices = {0, 100, 350, 500};
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
        String[] discountOptions = {" none", "yelp", "first time", "newsletter"};
        for (int k = 0; k < discountOptions.length ; k++) {
            if (discount.equalsIgnoreCase(discountOptions[k])) {
                discountedPrice = (int)(totalCost*(80.0f/100.0f));
            }
        }
        return discountedPrice;
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

}
