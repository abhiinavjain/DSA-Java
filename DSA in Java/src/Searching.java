public class Searching {
    public static void main(String[] args) {
        int[] arr={23,45,1,2,8,19,-3,16,-11,28};
        int target=19;
        System.out.println(linearsearch(arr,target));



    }
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }

            }
        return -1;
        }

    }
