/*
5) Define 3 classes A , B and C
  in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.
*/

class A{
  private int num = 16;
  private static int cnt = 0;

  {
    cnt++;
  }
  public void getNum() {
     System.out.println(this.num);
  }

  public static void getCnt() {
    System.out.println("the count of A is " + cnt);
  }
};

class B{
  private int num2 = 9;
  private static int cnt = 0;
  {
      cnt++;
  }
  public void getNum() {
      System.out.println(this.num2);
  }
  public static void getCnt() {
      System.out.println("the count of B is " + cnt);
  }
};

class C{
  private int num3 = 1996;
  private static int cnt = 0;
  {
      cnt++;
  }
  public void getNum() {
      System.out.println(this.num3);
  }
  public static void getCnt() {
      System.out.println("the count of C is " + cnt);
  }
};

public class Demo {
  public static void main(String[] args) {
    A a1 = new A();
    a1.getNum();
    A.getCnt();

    B b1 = new B();
    B b2 = new B();
    b1.getNum();
    B.getCnt();


    C c1 = new C();
    C c2 = new C();
    C c3 = new C();
    c1.getNum();
    C.getCnt();
  }
}