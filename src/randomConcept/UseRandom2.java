package randomConcept;
import java.util.Random;
import java.util.Arrays;

public class UseRandom2 {
    public static void main(String[] args) {
        Random re = new Random();
        int  [] ary = new int[8];



        for(int a = 0; a <10;a++) {// generate Random number
            int b = 1 + re.nextInt(8);// bound it means the range , start form 0 ,
            // it means choosing random number that is from between 1 and 8 .
            System.out.println(b);
        }
            System.out.println("**********");
            for(int c=0;c<6;c++){
                double x = re.nextDouble();
                System.out.println(x);
            }
        System.out.println("*******************");
            for(int k =0; k<ary.length; k++){// generate an arrays
                ary[k] = re.nextInt(120);
                int index = re.nextInt(ary.length);
                System.out.println("Index  " + index+  ":"  + ary[k]);
            }

        }
    }

