package AOP_Sample_HC;

public class SwitchOn implements Switch{

	@Override
	public boolean power(){
		System.out.println("[켜짐]");
		return true;
	}

}
