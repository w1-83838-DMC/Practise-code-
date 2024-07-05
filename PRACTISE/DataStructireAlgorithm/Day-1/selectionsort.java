
//public class selectionsort {


//     public static void selectionsort(int arr[],int key)
//     {
//         for(int i=0; i<arr.length-1; i++)
//         {
//             for(int j=i+1; j<arr.length; j++)
//             {
//                 if(arr[i]>arr[j])
//                 {
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;

//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int arr[]={44,11,55,22,66,33};
//         System.err.println("Array before sorted "+Arrays.toString(arr));
//         selectiosort(arr,arr.length);
//         System.out.println("Array before sorted "+ Arrays.toString(arr));
    
        
//     }
// }

/// Arrray sorted in Ascending order 

// import java.util.Arrays;

// public class selectionsort{

//     public static void selectionsort(int arr[], int n)  //11   
//     {          // o to i<11-1;10  o<10  means o to 9
//         for(int i=0; i<n-1; i++)
//         {
//             for(int j=i+1; j<n; j++)
//             {
//                 if(arr[i] > arr[j])
//                 {
//                     int temp=arr[i];
//                     arr[i]= arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }

//     }
//     public static void main(String[] args) {
//         int arr[]={11,56,54,76,43,87,43,98,54,32,86};
//         System.out.println("Array Before sorted "+Arrays.toString(arr));
//         selectionsort(arr, arr.length);
//         System.out.println("Array After sorted "+ Arrays.toString(arr));

//     }
// }


// Arrays sorted in Descending order 

import java.util.Arrays;

class selectionsort{

    public static void selectionsort(int arr[], int n)
    {
        for(int i=0; i<n-1; i++)
        {
            for(int j=1;j<n; j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[]={45,32,76,45,98,76,33,65,19};
        System.out.println("Array before sorted "+ Arrays.toString(arr));
        selectionsort(arr, arr.length);
        System.out.println("Arrays after sorted "+ Arrays.toString(arr));
        
    }
}