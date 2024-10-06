package lesson_2;/*
Создать класс lesson_2.Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
времени их работы и стоимость.
 */
/*
Создать класс lesson_2.Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
времени их работы и стоимость.
 */

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String attractionName, String workingHours, double price) {
        Attraction attraction = new Attraction(attractionName, workingHours, price);
        attractions.add(attraction);
    }

    public void infoParkAttractions() {
        System.out.println("Парк: " + name);
        for (Attraction attraction : attractions) {
            attraction.infoAttraction();
        }
    }

    private class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void infoAttraction() {
            System.out.println("Аттракцион:" +
                    "название аттракциона = " + attractionName +
                    ", время работы = " + workingHours +
                    ", стоимость = " + price
            );
        }
    }
}
