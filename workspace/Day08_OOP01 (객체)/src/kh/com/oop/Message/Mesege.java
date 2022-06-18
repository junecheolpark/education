package kh.com.oop.Message;

public class Mesege {
	private String writer = null;
	private String message = null;
	private String written_date = null;

	public Mesege() {}

	public Mesege(String writer, String message, String written_date) {
		this.writer = writer;
		this.message = message;
		this.written_date = written_date;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}//
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}//
	public String getWritten_date() {
		return written_date;
	}
	public void setWritten_date(String written_date) {
		this.written_date = written_date;
	}//
	
	public void PrintAll(String writer, String message, String written_date) {
		System.out.println("작성자는 " + getWriter() + ", 메세지는 " + getMessage() + ", 작성일은 " + getWritten_date());
	}
	
	
}
