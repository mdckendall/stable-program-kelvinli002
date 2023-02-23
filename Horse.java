class Horse {
  String name;
  double weight;
  boolean isTame;
  
  Horse(String name, double weight, boolean isTame) {
    this.name = name;
    this.weight = weight;
    this.isTame = isTame;
  }

  public String toString() {
    return "Name: " + name + " Weight: " + weight + " Tame: " + isTame;
  }
}