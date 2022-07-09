import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*public class Main {
    public static void main(String[] args) {
        int[][] arrr={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arrr));
    }*/

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = Arrays
                .stream(a)
                .boxed()
                .collect(Collectors.groupingBy(e -> e,
                        Collectors.reducing(0, e -> 1, Integer::sum)));
        Set<Integer> aaa = map.keySet();
        Iterator<Integer> iterator=aaa.iterator();
        int iter;
        do {
            iter=iterator.next();
            if(map.get(iter)%2==1)return iter;
            else { continue;
            }

        }while (iterator.hasNext());
        return 0;
    }

}

