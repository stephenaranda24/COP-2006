
public class anime {
  void watch() {
    System.out.println("This anime is an elite show");
  }
}


class souleater extends anime {
  void watch() {
    System.out.println("Souleater is an elite show");
  }
}



class tokyoghoul extends anime {
  String nameofanime = "Tokyo Ghoul is a fantastic anime";

}
// these methods above are used to print out the messages in the parameters


class attackontitan extends tokyoghoul {
  void goodanime() {
    String nameofanime = "Attack on titan is a fantastic anime";
    System.out.println(super.nameofanime);
    // the code above makes use of the super key word to access the original object called
    // nameofanime
  }
}

