package com.samuel.demoSpringMVC;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService {

    public void saveUser(User user) {
        // In a real app, you'd save to a database here
        System.out.println("User saved: " + user.getName());
    }

}
