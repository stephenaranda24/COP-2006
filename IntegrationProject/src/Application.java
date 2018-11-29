import java.util.Random;

public class Application {

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
    System.out.println(c1.getAnimename());
    System.out.println(c2.getAnimename());

    anime stephen[] = new anime[1];
    stephen[0] = new souleater();
    for (int ani = 0; ani < 1; ++ani) {
      stephen[ani].watch();
    }
    // the code above uses polymorphism since it uses arrays
    // to call the watch method from the souleater class which is inherited from the anime class

    attackontitan show = new attackontitan();
    show.goodanime();
    //this code uses the super keyword to determine
    //which nameofanime string it prints in the child classes tokyoghoul and attackontitan which are both in the parent class named anime
    
    videogames favoritegame = new videogames("Fallout 76 is currently my favorite video game");
    favoritegame.play();
    //the code above uses the this keyword to indicate that the
    //x variable inside the videogames constructor is equal to the global variable with the same name in the videogames class
    
    
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

};
