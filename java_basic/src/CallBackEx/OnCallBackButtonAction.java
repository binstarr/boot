package CallBackEx;

import javax.swing.JButton;

// 콜백 메서드를 만드는 방법
// 1. 인터페이스를 선언한다 (약속)
// 2. 호출자와 응답자를 지정한다.
public interface OnCallBackButtonAction {
	// 1
	public void clickPlusButton();
	
	public void clickMinusButton();
}
