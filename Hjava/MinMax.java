import java.util.Arrays;
class MinMax
{
    public static void main(String args[])
    {
        int arr[]={4,76,89,-234,555,-756,888,0,-693,444};
        int x=Integer.MIN_VALUE;
        int y=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x)
            {
                x=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<y)
            {
                y=arr[j];
            }
        }
        System.out.println("Minimum value is :"+y);
        System.out.println("max value is :" +x);
        int n[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            Arrays.sort(arr);

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(n[i]);
        }
       // System.out.println(Arrays.sort(arr));

    }
}
