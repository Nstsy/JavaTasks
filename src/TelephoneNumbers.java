import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Написать простой класс Телефонный Справочник, который хранит в
себе список фамилий и телефонных номеров. В этот телефонный
справочник с помощью метода add() можно добавлять записи, а с
помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов
(в случае однофамильцев), тогда при запросе такой фамилии
должны выводиться все телефоны.
 */

public class TelephoneNumbers {
    private Map<String, List<String>> phoneBook;

    public TelephoneNumbers() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> phoneNumbers = phoneBook.getOrDefault(surname, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(surname, phoneNumbers);
    }

    public void get(String surname) {
        System.out.println(phoneBook.getOrDefault(surname, new ArrayList<>()));
    }
}

class DemoTelephoneNumbers {
    public static void main(String[] args) {

        TelephoneNumbers telephoneNumbers = new TelephoneNumbers();

        telephoneNumbers.add("Ivanov", "+375-29-234-54-65");
        telephoneNumbers.add("Ivanov", "+375-33-555-77-45");
        telephoneNumbers.add("Petrov", "+375-29-344-98-55");
        telephoneNumbers.add("Sidorov", "+375-29-234-55-33");
        telephoneNumbers.add("Sidorov", "+375-29-234-55-33");
        telephoneNumbers.add("Kirov", "+375-33-111-55-23");
        telephoneNumbers.add("Black", "+375-29-385-94-09");

        telephoneNumbers.get("Ivanov");
        telephoneNumbers.get("Black");
    }
}
