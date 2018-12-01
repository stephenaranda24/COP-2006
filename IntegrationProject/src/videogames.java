
public class videogames {
  String x;
  String y;

  videogames(String x) {
    this.x = x;
  }

  void play() {
    System.out.println(x);
  }

  void play(String y) {
    this.y = y;
    System.out.println(y);
  }

  // the methods above are overloaded since they have the same reference variable
}


