public class Boxer extends Athlete {
  private int hitsTaken;
  private int hitsGiven;

  public Boxer(int hitsGiven, int hitsTaken) {
    this.hitsTaken = hitsTaken;
    this.hitsGiven = hitsGiven;
  }

  public int calculatePoints() {
    this.points = this.hitsGiven - this.hitsTaken;
    System.out.println("Boxer gained: "+this.points+" points");
    return points;
  }

}