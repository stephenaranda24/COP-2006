import java.util.Random;

public class Methods extends Test {
  public static int randomNum(int x) {
    Random rndNum = new Random();
    int rn = (int) rndNum.nextInt(x);
    return rn;
    // the method above is used to generate a random number



  }

}
