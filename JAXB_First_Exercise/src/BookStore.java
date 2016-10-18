package ramana.jaxb.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "ramana.jaxb.model")
public class BookStore {

	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "bookList")
	// XmlElement sets the name of the entities
	@XmlElement(name = "book")
	private ArrayList<Book> bookList;
	private String storeName;
	private String location;

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public ArrayList<Book> getBooksList() {
		return bookList;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String name) {
		this.storeName = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}