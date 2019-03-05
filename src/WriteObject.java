import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Jack");
        Person person2 = new Person (2,"Donald");

        try {
            FileOutputStream fos = new FileOutputStream("src/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        }
        catch (IOException e) {
        System.out.println("Ошибка записи");
        }
    }
}
