import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = sc.nextDouble();
        char sex = sc.next().charAt(0);

        String title;

        if(age >= 16){
            switch(sex){
                case 'm': title = "Mr."; break;
                case 'f': title = "Ms."; break;
                default: title = "Error"; break;
            }
        }else{
            switch(sex){
                case 'm': title = "Master"; break;
                case 'f': title = "Miss"; break;
                default: title = "Error"; break;
            }
        }

        System.out.println(title);
    }
}
