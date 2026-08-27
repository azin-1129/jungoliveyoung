import java.util.*;
import java.io.*;

class JO_2809 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        List<Integer> divisors=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){
                if((i*i)==N){
                    divisors.add(i);
                }else{
                    divisors.add(i);
                    divisors.add(N/i);
                }
            }
        }
        Collections.sort(divisors);
        System.out.println(divisors.toString().replaceAll("[\\[\\],]", ""));

        br.close();
    }
}