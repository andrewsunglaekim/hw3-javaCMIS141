import java.awt.*;

/**
 * Headphone.java created by andrewkim on 10/1/17.
 * This class defines the Headphone model
 */
public class Headphone {
    // constants
    private static final int LOW = 1;
    private static final int MEDIUM = 2;
    private static final int HIGH = 3;

    // instance variables
    private int volume;
    private boolean pluggedIn;
    private String manufacturer;
    private Color headPhoneColor;
    private String headPhoneModel;

    // constructor
    public Headphone(int volume, boolean pluggedIn, String manufacturer, Color headPhoneColor, String headPhoneModel){
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.headPhoneColor = headPhoneColor;
        this.manufacturer = manufacturer;
        this.headPhoneModel = headPhoneModel;
    }

    public Headphone(){
        this(MEDIUM, false, "Bose", Color.black, "AwesomeModel");
    }

    public String toString(){
        String description = "";
        description += "Manufacturer: " + manufacturer + "\n";
        description += "Model: " + headPhoneModel+ "\n";
        description += "Volume: " + volume + "\n";
        description += "Color: " + headPhoneColor.toString() + "\n";
        String isPluggedInString = pluggedIn ? "Yes" : "No";
        description += "Plugged In?: " + isPluggedInString + "\n";

        return description;
    }
    // getters
    public String getManufacturer() {
        return manufacturer;
    }
    public String getHeadPhoneModel(){
        return headPhoneModel;
    }
    public int getVolume() { return volume; }
    public boolean getPluggedIn() { return pluggedIn; }
    public Color getHeadPhoneColor() {return headPhoneColor; }

    // setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHeadPhoneModel(String headPhoneModel) {
        this.headPhoneModel = headPhoneModel;
    }

    public void changeVolume(int volume) {
        this.volume = volume;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    public void setHeadPhoneColor(Color headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }
}
