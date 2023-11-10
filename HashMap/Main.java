import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {3,3};
        int target = 6;
        int[] res = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            hash.put(nums[i], i);
        }
        System.out.println(hash);

        for(int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if(hash.containsKey(diff))
            {
                res[0] = i;
                res[1] = diff;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}