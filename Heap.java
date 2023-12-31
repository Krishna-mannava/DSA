import java.util.*;
public class Heap{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int checkArray[] = {3,2,4,-4,-9};
        queue.addAll(Arrays.asList(Arrays.stream(checkArray) // IntStream
        .boxed()                // Stream<Integer>
        .toArray(Integer[]::new)));
        int noOfmin = sc.nextInt();
        for(int i=0;i<noOfmin;i++)
            System.out.println(queue.poll()); //peek() pulls the top element from queue i.e., minimum element each time from the priority queue

    }
}