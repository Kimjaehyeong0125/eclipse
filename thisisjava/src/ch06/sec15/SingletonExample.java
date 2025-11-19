package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton obj1 = Singleton.getinstance();
		Singleton obj2 = Singleton.getinstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			Sysyem.out.println("다른 Singleton 객체입니다.");
		}

	}

}
