import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEg {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,4,5,32,9);

        // Stream<Integer> s1 = num.stream();

        // Stream<Integer> s2 = s1.filter(n -> n%2==0);

        // Stream<Integer> s3 = s2.map(n -> n*2);
        
        // Integer result  = s3.reduce(0, (c,e)->c+e);

        Integer result  = num.stream()
                            .filter(n->n%2==0)
                            .map(n->n*2)
                            .reduce(0, (c,e)->c+e);

        System.out.println(result);


    }
}
