package pl.edu.wszib;

import org.springframework.web.client.RestTemplate;
import pl.edu.wszib.model.ServiceResponse;
import pl.edu.wszib.model.User;

import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String url = "http://localhost:8080/user";

        RestTemplate restTemplate = new RestTemplate();

        ServiceResponse response = restTemplate.getForObject(url,
                ServiceResponse.class,
                new HashMap<>());

        for(User user : response.getUserList()) {
            System.out.println(user);
        }

        int a = 5;
        Integer b = 5;

        Integer c = a;
        int d = b;
    }
}
