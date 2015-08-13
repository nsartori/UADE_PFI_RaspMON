package hibernate.bean;

import javax.persistence.*;

@Entity
@Table(name="testJavaHBT")
public class Test {
	@Id
	@Column(name="Identificador	")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setid");
		this.id = id;
	}

	public void escribeBEAN()
		{
			Test testeo = new Test();
			testeo.setId(1);
			
		}
	
	
	
	

}
