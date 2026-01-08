package pl.wiecek.javacore;

import java.util.HashMap;
import java.util.Map;


public class UserService {
    private Map<String, User> userMap = new HashMap<>();


    public void registerUser(User user) {
        if (userMap.containsKey(user.getEmail())){
            System.out.println("Taki email już istnieje.");

        } else {

            if (user.canRegister()){
                userMap.put(user.getEmail(), user);
                System.out.println("Uzytkownik zarejestrowany");
            }else {
                System.out.println("Nie można zarejestrować");
            }
    }

    }

    public void loginUser(User user){
        if(userMap.containsKey(user.getEmail())){
            System.out.println("Zalogowano");
        }else{
            System.out.println("Brak uzytkownika");
        }
    }

}
