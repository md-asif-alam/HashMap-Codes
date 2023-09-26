public class MaxmConOnes {

    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,1,0,1,1,0,0,1,1};
        int k=2;
        int res=maxConOnes(arr,k);
        System.out.println(res);
    }

    public static int maxConOnes(int[] arr,int k)
    {
        int j=-1;
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
            while(count>k)
            {
                j++;
                if(arr[j]==0)
                {
                    count--;
                }
            }
            int len=i-j;
            if(len>ans)
                ans=len;
        }
        return ans;
    }
}
