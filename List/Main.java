import java.util.*;

public class Main
{
	public static void main(String[] args)
	{	
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<Integer>> res = new ArrayList<>();
		for(int i = 0; i < strs.length; i++)
		{
			res.add(strs[i]);
		}
		System.out.println(res);
	}
}