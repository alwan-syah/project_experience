
public class ArrayIntro {
    public static void main(String[] args) {
        String[] planets = { "mercury", "venus", "Earth", "mars", "jupiter", "Saturn", "Uranus", "Neptune" };

        for (String p : planets) {
            System.out.println(p + "\t" + p.toUpperCase());
        }
    }
}
