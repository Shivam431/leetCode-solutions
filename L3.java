/*Given a string s, find the length of the longest substring without repeating characters.
*/
import java.util.*;
 public class L3 {
	public int lengthOfSubstring(String s)
	{
		Set<Character>set=new HashSet<>();
		int left=0,right=0;
		char []ch=s.toCharArray();
		int max=0;
		while(right<ch.length)
		{
			char cur=ch[right];
			while(set.contains(cur))
			{
				set.remove(left);
				left++;
			}
			set.add(cur);
			max=Math.max(max, set.size());
			right++;
		}
		return max;
		
	}
}
