import java.util.*;
import java.io.*;

class JO_문제번호 {
    public static void main(String[] args) throws Exception {
        String filepath = System.getProperty("user.dir") + "\\Input\\";
        int joNum = 12422;
        BufferedReader br = new BufferedReader(new FileReader(filepath + "input_" + joNum + ".txt"));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        
        while(br.ready()){
            st=new StringTokenizer(br.readLine(), " ");

            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());

            if(A<2 || A>9){
                sb.append("INPUT ERROR!\n");
                continue;
            }
            if(B<2 || B>9){
                sb.append("INPUT ERROR!\n");
                continue;
            }

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
        }

        sb.delete(sb.length()-2, sb.length());
        System.out.println(sb);
        br.close();
    }
}