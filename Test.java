/**
 * Test
 */

 /**
  * InnerTest
  */
interface poly {
        
     void getArea();
 }
public class Test implements poly{

    public static void main(String[] args) {
        Test x = new Test();
        x.getArea();
    }

    @Override
    public void getArea() {
        System.out.println("area");
    }
}