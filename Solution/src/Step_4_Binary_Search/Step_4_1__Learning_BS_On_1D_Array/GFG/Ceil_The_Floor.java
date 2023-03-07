package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;

   class Pair{
    int floor, ceil;

    public Pair() {
        this.floor=0;
        this.ceil=0;
    }

    public Pair(int f , int c) {
        this.floor=f;
        this.ceil=c;
    }

       @Override
       public String toString() {
           return "Pair{" +
                   "floor=" + floor +
                   ", ceil=" + ceil +
                   '}';
       }
   }

public class Ceil_The_Floor {

    Pair getFloorAndCeil(int[] arr, int n, int x) {

        int f =-1;
        int c =-1;

        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                if(f==-1) f=arr[i];
                if(f<arr[i]){
                    f=arr[i];
                }

            }
            if(arr[i]>= x ){
                if(c!=-1 && arr[i]<c){
                    c=arr[i];
                }else if(c==-1)
                    c=arr[i];
            }
        }

        Pair ans = new Pair(f,c);
        return ans;
    }
}
