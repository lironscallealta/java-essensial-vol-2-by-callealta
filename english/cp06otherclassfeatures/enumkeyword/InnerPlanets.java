package english.cp06otherclassfeatures.enumkeyword;

public class InnerPlanets {

    public static final int MERCURY = 0;
    public static final int VENUS = 1;
    public static final int EARTH = 2;
    public static final int MARS = 3;

    public static void main(String args[]) {

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case MERCURY:
                    System.out.println("Mercury");
                    break;
                case VENUS:
                    System.out.println("Venus");
                    break;
                case EARTH:
                    System.out.println("Earth");
                    break;
                case MARS:
                    System.out.println("Mars");
                    break;
                default:
                    System.out.println("Other planets");

                
            }
        }
    }
}