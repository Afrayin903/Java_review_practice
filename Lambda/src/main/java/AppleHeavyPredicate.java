public class AppleHeavyPredicate implements applePredicate, AppleFormatter{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }

    @Override
    public String accept(Apple a) {
        return "An aplle of " + a.getWeight() + "g";
    }
}
