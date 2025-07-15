import java.util.Scanner;
class ArrayEg5 {
    static boolean isPrime(int n){
        int c=0;
        if(n==1)
            return false;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                c++;
        }
        if(c==1)
        return  true;
        else
        return false;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Prime numbers are : ");
        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
