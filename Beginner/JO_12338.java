package Beginner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class JO_12338 {
    public static void main(String[] args) throws Exception{
        String filepath = System.getProperty("user.dir") + "\\Input\\";
        int joNum = 12338;
        BufferedReader br = new BufferedReader(new FileReader(filepath + "input_" + joNum + ".txt"));
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        
        StringBuilder sb=new StringBuilder();

        // A to B까지 *9단 출력
        if(A<B){
            for(int x=A;x<=B;x++){
                for(int y=1;y<=9;y++){
                    sb.append(x+" * "+y+" = "+(x*y)+"\n");
                }
                sb.append("\n");
            }
        }else{
            for(int x=A;x>=B;x--){
                for(int y=1;y<=9;y++){
                    sb.append(x+" * "+y+" = "+(x*y)+"\n");
                }
                sb.append("\n");
            }
        }

        sb.delete(sb.length()-2, sb.length());
        System.out.println(sb);
        br.close();
    }
}
