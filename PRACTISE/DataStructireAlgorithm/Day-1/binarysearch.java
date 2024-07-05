import java.util.Scanner;

// public class binarysearch {

    
//     public static int binarysearch(int arr[], int key)
//     {
//         int left=0;
//         int right=arr.length-1;

//         while(left<=right)
//         {
//                                     // till the condition is true once the condition false it out of the loop
//         int mid=(left+right)/2;
//         if(arr[mid]==key)
//             return mid;
//         else if (arr[mid]<=key)
//             left=mid+1;
//         else if (arr[mid]>=key)
//             right=mid-1;
//         }
//         return -1;

//     }
//     public static void main(String[] args) {

//         // In Binary search the array should sorted 
//         int arr[]={10,20,30,40,50,60,70,80,90};
//         System.out.println("Enter the  Key");
//         Scanner sc= new Scanner(System.in);
//         int key=sc.nextInt();
//         int index=binarysearch(arr, key);
//         if(index!=-1)
//         {
//             System.out.println("The elemenet is found at this the index "+index);
//         }else 
//         {
//             System.out.println("The elemnet is not found at this index "+ index);
//         }
        
//     }
    
// }


public class binarysearch{

    public static int binarysearch(int arr[], int key)
    {
        int left=0; 
        int right=arr.length-1; 
        
        while(left<=right)
        {  
            // 1. find the middle element of the array
            int mid=(left+right)/2;
            // 2. compare middle element with key 
            // 3. if key is matching  then stop searching and return index of middle element 
            if(key==arr[mid])
                return mid;
            else if (key>=arr[mid])
                left=mid+1; 
            // if key is greater than middle element then search it into right partition 
            else if(key<=arr[mid])
                right=mid-1;
    
        }
        return -1;
    }

    public static int binarysearch(int arr[], int left, int right, int key)
    {
        if(left>right)
            return -1;
        // 1. find the middle element of the array
        int mid= (left+right)/2;
        // 2. compare the middle element with the key 
        // 3. if key is matching then stop searching and return the index 
        if(key==arr[mid])
            return mid;
            else if(key>arr[mid])
            return binarysearch(arr, mid+1, right, key);
        else if (key<arr[mid])
            return binarysearch(arr, left, mid-1, key);
        
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77,88,99};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the key to be searched : ");
        int key=sc.nextInt();
        //int index=binarysearch(arr,key);  // function calling binarysearch 
        int index= binarysearch(arr, 0, arr.length, key);
        if(index!=-1)
        {
            System.out.println("The element is found at this index "+ index);
        }else 
        {
            System.out.println("The element is not found at this index "+index);
        }
        
    }
}
