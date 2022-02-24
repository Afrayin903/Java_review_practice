import java.util.ArrayList;
import java.util.List;

public class appleTest {
    private static List<Apple> inventory;

    public static void main(String[] args) {
       List<Apple> inventory = new ArrayList<Apple>();
       //inventory.add(new Apple(Color.GREEN, 300));
       //inventory.add(new Apple(Color.RED, 250));
       inventory.add(new Apple(Color.GREEN, 120));
        inventory.add(new Apple(Color.RED, 155));
        inventory.add(new Apple(Color.GREEN, 80));

        //List<Apple> heavyApple = filterApple(inventory, new AppleHeavyPredicate());
        //List<Apple> greenApple = filterApple(inventory, new AppleGreenColorPredicate());
        prettyPrintApple(inventory, new AppleGreenColorPredicate());
        prettyPrintApple(inventory, new AppleHeavyPredicate());

    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter) {
        for (Apple app2 : inventory) {
            String output = appleFormatter.accept(app2);
            System.out.println(output);
        }
    }
//    private static List<Apple> filterApple(List<Apple> inventory, applePredicate apple) {
//        List<Apple> result = new ArrayList<>();
//
//        for (Apple app: inventory) {
//            if(apple.test(app)){
//                result.add(app);
//            }
//        }
//        return result;
//    }

}
