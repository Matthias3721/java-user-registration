package pl.wiecek.javacore;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();

        User user1 = new User("Mateusz1","Matt1@gmail.pl", 10);
        User user2 = new User("Mateusz2","Matt2@gmail.pl", 20);
        User user3 = new User("Mateusz3","", 30);
        User user4 = new User("Mateusz3","Matt2@gmail.pl", 30);

        userService.registerUser(user1);
        userService.registerUser(user2);
        userService.registerUser(user3);
        userService.registerUser(user4);

        userService.loginUser(user1);
        userService.loginUser(user2);
        userService.loginUser(user3);
        userService.loginUser(user4);


    }

}