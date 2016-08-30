public class Athlete {
  private AthleteLog log;
  private int totalDistance;

  public Athlete(AthleteLog log){
    this.log = log;
  }

  public void run(int distance){
    totalDistance += distance;
    this.log.distance(distance, totalDistance);
  }

  public void setLog(AthleteLog log){
    this.log = log;
  }
}