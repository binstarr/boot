package test.ex10;

/**
 * 
 * @author bin
 * default를 사용하면 interface도 몸체가 있는 메서드를 만들 수 있다.
 * 어댑터 패턴 대용으로 사용하기도 한다.
 *
 */
public interface Moveable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
	// 인터페이스 (추상 메서드, 상수 - abstract)
	// default를 추가하고 abstract를 빼면 재정의 해야 하는 추상 메서드를 일반 메서드로 바꿀 수 있다.
	default public void down() {};
}
