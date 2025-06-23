/*
 * You are given q queries in the form of a, b, and n. For each query, 
 * print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
 * The series is in the form:
 * (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), (a + 2^0 * b + 2^1 * b + 2^2 * b), ..., up to n terms.
 * 
 * Input Format:
 * The first line contains an integer q, denoting the number of queries.
 * Each of the next q lines contains three space-separated integers: a, b, and n.
 * Constraints:
 * 0 ≤ q ≤ 500
 * 0 ≤ a, b ≤ 50
 * 1 ≤ n ≤ 15
 * Output Format:
 * For each query, print the corresponding series on a new line.
 * Each line must contain n space-separated integers in order.
 * Sample Input:
 * 2
 * 0 2 10
 * 5 3 5
 * Sample Output:
 * 2 6 14 30 62 126 254 510 1022 2046
 *  8 14 26 50 98
 * This is a HackerRank easy practice question for java
 */
import java.util.*;

class Solution{
    static int sum;
    static int series(int b,int n)
    {
        sum+=(((int)Math.pow(2,n))*b);
        return sum;
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum=a;
            for(int j=0;j<n;j++)
            {
                System.out.print(series(b, j)+" ");
            }
            System.out.print("\n");
            sum=0;
        }
        in.close();
    }
}
