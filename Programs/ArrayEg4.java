import java.util.Scanner;
class ArrayEg4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int search = sc.nextInt();
        int flag=0,pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                flag++;
                pos=i+1;
                break;
            }
        }
        if(flag>0){
            System.out.println("Element found at position "+pos);
        }
        else{
            System.out.println("Element not found!!");
        }
        sc.close();
    }
}
