public class bs {  
    static void bs(int[] a) {  
        int n = a.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int a[] ={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};      
                bs(a);   
                for(int i=0; i < a.length; i++){  
                        System.out.print(a[i] + " ");  
                }  
   
        }  
}  