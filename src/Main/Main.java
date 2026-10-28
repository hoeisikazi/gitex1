package Main;

import java.security.SecureRandom;
import java.util.Random;
import java.util.SplittableRandom;

public class Main {
    static public void main(String[] arg){
         int i = RandomMode("SecureRandom");
         System.out.println(i);
         int j = RandomMode("SplittableRandom");
         System.out.println(j);
    }
    
    public static int RandomMode(String type) throws NullPointerException {
        // switch式の中から、直接「生成された乱数（int）」を返す
        int num = switch (type) {
            case "SecureRandom" -> new SecureRandom().nextInt(500);
            case "SplittableRandom" -> new SplittableRandom().nextInt(500); // 末尾のスペースを削除
            default -> new Random().nextInt(500);
        };
        
        return num;
    }
}