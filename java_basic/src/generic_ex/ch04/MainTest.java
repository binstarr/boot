package generic_ex.ch04;

public class MainTest {

	public static void main(String[] args) {
		double result = 5/3.0;
		System.out.println(result);
		
		double b = 100.0;
		Number a = (double)b;
		
		System.out.println("==================");
		MyPoint<Integer, Double> p1 = new MyPoint<Integer, Double>(10, 0.0); // <> 안에는 데이터 타입이 들어가야 해서 int, double 이 아니다. 
		MyPoint<Integer, Double> p2 = new MyPoint<Integer, Double>(20, 50.0);
		double result1 = makeRectangle(p1, p2);
		System.out.println(result1);

	}
	
	// 리턴타입을 <X, Y>
	public static <X, Y> double makeRectangle(MyPoint<X, Y> p1, MyPoint<X, Y> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}

}
