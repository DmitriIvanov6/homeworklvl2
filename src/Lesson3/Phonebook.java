package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, String> phonebook = new HashMap<>();

    public void add(String number, String surname) {
        phonebook.put(number, surname);
    }

    public void get(String surname) {
        ArrayList<String> keys = new ArrayList<>(phonebook.keySet());
        ArrayList<String> values = new ArrayList<>(phonebook.values());
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            if (surname.equals(values.get(i))) {
                answer.add(keys.get(i));
            }
        }
        System.out.println(surname + " : " + answer);
    }

    public void viewAll() {
        System.out.println(phonebook);
    }
}
