import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

            ois.close();
        }
        catch (IOException e){
            System.out.println("Ошибка чтения");
        }
        catch (ClassNotFoundException e){
            System.out.println("Ошибка класса чтения файла");
        }
    }

}
