package AOP_Sample_HC;

public class SwitchOff implements Switch{

	@Override
	public boolean power() {
		System.out.println("[꺼짐]");
		return false;
	}

}
