public class Athlete {
  private int totalDistance;

  public void run(int distance){
    totalDistance += distance;
    writeDistanceLog(distance, totalDistance);
  }

  public void writeDistanceLog(int distance, int totalDistance){
    String thisRun = "This run was "+distance+" meters";
    String totalRun = "I have ran "+totalDistance+" meters in total";
    System.out.println(thisRun);
    System.out.println(totalRun);
  }
}