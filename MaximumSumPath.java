/*Q2:Find maximum sum path involving elements of given arrays
Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
We can start from either array, but we can switch between arrays only through its common elements.

For example,

Input: X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 }
Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }  
The maximum sum path is: 1 —> 2 —> 3 —> 6 —> 7 —> 9 —> 10 —> 12 —> 15 —> 16 —> 18 —> 100 
The maximum sum is 199*/

public class MaximumSumPath {
    public static int maxSumPath(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
            {
                sum1 += arr1[i++];
            }
            else if (arr1[i] > arr2[j]) 
            {
                sum2 += arr2[j++];
            } 
            else
            {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        
        while (i < m) 
        {
            sum1 += arr1[i++];
        }

        
        while (j < n)
        {
            sum2 += arr2[j++];
        }

        
        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args)
    {
        int[] arr1 = { 2, 3, 7, 10, 12, 15, 30, 34 };
        int[] arr2 = { 1, 5, 7, 8, 10, 15, 16, 19 };

        int maxSum = maxSumPath(arr1, arr2);
        System.out.println("Maximum sum path: " + maxSum);
    }
}