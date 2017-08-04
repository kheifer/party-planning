package planning;

/**
 * Created by Guest on 8/4/17.
 */
public class Party {
    private int numOfGests;
    private String typeOfMusic;
    private String typeOfFood;
    private String typeOfBeverages;


    public Party(int guests, String music, String food, String beverages ){
        numOfGests = guests;
        typeOfMusic = music;
        typeOfFood = food;
        typeOfBeverages = beverages;
    }
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

}
