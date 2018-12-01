import java.util.Random;

public class Methods {
  public static int randomNum(int x) {
    Random rndNum = new Random();
    int rn = (int) rndNum.nextInt(x);
    return rn;



  }

}
