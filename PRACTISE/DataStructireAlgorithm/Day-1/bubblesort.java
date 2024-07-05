// not optimal approach

// public class bubblesort {

//     public static void bubblesort(int arr[], int n)
//     {
//         int passes=0, comparision=0;
//         for(int i=1; i<arr.length; i++)
//         {
//             passes++;
//             for(int j=0; j<arr.length-1; j++)
//             {
//                 comparision++;
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println("Number of passes are "+ passes);
//         System.out.println("Number of comparisions are "+ comparision);

//     }

//     public static void main(String[] args) {
//         int arr[]={33,22,66,55,44,11};
//         System.out.println("Array Before sorted "+Arrays.toString(arr));
//         bubblesort(arr,arr.length);
//         System.out.println("Arrays After sorted"+Arrays.toString(arr));
        
//     }
    
// }


// optimal approach

// public class bubblesort{
//     public static void bubblesort(int arr[], int n)
//     {
//         int passes=0;
//         int comparision=0;
//         for(int i=1; i<n; i++)
//         {
//             passes++;
//             for(int j=0; j<n-i; j++)
//             {
//                 comparision++;
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println("Number of passes are "+ passes);
//         System.out.println("Number of comparisions are "+ comparision);

//     }

//     public static void main(String[] args) {

//         int arr[]={33,22,66,55,44,11};
//         System.out.println("Arrays Before Sorted "+Arrays.toString(arr));
//         bubblesort(arr,arr.length);
//         System.out.println("Arrays After sorted "+Arrays.toString(arr));

//     }
// }

//improved bubble sort 

// import java.util.Arrays;

// public class bubblesort{
//     public static void bubblesort(int arr[], int n)
//     {
//         int passes=0;
//         int comparision=0;
//         int flag;
//         for(int i=1; i<n; i++)
//         {
//             passes++;
//             flag=0;
    
//             for(int j=0; j<n-i; j++)
//             {
//                 comparision++;
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     flag=1;
//                 }
//             }
//             if(flag==0)
//             {
//                 break;
//             }
    
//         }
//         System.out.println("Number of Passes are "+ passes);
//         System.out.println("Number of comparisions are "+ comparision);

//     }
//     public static void main(String[] args) {
//         int arr[]={11,22,33,44,55,66};
//         System.out.println("Array Before sort "+Arrays.toString(arr));
//         bubblesort(arr,arr.length);
//         System.out.println("Array After sort "+Arrays.toString(arr));


        
//     }
// }

import java.util.Arrays;

public class bubblesort{

    public static void bubblesort(int arr[], int n)
    {
        int passes=0;
        int comparision=0;
        int flag;
        for(int i=1; i<n; i++)
        {
            passes++;
            flag=0;
            for(int j=0; j<n-i; j++)
            {
                comparision++;
                if(arr[j]>arr[j+1])
                {
                    flag=0;
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j]=temp;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        System.out.println("Number of passes are "+ passes);
        System.out.println("Number of comparisions are "+ comparision);

    }
    public static void main(String[] args) {
        int arr[]= {11,22,33,44,55,66,87,45,88,99};
        System.err.println("Array Before sorted "+ Arrays.toString(arr));
        bubblesort(arr, arr.length);
        System.err.println("Array Before sort"+ Arrays.toString(arr));

        
    }
}