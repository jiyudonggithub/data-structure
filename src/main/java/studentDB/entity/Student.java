package studentDB.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	/**
	 * 
	 */
	private Integer id;
	private String name;
	private String password;
	private String tel;
	List<Integer> hobby;
}
