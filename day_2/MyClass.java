public class MyClass {
  int a;
  int b;
  public MyClass(){
    this.a=0;
    this.b=0;
    System.out.println("a) without any argument");
  }
  public MyClass(int a){
    this.a=a;
    this.b=0;
    System.out.println("b) with one int argument");
  }
  public MyClass(int a, int b){
    this.a=a;
    this.b=b;
    System.out.println("c) with two int arguments");
  }
  public void getNum(){
    System.out.println(this.a + " " + this.b);
  }
  public static void main(String[] args) {
    MyClass o1= new MyClass();
    o1.getNum();
    MyClass o2= new MyClass(100);
    o2.getNum();
    MyClass o3= new MyClass(100,200);
    o3.getNum();
  }
}