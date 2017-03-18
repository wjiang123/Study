class F{
	int x=2;
	F(){
		System.out.println("father without va");
	}
	F( int y){
		System.out.println("father with va");
	}
	void Speak(){
		System.out.println("the mothed speak");
	}
}
class S extends F{
	static int y=1;
	S(){
		System.out.println(y);
	}
	S(int y){
		super(y);
		this.y=y+super.x;
		System.out.println("son with va"+y);
	}
	S( double y){
		super.Speak();
		System.out.println("y="+y+y);
	}
}
public class Q{
	public static void main(String args[]){
	S son= new S(8.8);	
	System.out.println(son.y);
	}
}
