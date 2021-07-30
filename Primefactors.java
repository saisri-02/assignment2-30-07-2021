import java.util.*;
class Main
{
    static int N=100005;
    public static int prime[]=new int[N];
    public static void sieve()
    {
        for(int i=0;i<N;i++)
        {
            prime[i]=i;
        }
        prime[0]=1;
        prime[1]=1;
        for(int x=2;x*x<N;x++)
        {
            if(prime[x]==x)
            {
                for(int i=x*x;i<N;i+=x)
                {
                    prime[i]=x;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int p;
        int arr[]=new int[n];
        int count=0;
        sieve();
        while(n!=1)
        {
            p=prime[n];
            arr[k]=p;        
            k++;
            n=n/prime[n];
            count++;
        }
         System.out.println(count);
    }
}

output1:
225
4

output2:
6
2

output3:
15
2
