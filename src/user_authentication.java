// User Authentication Implementation

public class UserAuth {
    private Map<String, String> users = new HashMap<>();

    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("User already exists.");
            return false;
        }
        users.put(username, password);
        System.out.println("User " + username + " registered successfully.");
        return true;
    }

    public boolean login(String username, String password) {
        if (!users.containsKey(username)) {
            System.out.println("User not found.");
            return false;
        }
        if (!users.get(username).equals(password)) {
            System.out.println("Incorrect password.");
            return false;
        }
        System.out.println("User " + username + " logged in successfully.");
        return true;
    }
}

// Example Usage
class Main {
    public static void main(String[] args) {
        UserAuth userAuth = new UserAuth();
        userAuth.register("johnDoe", "password123");
        userAuth.login("johnDoe", "password123");
    }
}