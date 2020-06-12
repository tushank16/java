public class shape {
  int heigth;
  int width;
  shape(){
    this.heigth = 0;
    this.width = 0;
  }
  shape(int h, int w){
    this.heigth = h;
    this.width = w;
  }
  public int getHeight(){
    return this.heigth;
  }
  public int getWidth(){
    return this.width;
  }
  public static void main(String[] args) {
    shape foo1 = new shape();
    System.out.println(foo1.getHeight());
    System.out.println(foo1.getWidth());
    shape foo2 = new shape(10,20);
    System.out.println(foo2.getHeight());
    System.out.println(foo2.getWidth());
  }
}