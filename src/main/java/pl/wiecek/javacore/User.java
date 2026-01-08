package pl.wiecek.javacore;

public class User {
    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }


    public String getEmail(){
        return email;
    }

    public boolean isAdult(){
        return age>=18;
    }

    public boolean canRegister() {
        return isAdult() && hasEmail();
    }

    public boolean hasEmail() {
        return email != null && !email.isEmpty();
    }
}

