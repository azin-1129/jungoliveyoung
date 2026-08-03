import java.io.*;
import java.util.*;

class JO_1071{
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int[] nums=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(st.nextToken());
        }

        int m=Integer.parseInt(br.readLine());

        // 약수의 합 구하기
        int res1=0;
        for(int i=0;i<n;i++){
            if(m%nums[i]==0){
                res1+=nums[i];
            }
        }

        // 배수
        int res2=0;
        for(int i=0;i<n;i++){
            if(nums[i]%m==0){
                res2+=nums[i];
            }
        }

        System.out.println(res1);
        System.out.println(res2);

        br.close();
    }
}