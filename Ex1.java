package database1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 a=new Ex1();
		a.rec();
	}

	private void rec() {
		// TODO Auto-generated method stub
		int y=10;
		System.out.println("yamini ratnam");
		for(int i=0;i<y;i++){
			if(i<=2){
				continue;
			}
			else{
				rec();
			}
		}
	}

}
