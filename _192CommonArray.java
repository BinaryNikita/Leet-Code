public class _192CommonArray {
    public static void main(String[] args) {
        //39. Find the common elements between the arrays [1, 2, 3] and [2, 3, 4].
       int[] arr1 = {1, 2, 3, 5};
       int[] arr2 = {2, 3, 4, 5};

       for(int i = 0; i < arr1.length; i++){
        for(int j = 0; j < arr2.length; j++){
          if(arr1[i] == arr2[j]){
            System.out.println(arr1[i]);
          }
        }
       }
  
  }
        
    }
