/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/

import java.util.*;
public class L1 {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target)
				{
					System.out.print(i+" "+j);
					break;
				}
	
			}
		}
	}
}
