package model;
public class User {

    private long id;
    private  String name;
    private  String email;
    private String phone;
    private String registrationNumber;
    private  boolean active;

    public User() {
    }

    public User(boolean active, String phone, String registrationNumber, long id, String name, String email) {
        this.active = active;
        this.phone = phone;
        this.registrationNumber = registrationNumber;
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", active=" + active +
                '}';
    }
}
