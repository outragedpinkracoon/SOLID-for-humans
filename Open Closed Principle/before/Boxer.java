public class Boxer {
  private int hitsTaken;
  private int hitsGiven;
  private int points;

  public Boxer(int hitsGiven, int hitsTaken) {
    this.hitsTaken = hitsTaken;
    this.hitsGiven = hitsGiven;
  }

  public void warmUp() {
    System.out.println("Warming up");
  }

  public void compete() {
    System.out.println("I am running in a race");
  }

  public int calculatePoints() {
    this.points = this.hitsGiven - this.hitsTaken;
    System.out.println("Boxer gained: "+points+" points");
    return points;
  }

  public void recieveMedal() {
    String medal = "None";
    if(this.points >= 15) {
      medal = "Gold";
    }
    else if(points >= 10 && points <= 14) {
      medal = "Silver";
    }
    else if(points >= 5 && points <= 9) {
      medal = "Bronze";
    }
    System.out.println("Medal gained: "+ medal);
  }

  public void enterEvent(){
    warmUp();
    compete();
    calculatePoints();
    recieveMedal();
  }
}