package day0508.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	//{name:lucy address:合肥 tel:13001079072   gender:male}
	private String name;
	private String address;
	private String tel;
	private String gender;

}
