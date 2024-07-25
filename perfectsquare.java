import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int no=e.nextInt();
        int arr[]=new int[no];
        for(int i=0;i<no;i++) 
        {
            arr[i]=e.nextInt();
        }
        int sops=0;
        for(int i=0;i<no;i++)
        {
            int sqroot=(int)Math.sqrt(arr[i]);
            if (sqroot*sqroot==arr[i]&&arr[i]>0)
            {
                sops+=arr[i];
            }
        }
        System.out.println(sops);
    }
}
