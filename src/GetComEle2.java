import java.util.HashMap;

public class GetComEle2 {

    public static void main(String[] args) {
        int[] a1={1,1,2,3,4,5,5};
        int[] a2={1,1,2,4,5,5};

        HashMap<Integer,Integer> fmap=new HashMap<>();

        for(int val:a1)
        {
            if(fmap.containsKey(val))
            {
                int of=fmap.get(val);
                int nf=of+1;
                fmap.put(val,nf);
            }
            else{
                fmap.put(val,1);
            }
        }

        for(int val:a2)
        {
            if(fmap.containsKey(val) && fmap.get(val)>0)
            {
                System.out.println(val);
                int of=fmap.get(val);
                int nf=of-1;
                fmap.put(val,nf);
            }
        }
    }
}
