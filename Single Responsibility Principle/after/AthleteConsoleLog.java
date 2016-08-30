public class AthleteConsoleLog {

  public void distance(int lastRunDistance, int totalDistance) {
    String thisRun = "This run was "+lastRunDistance+" meters";
    String totalRun = "I have ran "+totalDistance+" meters in total";
    System.out.println(thisRun);
    System.out.println(totalRun);
  }
}