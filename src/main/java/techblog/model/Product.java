package techblog.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int id;
	private String Blog;

	@Override
	public String toString() {
		return "Product [id=" + id + ", Blog=" + Blog + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlog() {
		return Blog;
	}

	public void setBlog(String blog) {
		Blog = blog;
	}

	public Product(int id, String blog) {
		super();
		this.id = id;
		Blog = blog;
	}

	public Product() {
		super();

	}

}
