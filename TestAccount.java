public class TestAccount {

    public static void main(String[] args) {
  
        Account acc1 = new Account("X01", "Ramadan Mas", 7400);

    
        Account acc2 = new Account("Z02", "Ahmad Moh", 3500);

     
        System.out.println("Before transfer:");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        acc1.transfer(acc2, 1000);

        System.out.println("\nAfter transfer of $1000 from acc1 to acc2:");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}
