import java.util.*;
import java.io.*;

public class JO_1291 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 질문자님의 구조 유지
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if (s < 2 || s > 9) {
                System.out.println("INPUT ERROR!");
                continue;
            }

            if (e < 2 || e > 9) {
                System.out.println("INPUT ERROR!");
                continue;
            }

            // 증가
            if (s < e) {
                for (int y = 1; y <= 9; y++) {
                    for (int x = s; x <= e; x++) {
                        int res = x * y;
                        // String.format을 안 쓰고 문자열을 직접 쪼개어 append (객체 생성 0개)
                        sb.append(x).append(" * ").append(y).append(" = ");
                        if (res < 10) sb.append(" "); // %2d 수동 구현
                        sb.append(res);

                        if (x != e) {
                            sb.append("   ");
                        }
                    }
                    sb.append('\n');
                }
            } else {
                // 감소
                for (int y = 1; y <= 9; y++) {
                    for (int x = s; x >= e; x--) {
                        int res = x * y;
                        sb.append(x).append(" * ").append(y).append(" = ");
                        if (res < 10) sb.append(" "); // %2d 수동 구현
                        sb.append(res);

                        if (x != e) {
                            sb.append("   ");
                        }
                    }
                    sb.append('\n');
                }
            }
            
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            System.out.println(sb);
            break; // 올바른 데이터 처리 후 컷
        }
    }
}
