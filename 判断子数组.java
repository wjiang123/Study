public class Q {
	public static boolean f=true;
	public static int a,b;
	public static int c=0;
		public static void main (String args[]){
		int []A=new int[]{1,2,6,4,2,6,9};
		int []B=new int[]{2,6};
		sub(A,B);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		if (c==B.length){
			System.out.println(a);
		}else{
			System.out.println(-1);
		}
	}
	public static int sub(int []A,int []B){
			for( b=B.length-1;b>=0;b--){
				for(a=A.length-1;a>=b;a--){
					if(B[b]==A[a]){
						c++;
						break ;
					}
				}
			}
		return c;
	}
}
