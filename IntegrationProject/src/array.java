
public class array {
  public static int getMinValue(int[] intArray) {
    int minValue = intArray[0];
    for (int i = 1; i < intArray.length; i++) {
      if (intArray[i] < minValue) {
        minValue = intArray[i];
      }
    }
    return minValue;
  }
  // the code above is a method which gets the minimum value in the stated array list

}
