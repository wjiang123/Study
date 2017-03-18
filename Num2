public class Q {
	public static boolean f=true;
	public static int c;
		public static void main (String args[]){
		int []A=new int[]{1,2,6,4,2,6,9};
		int []B=new int[]{3,6};
		sub(A,B);
		System.out.println(c);	
	}
	public static int sub(int []A,int []B){
		StringBuffer s1=new StringBuffer("");//将数组A转换为字符串
		for(int n=0;n<A.length;n++){
			s1.append(A[n]);
		}
		String sA=s1.toString();
		StringBuffer s2=new StringBuffer("");//同理数组B
		for(int n=0;n<B.length;n++){
			s2.append(B[n]);
		}
		String sB=s2.toString();
//		System.out.println("数组A的String形式:"+sA);
//		System.out.println("数组B的String形式:"+sB);
		f=sA.contains(sB);//调用包含方法
		if(f==false){
			c=-1;
		}
		else{
			c=sA.lastIndexOf(sB);//调用IndexOf索引方法
		}
		return c;
	}
}
