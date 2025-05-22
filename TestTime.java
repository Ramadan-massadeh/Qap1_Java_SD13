public class TestTime {

    public static void main(String[] args) {
         Time t1 = new Time(21, 10, 15);
          Time t2 = new Time(10, 20, 25);


        System.out.println("Before:");
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());


          t1.nextSecond();   
        t2.previousSecond();  


        System.out.println("\nAfter:");
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());
    }
}