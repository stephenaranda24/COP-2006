import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application extends Test {

  public static void main(String[] args) {
    // Stephen Aranda
    // Hello everyone, this is going to be a project that puts together
    // the things I have learned in COP 2006
    System.out.println("Hello everyone, welcome to my awesome project");

    // There are a total of 8 Java built-in data types, which are
    // boolean, byte, short, int, long, float, double, and char
    // The four main types of variables are boolean, int, double, and string

    boolean firstValue = true;

    // Boolean data types are able to hold true/false values and have a length of 1 bit

    byte secondValue = 15;
    // Byte data types hold values that are 8 bits long and have a minimum and maximum value of -128
    // and 128 respectively

    short thirdValue = 1588;
    // Short data types hold values that are 16 bits long and have a minimum and maximum value of
    // -32,768 and 32,768 respectively

    int birthYear = 1998;
    // Int data types hold values that are 32 bits long and have a minimum and maximum value of
    // -2^31 and 2^31 respectively

    long fifthValue = 568771116;
    // Long data types hold values that are 64 bits long and have a minimum and maximum value of
    // -2^63 and 2^63 respectively

    float sixthValue = 3.5F;
    // Float data types hold values that are also 32 bits long, it is not used in java

    double gradePoint = 3.51;
    // Double data types hold values that are 64 bits long, common in java and used for decimals

    char eightValue = 'S';
    // Char data types are a single 16 bit Unicode character

    String statementOne = "My name is Stephen Aranda and I was born in the summer of " + birthYear
        + "." + " I currently attend FGCU and have a GPA of " + gradePoint + "."
        + " Everything I have stated thus far is " + firstValue + ".";
    System.out.println(statementOne);

    // Variables are very important to java, they are a location in memory and are used to help code
    // become flexible and manipulate values
    // Scope refers to the block of code belonging to a method following its declaration

    final double PI = 3.141592;
    // Final is used to make whatever value it is assigned unchangeable or immutable

    System.out.println(PI);

    String name = "Stephen Alexander Aranda";
    System.out.println(name.length());
    // The string method "length" is used to return the numbers of characters in a string as an
    // integer

    String birthPlace = "I was born in Redwood City, ca";
    String newbirthPlace = birthPlace.replaceFirst("ca", "CA");
    System.out.println(newbirthPlace);
    // The replaceFirst method is used to replace the first occurrence only of a specific character
    // in a string

    String hobby =
        "One of my favorite hobbies is to watch anime. Some examples are Naruto, My Hero Academia, Tokyo Ghoul, and Attack on Titan.";
    String subOne = hobby.substring(0, 45);
    String subTwo = hobby.substring(46, 123);
    System.out.println(subOne + "\n" + subTwo);
    // Substring methods returns a portion of a string from the index you choose
    // The string above uses an escape sequence, which breaks the string into two lines

    int longToInt = (int) 6400000L;
    System.out.println(longToInt);
    // I used casting in the code above to turn a larger data type which in this case is the long
    // into a smaller one which here is an integer

    int n1 = 10, n2 = 20, maximum;
    maximum = max(n1, n2); // Here the method is being called and in the parenthesis are the
                           // arguments
    System.out.println("maximum is " + maximum);

    int x1 = 100, randomNumber;
    randomNumber = Methods.randomNum(x1);
    double powerNum = Math.sqrt(randomNumber);
    System.out
        .println("This is the sqare root of a random generated number from 0 to 100: " + powerNum);
    // The block of code above uses a method that I created which generates a number
    // from zero to 100 and then uses the square root method from the math class to take the square
    // root of that random number and prints that value

    int bankAccount = 1500;
    if (bankAccount > 1000) {
      System.out.println("Do not enter panic mode yet");

    }

    if (bankAccount <= 1000) {
      System.out.println("Time to panic");
    }

    if (bankAccount == 2000) {
      System.out.println("Let's go to the mall!");
    }

    int numberOfHoursPlayingGames = 1;
    System.out.println("I played " + numberOfHoursPlayingGames + " "
        + (numberOfHoursPlayingGames == 1 ? "hour" : "hours"));

    String stanceOnAnime;
    String nameOfAnime = "Naruto Shippuden";
    switch (nameOfAnime) {
      case "Naruto Shippuden":
        stanceOnAnime = "Naruto is my favorite anime of all time";
        System.out.println(stanceOnAnime);
        break;
      case "Attack on Titan":
        stanceOnAnime = "Attack on Titan is a great dark anime";
        System.out.println(stanceOnAnime);
        break;
      case "My Hero Academia":
        stanceOnAnime =
            "My Hero Acadmia is a fantastic anime and it has potential to be one of the best of all time";
        System.out.println(stanceOnAnime);
        break;
      default:
        System.out.println("Invalid");

    }

    double x = 5, y = 10, f = 15, z = 20;
    System.out.println(x * y);
    System.out.println(x + y);
    System.out.println(x / y);
    System.out.println(x - y);
    System.out.println(x % y);
    System.out.println(++f);
    System.out.println(--x);
    System.out.println(z += y);

    String a1 = "Naruto";
    String a2 = "Bleach";
    String a3 = "Naruto";
    System.out.println(a1.compareTo(a2));
    System.out.println(a1.equals(a3));
    // == is different than the equals method above
    // == compares the the objects location whereas the equals method compares the values
    // Operator precedence determines the grouping of terms in an expression and affects how an
    // expression is evaluated
    int numberX = 1;
    while (numberX < 10) {
      System.out.println(numberX);
      numberX++;
      if (numberX == 8) {
        break;
      }
    }
    System.out.println("This is a while loop that uses a break statement");
    // The while loop above prints the numbers one through ten
    // The break statement stops the loop from continuing when the number is equal to 8

    int numberY = 2;
    while (numberY < 9) {
      numberY++;
      if (numberY == 4) {
        continue;
      }
      System.out.println(numberY);
    }
    System.out.println("This is a while loop that uses a continue statment");
    // This time the while loop that is executed skips the iteration when numberY equals 4
    // Then continues until the loop condition is met


    for (int i = 5; i <= 6; i++) {
      System.out.println(i);
      System.out.println("This is a for loop");
    }

    int forNum = 7;
    do {
      System.out.println(forNum);
      forNum++;
    } while (forNum <= 10);
    System.out.println("This is a do-while loop");

    Test myPersonalInfo = new Test();
    myPersonalInfo.setName("Stephen Alexander Aranda");
    myPersonalInfo.setHeight(1.73);
    myPersonalInfo.setHobby("watching anime and playing Xbox");

    System.out.println("My full name is " + myPersonalInfo.getName());
    System.out.println("I am " + myPersonalInfo.getHeight() + " meters tall.");
    System.out.println("My favorite hobbies are " + myPersonalInfo.getHobby());

    Test c1 = new Test("Naruto Uzumaki");
    Test c2 = new Test();
    Test c3 = new Test();
    System.out.println(c1.getAnimename());
    System.out.println(c2.getAnimename());
    c3.twofavoritesports("Football is my favorite sport", "My second favorite sport is basketball");


    anime stephen[] = new anime[1];
    stephen[0] = new souleater();
    for (int ani = 0; ani < 1; ++ani) {
      stephen[ani].watch();
    }
    // inheritance is a mechanism wherein a new class is derived from an already existing class
    // it is useful because you can make your code more readable by minimizing the amount of
    // duplicate code
    // the code above uses polymorphism since it uses arrays
    // to call the watch method from the souleater class which is inherited from the anime class

    attackontitan show = new attackontitan();
    show.goodanime();
    // this code uses the super keyword to determine
    // which nameofanime string it prints in the child classes tokyoghoul and attackontitan which
    // are both in the parent class named anime

    videogames favoritegame = new videogames("Fallout 76 is currently my favorite video game");
    favoritegame.play();
    // the code above uses the this keyword to indicate that the
    // x variable inside the videogames constructor is equal to the global variable with the same
    // name in the videogames class

    videogames goatgame =
        new videogames("The Legend of Zelda: Ocarina of Time is the greatest game of all time");
    goatgame.play();

    int[] intArray = new int[2];
    intArray[0] = 21;
    intArray[1] = 12;
    System.out.println(intArray.length);
    array minimum = new array();
    int min = array.getMinValue(intArray);
    System.out.println(min);
    // a get method was created using a for loop which runs through the array and get the lowest
    // value

    int sum = 0;
    for (int i = 0; i < intArray.length; i++) {
      sum += intArray[i];

    }
    System.out.println(sum);

    int sum1 = 0;
    for (int i : intArray) {
      sum1 += i;

    }
    System.out.println(sum1);
    // the code above are two different ways to calculate the sum of an integer
    // array using an enhanced for loop to loop through the array


    String[] stringArray = {"hello", "goodbye"};
    System.out.println((Arrays.asList(stringArray).indexOf("hello")));
    // the code above uses a array of two strings, converts it to a list, and uses the indexOf
    // method to find the index of the word hello
    // which in this case is 0

    ArrayList<String> citieslivedin = new ArrayList<String>();
    citieslivedin.add("Redwood City");
    citieslivedin.add("Mt. Pocono");
    citieslivedin.add("Cape Coral");
    System.out.println(citieslivedin);
    // An array list was created here in which it holds the cities I have lived in before

    Integer[][] twoDarray = {{1, 21}, {25, 101, 202, 1000}};
    System.out.println(twoDarray[0].length);
    System.out.println(twoDarray[1].length);
    System.out.println((Arrays.asList(twoDarray[1]).indexOf(101)));
    // the code above declares, instantiates, and uses a multi-dimensional array which in this case
    // is two dimensional
    // the indexOf method is used here to search for the index of the value from the second set of
    // numbers

    int xcords = 0, ycords = 0;
    for (int i = 0; i < twoDarray.length; i++) {
      for (int j = 0; j < twoDarray[0].length; j++) {
        if (twoDarray[i][j] == 101) {
          xcords = i;
          ycords = j;
        }
      }

    }

    System.out.println("The x and y coordinates of 101 are: (" + xcords + "," + ycords + ")");
    // the code above uses for loops and an if statement to loop through the two dimensional array
    // and find the coordinates of the designated location


    int[] luckyNumbers = new int[] {14, 7, 22, 24};
    System.out.println("Index of 22 is: " + findIndexof(luckyNumbers, 22));


    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter first number:");
      int number1 = input.nextInt();
      System.out.println("Enter second number:");
      int number2 = input.nextInt();
      int sum2 = number1 / number2;
      System.out.println(sum2);
      input.close();
    } catch (Exception s) {
      System.out.println("You cannot do that silly");
    }
    // the code above uses exception handling so that if a user tries to divide by zero it prints
    // you cannot do that instead of crashing the entire program
    // 'Exception' inside the catch keyword with a letter next to it is the most broad exception
    // case

  }

  public static int max(int number1, int number2) { // Here the method is being declared, also
                                                    // called the method header, and inside the
                                                    // parenthesis are the parameters
    int result;
    if (number1 > number2)
      result = number1;
    else
      result = number2;
    return result;



  }


  public static int findIndexof(int[] luckyNumbers, int z) {
    if (luckyNumbers == null)
      return -1;
    int leng = luckyNumbers.length;
    int i = 0;
    while (i < leng) {
      if (luckyNumbers[i] == z)
        return i;
      else
        i = i + 1;
    }
    return -1;

  }
  // the method above is a method I created to loop through the one dimensional array called
  // luckyNumbers
  // and returns the index of the element when it is called


}
