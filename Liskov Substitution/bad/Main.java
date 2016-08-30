class Main {
  public static void main(String[] args){
    Athlete athlete = new Athlete(new AthleteConsoleLog());
    athlete.run(10);   
    Athlete athlete2 = new Athlete(new AthleteFileLog());
    athlete.run(2);
  }
}