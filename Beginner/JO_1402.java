import java.util.*;
import java.io.*;

class JO_1402 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        // N의 약수들 중 K번째로 작은 수
        List<Integer> factors=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(N);i++){
            if(Math.pow(i, 2)==N){
                continue;
            }

            if(N%i==0){
                factors.add(i);
                factors.add(N/i);
            }
        }

        if(factors.size()<K){
            System.out.println(0);
        }else{
            Collections.sort(factors);
            System.out.println(factors.get(K-1));
        }

        br.close();
    }
}