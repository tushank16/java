/*
4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)
*/

public class DemoOb {
  int num;
  DemoOb(final int a) {
    this.num = a;
  }

  public int getNum() {
    return this.num;
  }

  public static void main(final String[] args) {
    final DemoOb object = new DemoOb(10);
    System.out.println(object.getNum()); //op:- 10

    DemoOb ref = object;
    System.out.println(ref.getNum()); //op:- 10
    // Created a reference object of object and call the same methods
    ref = new DemoOb(16);

    System.out.println(ref.getNum()); //op:- 16 
    System.out.println(object.getNum()); //op:- 10
    /*the address of a new object is stored inside the ref i.e. the value inside it is replaced by the address of the newly created object */
  }
}