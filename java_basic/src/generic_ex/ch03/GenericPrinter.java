package generic_ex.ch03;

public class GenericPrinter<T extends Material> {

	// T 라는 대체 문자를 사용, E - element, K - key, V - value (아무 문자나 사용 가능)
	// T의 상징적인 의미 : 자료형 매개변수 (type parameter)
	// 아무 문자나 사용 가능한 대체 문자이지만 대부분 T를 많이 쓴다

	private T material; // T 자료형으로 선언한 변수다.

	public T getMaterial() { // T 자료형으로 반환하는 제네릭 메서드
		return material;
	}

	// T(자료형 매개 변수가 사용되는 메서드를 제네릭 메서드라고 한다.)
	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "GenericPrinter [material=" + material + "]";
	}

}
