import java.io.*;

public class AthleteFileLog implements AthleteLog {

  public void distance(int lastRunDistance, int totalDistance) {
    String thisRun = "This run was "+lastRunDistance+" meters";
    String totalRuns = "I have ran "+totalDistance+" meters in total";
    try {
      log(thisRun, totalRuns);
    }
    catch(FileNotFoundException ex) {
      System.out.println("Failed to write file "+ex.getMessage());
    }
  }

  private void log(String lastRunDistance, String totalDistance) throws FileNotFoundException {
    PrintWriter writer = new PrintWriter("athleteLog.txt");
    writer.println(lastRunDistance);
    writer.println(totalDistance);
    writer.close();
  }

}