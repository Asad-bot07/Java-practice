import java.util.Scanner;
class ArrayEg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n=sc.nextInt();
        int arr[]=new int[n];int sum=0,pro=1;
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0){
                sum+=arr[i];
            }
            else{
                pro*=arr[i];
            }
        }
        System.out.println("The sum of even numbers in the array is : "+sum+"\nThe product of odd numbers in the array is "+pro);
        sc.close();
    }   
}
