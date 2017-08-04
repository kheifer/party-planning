package planning;

/**
 * Created by Guest on 8/4/17.
 */
public class Party {
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


    public Party(int guests, String music, String food, String beverages,boolean decor ){
        numOfGests = guests;
        typeOfMusic = music;
        typeOfFood = food;
        typeOfBeverages = beverages;
        decorations= decor;
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

    public boolean isDecorations() {
        return decorations;
    }

}
