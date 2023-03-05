package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

public class Merge_Without_Extra_Space {

    //Using Gap Method.
    public static void merge(long arr1[], long arr2[], int n, int m){
        int gap =(int) Math.ceil((double)(n+m)/2.0);

        while(gap>0 ){
            int i=0;
            int j=gap;

            while(j<n+m){
                if(j<n && i<n && arr1[i]>arr1[j]){
                    long temp = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
                if(j>=n && i<n && arr1[i]>arr2[j-n]){
                    long temp = arr1[i];
                    arr1[i]=arr2[j-n];
                    arr2[j-n]=temp;
                }
                if(j>=n && i>=n && arr2[i-n]>arr2[j-n]){
                    long temp = arr2[i-n];
                    arr2[i-n]=arr2[j-n];
                    arr2[j-n]=temp;
                }
                i++;
                j++;
            }
            if(gap==1){
                gap=0;
            }else{
                gap=(int)Math.ceil((double)gap/2.0);
            }

        }


    }

 // Simple Method
    //  public static void merge(long arr1[], long arr2[], int n, int m){
    //      int i=0;

    //      while(i<n ){
    //          if(arr1[i]>arr2[0]){

    //              long temp=arr1[i];
    //             arr1[i]=arr2[0];
    //             arr2[0]=temp;

    //           long first = arr2[0];

    //              int k=1;
    //              while(k<m && arr2[k]<first){
    //                  arr2[k-1]=arr2[k];
    //                  k++;
    //              }

    //              arr2[k-1]=first;



    //          }
    //          i++;
    //      }


    // }
}
