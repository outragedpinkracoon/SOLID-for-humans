public abstract class Athlete {

  protected int points;

  public void prepare(){
    System.out.println("Preparing for event");
  }

  public void compete() {
    System.out.println("I am competing");
  }

  public abstract int calculatePoints();

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
    prepare();
    compete();
    calculatePoints();
    recieveMedal();
  }
}