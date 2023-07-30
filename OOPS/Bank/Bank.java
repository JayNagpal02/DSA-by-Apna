package OOPS.Bank;

/**
 * There are 4 types of access modifiers in java
 * public => it can be access from anywhere
 * default => it can be access from anywhere in the package only
 * protected => it can be access from anywhere in the package and its children
 * classes from any package
 * private => it can be access only from inside the class itself where it is
 * declared
 */

class Account {
    public String name;
    protected String email;
    private String password;

    // getter and setter => they are used to access private properties
    public String getPassword() {
        String randomPassword = "abcdwxyz";
        setPassword(randomPassword);
        return this.password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "Bank";
        account.email = "bank@gmail.com";
        // account.password = "password"; // error : the field Account.password is not
        // visible
        // account.setPassword("abcdef");
        System.out.println(account.getPassword());
    }
}
