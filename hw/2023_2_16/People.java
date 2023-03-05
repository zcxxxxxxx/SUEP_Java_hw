public class People{
	int height;
	void speak(){
		System.out.printf("我身高是:%d",height);
	}
}
class A{
	public static void main(String args[]){
		People zhubajie;
		zhubajie=new People();
		zhubajie.height=170;
		System.out.printf("我身高是:%d\n",zhubajie.height);
		System.out.printf("主类不一定是public类\n");
		zhubajie.speak();
	}
}