import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.next();

        String productType = switch(product){
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> "vegetable";
            default -> "unknown";
        };

        System.out.println(productType);
    }
}
