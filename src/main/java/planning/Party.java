package planning;


public class Party {
    //private encapsulated values
    private int numOfGests;
    private String typeOfMusic;
    private String typeOfFood;
    private String typeOfBeverages;
    private boolean decorations;
    private int price;
    private int beverageCost;
    private int foodCost;
    private int musicCost;
    private int totalCost;

    //inputs needed to calculate cost
    public Party(int guests, String music, String food, String beverages,boolean decor ){
        numOfGests = guests;
        typeOfMusic = music;
        typeOfFood = food;
        typeOfBeverages = beverages;
        decorations= decor;
    }
    //Cost Calculators
    public int calculateTotalCost(){
        totalCost = calculateBeverageCost()+calculateFoodCost()+calculateMusicCost();
        return totalCost;
    }
    public int calculateBeverageCost(){
        String[] beverageChoices = {"Water", "Non-Alcoholic", "Beer/Wine", "One Signature Drink", "Full Bar", "Full Bar with servers"};
        int[] beveragePrices = {0, 5, 20, 30, 45, 60};
        for (int i = 0; i <beverageChoices.length ; i++) {
            if(typeOfBeverages.equalsIgnoreCase(beverageChoices[i])){
                beverageCost = beveragePrices[i]*numOfGests;
            }
        }
        return beverageCost;
    }
    public int calculateFoodCost(){
        return foodCost;
    }
    public int calculateMusicCost(){
        return musicCost;
    }


    //GETTERS
    public int getNumOfGests() {
        return numOfGests;
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
