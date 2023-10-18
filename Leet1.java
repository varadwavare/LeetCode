/*
 Example 

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
public class Leet1 {

	public static void main(String[] args) {
		int nums[] = {1,6,3,4,5}, target = 9;
		
		int i = 1;
		int j = 1;

        for(i = 0; i <= 4; i++)
        {
            for(j = 1; j <= 4; j++ )
            {
                if (nums[i] + nums[j] == target)
                {
                    break;
                    
                }
            }
        }
        
        int arr[] = {i , j};
        
        for(int k = 0; k <= 1; k++)
        {
        	System.out.print(arr[k] +" ");
        }
	}

}
