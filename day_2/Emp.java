/*
Define a class "Emp" with private static member "int cnt". How will u make sure that outsiders can read the value of cnt ?
*/
public class Emp {
    
  private static int cnt = 7;

  private static void getCount() {
      System.out.println(cnt);
  }

  public static void main(String[] args) {
      Emp object1 = new Emp();
      object1.getCount();
  }

}