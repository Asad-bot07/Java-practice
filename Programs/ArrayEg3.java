import java.util.Scanner;
class ArrayEg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the value of 'n' : ");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max element : "+max+"\nMin element : "+min);;
        sc.close();
    }
}
