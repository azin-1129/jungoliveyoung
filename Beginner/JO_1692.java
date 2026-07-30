import java.util.*;
import java.io.*;

class JO_1692{
    public static void main(String[] args) throws Exception {
        String filepath = System.getProperty("user.dir") + "\\Input\\";
        int joNum = 1692;
        BufferedReader br = new BufferedReader(new FileReader(filepath + "input_" + joNum + ".txt"));

        int x=Integer.parseInt(br.readLine());
        String y=br.readLine();

        int result=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<y.length();i++){
            int z=Character.getNumericValue(y.charAt(y.length()-(i+1)));
            // Math.pow(10, (y.length()-(i+1))) 만큼 ㄱㄱ
            int temp=x*z;
            sb.append(temp+"\n");
            // System.out.println(Math.pow(10, i));
            result+=(x*z*Math.pow(10, i));
        }

        sb.append(result+"\n");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        br.close();
    }

}