public class Rearrange2 {
    public static void main(String []ar)
    {
        int arr[]={1,-1,2,-2,3,-3};int flag;
        for(int i=0;i<arr.length-1;i++)
        {
            flag=0;
            if(arr[i]>0)
            {
               for(int j=i+1;j<arr.length;j++)
               {
                if(arr[j]<0)
                {
                    flag=1;
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    break;
                }
               }
               if(flag==0)
               {
                break;
               }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
