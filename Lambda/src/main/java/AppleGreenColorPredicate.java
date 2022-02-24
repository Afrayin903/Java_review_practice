public class AppleGreenColorPredicate implements applePredicate, AppleFormatter{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }

    @Override
    public String accept(Apple a) {
        String appleMass = a.getWeight()>150 ? "heavy" : "light";
        return "A " + appleMass + " " + a.getColor() + " apple";
    }
}
