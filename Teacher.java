import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        person person = new Person();
        String institutionName;
        String courser;
        Scanner input = new Scanner(System.in);
        System.out.println("enter name:");
        person.name=input.nextLine();
        System.out.println("enter age:");
        persom.age=input.nextInt();
        input.nextInt();
        System.out.println("enter address:");
        person.address=input.nextLine();
        System.out.println("enter institutionName:");
        institutionName=input.nextLine();
        System.out.println("enter courser:");
        courser=intput.nextLine();
        System.out.println("name"+ person.name + ",age" + person.age + ",address" + person.address + ",institutionName" + ",couser" + courser);

    }
    
}
