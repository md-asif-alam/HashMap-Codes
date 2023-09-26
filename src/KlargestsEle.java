import java.util.Collections;
import java.util.PriorityQueue;

public class KlargestsEle {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int[] arr={10,2,5,8,20};

        int k=3;
        for(int i=0;i<arr.length;i++)
        {
            if(i<k)
            {
                pq.add(arr[i]);
            }
            else if(arr[i]>pq.peek())
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        while(pq.size()>0)
        {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
