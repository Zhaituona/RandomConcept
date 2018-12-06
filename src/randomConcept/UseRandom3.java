package randomConcept;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UseRandom3 {

    public static void main(String[] args) {
        Random ran = new Random();

        List<String> list = new ArrayList<String>();
        // List<String> list = new List<String>(); not working , cause List is a interface
        // we cannot initialize a interface , ArrayList class implement List interface
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        System.out.println(list.size());

        for(int i = 0; i <list.size(); i ++){
           // System.out.println(list.get(i));
            int index = ran.nextInt(list.size());

            System.out.println("Index " + index + " item "+ list.get(i) );
        }



    }
}
