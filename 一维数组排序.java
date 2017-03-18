import java.util.*;

public class Q {
	public static boolean f=true;
	public static int a,b;
	public static int c=0;
	public static int sum=0;
		public static void main (String args[]){
			Scanner read= new Scanner(System.in);
			System.out.println("请您输入数组长度：");
			int longer=read.nextInt();
			int [] Arr=new int [longer];
//			System.out.println("请您输入数组：");
			for(int i=0;i<longer;i++){
					Arr[i]=read.nextInt();
			}
			sum(Arr);
			for(int a=0;a<Arr.length;a++){
			System.out.println("第"+(a+1)+"个元素的值为"+Arr[a]);
			}
		}
		public static  void sum (int [] Arr){
			for(a=0;a<Arr.length-1;a++){
				for(b=0;b<Arr.length-1;b++){
					if(Arr[b]>Arr[b+1]){
						int tem=Arr[b];
						Arr[b]=Arr[b+1];
						Arr[b+1]=tem;
					}
				}
			}
		}
}
