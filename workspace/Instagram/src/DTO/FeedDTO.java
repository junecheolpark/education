package DTO;

public class FeedDTO {
	private String seq;
	private String title;
	private String content;
	private String nickname;
	
	public FeedDTO() {}
	public FeedDTO(String seq, String title, String content, String nickname) {
		super();
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.nickname = nickname;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
