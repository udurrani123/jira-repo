// This is a generated code for Check-in and Check-out Process feature based on JIRA Issue JNF-31

public class JNF31CheckInCheckOut {
    // Method to check in a user
    public void checkIn(String userId) {
        System.out.println("User " + userId + " has checked in.");
    }

    // Method to check out a user
    public void checkOut(String userId) {
        System.out.println("User " + userId + " has checked out.");
    }

    public static void main(String[] args) {
        JNF31CheckInCheckOut process = new JNF31CheckInCheckOut();
        process.checkIn("user123");
        process.checkOut("user123");
    }
}