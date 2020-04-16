import java.util.Scanner;

public class ValidateEmail{
    public static void main(String[] args) {
        EmailExample email = new EmailExample();
//        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập email : ");

//        boolean result = email.validate(scanner.nextLine());
        String email1 = "a@gmail.com";
        String email2 = "ab@yahoo.com";
        String email3 = "abc@hotmail.com";
        String email4 = "@gmail.com";
        String email5 = "ab@gmail.b";
        String email6 = "@#abc@gmail.com";

        System.out.println(email.validate(email1));
        System.out.println(email.validate(email2));
        System.out.println(email.validate(email3));
        System.out.println(email.validate(email4));
        System.out.println(email.validate(email5));
        System.out.println(email.validate(email6));
    }
}