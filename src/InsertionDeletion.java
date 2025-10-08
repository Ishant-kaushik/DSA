import java.util.*;
public class InsertionDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Choose to Insert or Delete Element:");
        boolean in_del = sc.nextBoolean();

        if(in_del == true){
            System.out.println("Enter index to add element:");
            int idx = sc.nextInt();
            System.out.println("Enter element to add:");
            int ele = sc.nextInt();
            in(n,arr,idx,ele);
        }
        else{
            System.out.println("Enter index to delete element:");
            int idx = sc.nextInt();
            del(n,arr,idx);

        }
        sc.close();
    }

    public static void in(int n, int[] arr, int idx, int ele){
        int[] arr2 = new int[n+1];
        for(int i=0; i<idx; i++){
            arr2[i] = arr[i];
        }

        arr2[idx]= ele;

        for(int i=idx+1; i<n+1; i++){
            arr2[i] = arr[i-1];
        }

        //to print new array

        for(int i = 0; i< n+1; i++){
            System.out.println(arr2[i]);
        }
    }

    public static void del(int n, int[] arr, int idx){
        int[] arr3 = new int[n-1];
        for(int i =0; i<idx; i++){
            arr3[i]=arr[i];
        }

        for(int i= idx; i<n-1; i++){
            arr3[i]=arr[i+1];
        }

        //to print new array

        for(int i = 0; i<n-1; i++){
            System.out.println(arr3[i]);
        }
    }
}