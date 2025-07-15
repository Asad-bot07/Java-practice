import java.util.Scanner;
class ArrayEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter 10 numbers :");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<10;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the array is : "+sum);
        sc.close();
    }
}
