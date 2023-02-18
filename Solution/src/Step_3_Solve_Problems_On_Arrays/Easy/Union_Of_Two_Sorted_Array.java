package Step_3_Solve_Problems_On_Arrays.Easy;
import java.util.*;

public class Union_Of_Two_Sorted_Array {

    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }

        for(int val : set){
            list.add(val);
        }
        Collections.sort(list);
        return list;
    }
}
