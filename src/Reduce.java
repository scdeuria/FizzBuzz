import org.w3c.dom.ls.LSOutput;

public class Reduce {
    public static void main(String[] args) {
        int i = 10;
        int count = 0;
        while (i > 0){
            boolean divisibleBy2 = i % 2 == 0;

            if (divisibleBy2){
                i= i / 2;
                count++;

            } else {
                i = i - 1;
                count++;
            }

            }
        System.out.println(count);
        }
    }
