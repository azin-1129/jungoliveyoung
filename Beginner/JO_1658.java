import java.util.*;
import java.io.*;

class JO_1658 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int maxDiv=-1;

        // A의 약수
        List<Integer> divisorsA=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(A);i++){
            if(A%i==0){
                if(i*i==A){
                    divisorsA.add(i);
                }else{
                    divisorsA.add(i);
                    divisorsA.add(A/i);
                }
            }
        }

        // B의 약수 구하면서 있는지 찾고 맥스값 갱신하는 게 더 나을듯?
        for(int i=1;i<=Math.sqrt(B);i++){
            if(B%i==0){
                if(i*i==B){
                    if(divisorsA.contains(i)){
                        maxDiv=Math.max(i, maxDiv);
                    }
                }else{
                    if(divisorsA.contains(i)){
                        maxDiv=Math.max(i, maxDiv);
                    }
                    if(divisorsA.contains(B/i)){
                        maxDiv=Math.max(B/i, maxDiv);
                    }
                }
            }
        }

        System.out.println(maxDiv);
        // 최소공배수= 최대공약수 * a/최대공약수 + b/최대공약수
        System.out.println(maxDiv*(A/maxDiv)*(B/maxDiv));
        br.close();
    }
}