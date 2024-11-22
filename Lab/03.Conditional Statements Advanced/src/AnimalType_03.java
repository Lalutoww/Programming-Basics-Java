import java.util.Scanner;

public class AnimalType_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animal = sc.next();
        String animalType;

        switch (animal){
            case "dog": animalType = "mammal"; break;
            case "crocodile": animalType = "reptile"; break;
            case "tortoise": animalType = "reptile"; break;
            case "snake": animalType = "reptile"; break;
            default: animalType = "unknown"; break;
        }

        System.out.println(animalType);
    }
}
