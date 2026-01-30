public class User {
    private String id;
    private String name;
    private String mobileNumber;
    private String role;

    public User(String name, String mobileNumber, String role) {
        this.id = java.util.UUID.randomUUID().toString();
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.role = role;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
}