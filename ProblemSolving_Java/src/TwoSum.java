
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        for (int i = 0; i < list.length-2; i++)
       	{
            for (int j = i+1; j<list.length-1; j++)
            {
            	if (list[i] + list[j] == sum)
                {
                    return new int[] {i,j};   
                }
            }
            
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
        int[] indices2 = findTwoSum(new int[] { 1, 3, 5, 8, 2 }, 12);
        if (indices2 != null){
            System.out.println(indices2[0] + " " + indices2[1]);
        }
        int[] indices3 = findTwoSum(new int[] { }, 12);
        if (indices3 != null){
            System.out.println(indices3[0] + " " + indices3[1]);
        }

    }
}