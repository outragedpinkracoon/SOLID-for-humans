public class Gymnast extends Athlete{
  private int pointsForExecution;
  private int pointsForDifficulty;
  
  public Gymnast(int pointsForDifficulty, int pointsForExecution) {
    this.pointsForExecution = pointsForExecution;
    this.pointsForDifficulty = pointsForDifficulty;
  }

  public int calculatePoints() {
    this.points = this.pointsForDifficulty + this.pointsForExecution;
    System.out.println("Gymnast gained: "+this.points+" points");
    return points;
  }
}