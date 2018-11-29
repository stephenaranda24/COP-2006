
public class Test {

  private String fullname;
  private double overallheight;
  private String favoritehobby;
  private String animeName;

  public Test() {

  }

  public Test(String n) {
    animeName = n;
  }
//above are two constructors also known as overloading a constructor
// inheritance allows classes to inherit commonly used states and behaviors from other classes
  
  public void setAnimename(String n) {
    animeName = n;
  }

  public void setName(String name) {
    fullname = name;
  }

  public void setHeight(double height) {
    overallheight = height;
  }

  public void setHobby(String hobby) {
    favoritehobby = hobby;
  }

  public String getName() {
    return fullname;
  }

  public double getHeight() {
    return overallheight;
  }

  public String getHobby() {
    return favoritehobby;
  }

  public String getAnimename() {
    return animeName;
  }
  // This entire class is made up of get and set methods
  // along with constructors with and without parameters
}

