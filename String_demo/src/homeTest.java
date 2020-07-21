import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.rmi.RMISecurityManager;
import java.util.Scanner;

public class homeTest {

    public static void main(String[] args) {

//       练习：计算字符串中大写字母、小写字母、数字的个数
       /* String str = "adjs1433jdSFHGgy88dfu,.fh5jigr";
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i<str.length();i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                a++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                b++;
            } else if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                c++;
            } else {
                continue;
            }

        }
        System.out.println("大写字母有"+b +"个；"+"小写字母有"+a +"个；"+"数字有"+c +"个。");

    }*/

//    将输入的字符串中首字符改为大写，其余都是小写
        Scanner sc = new Scanner(System.in);
        while(true) {

            String st = sc.nextLine();
            if (st == null || st.isEmpty())
                System.out.println("输入不合法,请重新输入");
            else if(st.equals("exit"))
                break;
            else if (st.length() == 1)
                System.out.println(st.toUpperCase());
            else {
                String startst = st.substring(0, 1);
                String restst = st.substring(1);
                String endst = startst.toUpperCase() + restst.toLowerCase();
                System.out.println(endst);
            }
        }
        System.out.println("程序结束！");

    }

}