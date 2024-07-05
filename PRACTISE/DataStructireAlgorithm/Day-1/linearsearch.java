import java.util.Scanner;

/**
 * linearsearch
 */
// public class linearsearch {

// public static int linearsearch(int arr[],int key)
// {
//     for(int i=0; i<arr.length; i++)
//     {
//         if(arr[i]==key)
//             return i;
//     }
//     return -1;
// }


// public static void main(String[] args) 
// {
//     int arr[]={88,33,66,99,11,77,22,55,14};
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter the Number : ");
//     int key= sc.nextInt();
//     int index=linearsearch(arr, key);
//     if(index!=-1)
//     {
//         System.out.println("The element is at this index "+ index);
//     }else
//     {
//         System.out.println("The element is not found "+ index);
//     }    
// }    
// }
public class linearsearch{


    public static int linearsearch(int arr[], int key)  // key ==98
    {
        for(int i=0; i<arr.length; i++)   // i=0 to i<10 
        {
            if(arr[i]==key)  // if(arr[i]== key) i=0: 90==98 ? no i++
                return i;

        }
        return -1;

    }
    public static void main(String[] args) { 

 
        int arr[]={90,43,54,32,87,23,87,53,76,98}; // 10

        System.out.println("Enter the Key : ");
        Scanner sc= new Scanner(System.in);
        int key=sc.nextInt();  // 98
        int index =linearsearch(arr,key);
        if(index!=-1)
        {
            System.out.println("The key is found at this index "+ index);
        }else 
        {
            System.out.println("The key is not found at this index"+ index);
        }
    }
}
