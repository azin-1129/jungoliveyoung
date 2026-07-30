import java.util.*;
import java.io.*;

class JO_1430 {
    public static void main(String[] args) throws Exception {
        String filepath = System.getProperty("user.dir") + "\\Input\\";
        int joNum = 1430;
        BufferedReader br = new BufferedReader(new FileReader(filepath + "input_" + joNum + ".txt"));

        int[] count=new int[10]; // 0~9 카운트
        long A=Long.parseLong(br.readLine());
        long B=Long.parseLong(br.readLine());
        long C=Long.parseLong(br.readLine());
        String result=String.valueOf(A*B*C);

        for(int i=0;i<result.length();i++){
            int idx=Character.getNumericValue(result.charAt(i));
            // System.out.println(idx);
            count[idx]++;
        }

        for(int cnt : count){
            System.out.println(cnt);
        }

        br.close();
    }
}