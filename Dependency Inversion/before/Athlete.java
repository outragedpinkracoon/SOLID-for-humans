public class Athlete {
  private int totalDistance;
  private AthleteConsoleLog log;

  public Athlete(){
    this.log = new AthleteConsoleLog();
  }

  public void run(int distance){
    totalDistance += distance;
    this.log.distance(distance, totalDistance);
  }
}