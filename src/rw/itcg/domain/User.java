package rw.itcg.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 8:33:43 PM
 */
@Entity
public class User extends GenericDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	@Column(unique = true)
	private String username;
	@Column(unique = true)
	private String phone;
	private String password;

	@OneToMany(mappedBy = "user")
	private List<Sales> employeeSales;

	public List<Sales> getEmployeeSales() {
		return employeeSales;
	}

	public void setEmployeeSales(List<Sales> employeeSales) {
		this.employeeSales = employeeSales;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
