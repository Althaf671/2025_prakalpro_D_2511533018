package shared;

public class MyLogger {

	public void log(Object msg) {
		System.out.println(msg);
	}
	
	public void defaultLog(Object msg) {
		System.out.print(msg);
	}

	public void Text_IO_Put_Line(String msg) {
		System.out.println(msg);
	}
	
	public void Text_IO_Put(Object msg) {
		System.out.print(msg);
	}
}
