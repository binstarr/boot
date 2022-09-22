package generic_ex.ch02;

public class GenericPrinter<T> {

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
		return "GenericsPrinter [material=" + material + "]";
	}

}
