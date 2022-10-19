package Lambda;

public class AddTest {

	public static void main(String[] args) {
		
		IAdd iAdd =  (int x, int y) -> {return x + y;};
		System.out.println(iAdd.add(3, 6));
		System.out.println(iAdd.add(100, 500));
		System.out.println(iAdd.add(2, 5));
	
		
		IAdd iAdd2  = new IAdd() {
			
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
	}

}

// 람다식 사용하기 위해서는 미리 정의 되어 있어야 한다. -> 인터페이스 !! (단 추상 메서드는 반드시 한개여야 한다.)

interface IAdd{
	public int add(int x, int y);
}