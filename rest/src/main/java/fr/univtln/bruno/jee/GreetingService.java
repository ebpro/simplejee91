package fr.univtln.bruno.jee;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String getGreetingTemplate(String language) {
        String result;
        switch (language) {
            case "fr" : result = "Bonjour %s"; break;
            case "de" : result = "Willkommen, %s"; break;
            default: result  = "Hello, %s";
        }
        return result;
    }
}