import java.util.*;

import java.math.*;

public class Q {
		public static void main (String args[]){
//			StringBuffer sb= new StringBuffer("sd");

//			sb.append("2sd");

//			sb.insert(2, "qwe");

//			System.out.println(sb);

			Random ran=new Random();
			char []cha=new char[]{'0','1','2','3','4','5','6','7','8','9'};
			StringBuilder s= new StringBuilder();
			for(int a=0;a<4;a++){
				s.append(cha[ran.nextInt(cha.length)]);
			}
			System.out.println("您的验证码为"+s);
		}
}
