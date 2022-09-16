package assignment2;

public class MainTest2 {

	public static void main(String[] args) {
		
		Computer computer1 = new DeskTop();
//		Computer computer2 = new NoteBook();
		Computer computer3 = new MyNoteBook();
		
		computer1.display();
		computer1.typing();
		
		computer3.display();

	}

}
