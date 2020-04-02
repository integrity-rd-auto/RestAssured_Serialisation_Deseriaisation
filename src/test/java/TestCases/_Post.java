package TestCases;

public class _Post {

	private String id;
	private String title;
	private String author;
	private _Info[] info;
	
	public _Post()
    {
     super();
    }

	public _Post(String id, String title, String author, _Info[] info) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.info = info;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public _Info[] getInfo() {
		return info;
	}

	public void setInfo(_Info[] info) {
		this.info = info;
	}
}
