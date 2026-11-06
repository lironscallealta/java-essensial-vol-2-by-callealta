package english.cp05otherclassfeatures.enumkeyword;

public class PlanetWithDataExample {

    enum Planet {
        MERCURY("Planet Mercury", 1),
        VENUS("Planet Venus", 2),
        EARTH("Planet Earth", 3),
        MARS("Planet Mars", 4);

        private final String description;
        private final int position;

        // Each enum constant passes its data to this constructor.
        Planet(String description, int position) {
            this.description = description;
            this.position = position;
        }

        public String getDescription() {
            return description;
        }

        public int getPosition() {
            return position;
        }
    }

    public static void main(String[] args) {
        Planet planet = Planet.EARTH;

        System.out.println(planet); // EARTH
        System.out.println(planet.getDescription()); // Planet Earth
        System.out.println(planet.getPosition()); // 3
    }
}