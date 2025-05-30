public class Account{
    private String id ;
    private String name;
    private int balance = 0;

    public Account(String id , String name){
        this.id= id;
        this.name = name;
    }
     public Account(String id , String name, int balance){
        this.id= id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
    
      balance += amount;
      return balance;

    }
    public int debit (int amount){
        if (amount <= balance){
           return balance -=amount;
        }

        else {
               System.out.println("Amount exceeded balance");
             }
        return balance;
    }
public int transfer(Account toAccount, int amount) {
    if (amount <= balance) {
        this.balance -= amount;
        toAccount.credit(amount);  
    } else {
        System.out.println("Amount exceeded balance");
    }
    return balance;
}
public String toString() {
    return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
}


}