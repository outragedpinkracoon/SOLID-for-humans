public class Athlete {
  private AthleteConsoleLog log;
  private int totalDistance;

  public Athlete(){
    this.log = new AthleteConsoleLog();
  }

  public void run(int distance){
    totalDistance += distance;
    this.log.distance(distance, totalDistance);
  }
}