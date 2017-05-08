package assign01;

/*****
 * import scanner to get input from the user.
 */

import java.util.Scanner;

public class User {

    private String password;
    private String salt;
    private String hash;

    public User(String password) { this.password = password;}

    public User(String salt, String hash) {
      this.password = password;
        this.salt = salt;
        this.hash = hash;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getHashedPassword() {
        return hash;
    }

    public void setPassword(String password) { this.password = password;}

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setHashedPassword(String hash) {
        this.hash = hash;
    }


    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pass = input.next();

        User user = new User(pass);
        //hashUserPassword(user);
        //user.setPassword(inString);
       // verifyPassword(user);



    }
}
