import java.util.Arrays;

public class printarrinrev {
    public static void main(String[] args)
    {
        int[] arr= {1,4,6,8,9,20};
        for(int i=arr.length-1; i>=0;i--)
        {
            System.out.println(Arrays.toString(arr));

        }
    }
}
