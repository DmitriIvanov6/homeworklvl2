package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        String[] myArray = {"accuse", "discourage", "convert", "assumption",
                "usage", "behave", "assumption", "duty", "allow",
                "allow", "eraser", "usage", "commit", "accuse", "duty", "duty"
        };
        WordsArray wordsArray = new WordsArray();
        wordsArray.findUniqueWord(myArray);

        Phonebook phonebook = new Phonebook();
        phonebook.add("123321", "Smith");
        phonebook.add("123322", "Johnson");
        phonebook.add("123323", "Taylor");
        phonebook.add("123324", "Cooper");
        phonebook.add("123325", "Cooper");
        phonebook.add("123326", "Thompson");
        phonebook.add("123327", "Anderson");
        phonebook.add("123328", "Harris");
        phonebook.add("123329", "Anderson");
        phonebook.add("123320", "Smith");
        phonebook.viewAll();
        phonebook.get("Thompson");
        phonebook.get("Cooper");
        phonebook.get("Anderson");

    }
}
