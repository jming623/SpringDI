package ex03;

public class DatabaseDev {
	
	private String url;
	private String uid;
	private String upw;
	
	
	//getter,setter
	//setter메서드는 xml파일에서 property로 넣을때 필요하고
	//getter메서드는 MainClass에서 getBean으로 가지고나온 DatabaseDev에 값을 확인할 때 필요하다.
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
	
}
