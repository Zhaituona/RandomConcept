package randomConcept;
import java.util.Random;

public class UseRandom {
    public static void main(String[] args) {
        Random rd = new Random();
        // int [] ary = new int  [8];
        //System.out.println(a)
        int a;

        //double d =rd.nextDouble();
        // System.out.println(d);

        //for(int i = 0; i< ary.length;i++){// random number generate .
        // ary[i] = 1+ rd.nextInt(10);

        // System.out.println(ary[i]);


        for (int count = 0; count <= 10; count++) {
            //a=rd.nextInt(6);  //this is start from 0, computer count from0 .
            a = 1 +rd.nextInt(6);
            System.out.println(a);
        }


    }
}

