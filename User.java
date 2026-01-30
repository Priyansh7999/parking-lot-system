public class User {
    private String id;
    private String name;
    private String role;

    public User(String name, String role) {
        this.id = java.util.UUID.randomUUID().toString();
        this.name = name;
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
}