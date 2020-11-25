package day0513.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Integer id;
	private String name;
	private String password;
	private Double salary;
	private Integer gender;
	private Integer age;
	

}
