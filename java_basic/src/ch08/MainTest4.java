package ch08;

public class MainTest4 {

	public static void main(String[] args) {
		
		Wizard wizard1 = new Wizard("흑마법사");
		Wizard wizard2 = new Wizard("백마법사");
		
		wizard1.showInfo();
		
		wizard1.iceSkill();
		wizard1.fireSkill();
		wizard1.showInfo();
		
		wizard1.attacked(100);
		wizard1.showInfo();

	}

}
