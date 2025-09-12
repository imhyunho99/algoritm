//acmicpc 1016
//제곱인 수로 나누어 떨어지지 않는 수의 개수 구하기

//min ~ max %2
//2로 나눠
//min~2까지의 소수를 구해서 각각 제곱한 리스트 만들어
//리스트 속으로 나누어지는 값이면 총 개수에서 -1


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int min= sc.nextInt();
        int max = sc.nextInt();
        int N = max/2;
        boolean prime[] = new boolean[N+1];

        prime[0] = prime[1] = true;
        for(int i=2;i<=N;i++) {
            if(prime[i]) {
                for(int j=i*i;j<N;j++) {
                    prime[j] = true;
                }
            }
        }

        for(int i=1;i<N;i++) {
            if(prime[i]) System.out.println(i); {}
        }







    }
}