/* For Sorting in Ascending :
*  Take the minimum from array and place it at the 0th Index
*  Then take the minimum from remaining array and place it at 1st
*  So on and so Forth.................
* So :
*       The minimum taking part is the repeated part and needs to be placed under a loop. (1st loop)
*       Compare the i-th element with all other and find minimum
*       Then place it at i-th position
*       Array is shortened accordingly (2nd Loop)
*/

class SelectionSorting
{
    public static void SS(int[] arr)
    {
        int min , i , j ;
        for(i =0;i<arr.length-1;i++)
        {
            min = arr[i];

            for(j = i+1;j<arr.length;j++)
            {
                if (arr[j]<min)
                {
                    min = arr[j];
                    arr[i]=arr[j];
                }

            }
        }
    }
}