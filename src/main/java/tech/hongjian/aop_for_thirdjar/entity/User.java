/**
 * 
 */
package tech.hongjian.aop_for_thirdjar.entity;

/**
 * 
 * @author xiahongjian
 * @time   2018:03:08 16:48:51
 */
public class User {
	private int id;
	private String name;
	
	public User() {}
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
