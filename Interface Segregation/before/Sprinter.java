public class Sprinter implements Olympian {
  private int totalDistance;
  private int hydration;

  public void sprint(int distance){
    totalDistance += distance;
  }

  public void drinkWater() {
    hydration++;
  }

  public void jumpHurdle() {
    hydration--;
  }

  public void swim() {
    throw new RuntimeException();
  }

  public void comeUpForAir() {
    throw new RuntimeException();
  }

  public void pedal() {
    // do nothing
  }

  public void brake() {
    // do nothing
  }
}