import java.awt.*;

/**
 * Created by andrewkim on 10/1/17.
 */
public class TestHeadphone {
  public static void main(String args[]) {
    Color magenta = Color.magenta;
    Color blue = Color.blue;
    final int LOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;

    Headphone headphone1 = new Headphone(LOW, true, "Bose", magenta, "BO-526");
    Headphone headphone2 = new Headphone(HIGH, false, "Bose", blue, "BO-556");
    Headphone headphone3 = new Headphone();

    testHeadphone(headphone1, MEDIUM);
    testHeadphone(headphone2, LOW);
    testHeadphone(headphone3, HIGH);
  }

  public static void testHeadphone(Headphone headphone, int volume){
    System.out.println(headphone.toString());
    headphone.changeVolume(volume);
    System.out.println(headphone.toString());
  }
}
