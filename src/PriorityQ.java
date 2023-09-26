import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {

        //PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int[] ranks={10,2,5,8,20};

        for(int val:ranks)
        {
            pq.add(val);
        }

        while(pq.size()>0)
        {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
