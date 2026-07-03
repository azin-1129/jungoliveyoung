import java.util.*;
import java.io.*;

class JO_1341 {
    public static void main(String[] args) throws Exception {
        String filepath = System.getProperty("user.dir") + "\\Input\\";
        int joNum = 1341;
        BufferedReader br = new BufferedReader(new FileReader(filepath + "input_" + joNum + ".txt"));
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        StringBuilder sb=new StringBuilder();

        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());

        if(A<B){
            for(int x=A;x<=B;x++){
                for(int y=1;y<=3;y++){
                    for(int z=(3*(y-1))+1;z<=(3*y);z++){
                        sb.append(x+" * "+z+" ="+String.format("% 3d", (x*z))+"   ");
                    }
                    sb.append("\n");
                }
                sb.append("\n");
            }
        }else{
            for(int x=A;x>=B;x--){
                for(int y=1;y<=3;y++){
                    for(int z=(3*(y-1))+1;z<=(3*y);z++){
                        sb.append(x+" * "+z+" ="+String.format("% 3d", (x*z))+"   ");
                    }
                    sb.append("\n");
                }
                sb.append("\n");
            }
        }

        sb.delete(sb.length()-2, sb.length());
        System.out.println(sb);
        br.close();
    }
}