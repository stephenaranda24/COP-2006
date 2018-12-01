
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


class attackontitan extends tokyoghoul {
  void goodanime() {
    String nameofanime = "Attack on titan is a fantastic anime";
    System.out.println(super.nameofanime);
  }
}

