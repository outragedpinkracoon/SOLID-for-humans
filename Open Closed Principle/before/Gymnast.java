public class Gymnast {
  private int pointsForExecution;
  private int pointsForDifficulty;
  private int points;

  public Gymnast(int pointsForDifficulty, int pointsForExecution) {
    this.pointsForExecution = pointsForExecution;
    this.pointsForDifficulty = pointsForDifficulty;
  }

  public void warmUp(){
    System.out.println("Warming up");
  }

  public void compete() {
    System.out.println("I am competing");
  }

  public int calculatePoints() {
    this.points = this.pointsForDifficulty + this.pointsForExecution;
    System.out.println("Gymnast gained: "+points+" points");
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