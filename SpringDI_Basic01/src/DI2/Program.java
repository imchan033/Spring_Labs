package DI2;

public class Program {

	public static void main(String[] args) {
		//NewRecordView view = new NewRecordView(100,70,80);
		
		NewRecordView view = new NewRecordView();
		
		//필요하다면
		NewRecord record = new NewRecord(100,60,80);
		
		view.setRecord(record);
		view.print();
	}

}
