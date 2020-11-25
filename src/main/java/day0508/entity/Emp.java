package day0508.entity;
import java.io.Serializable;
import java.util.HashMap;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = -6257005485934781371L;
		/**
		 * 
		 */
		private HashMap<String, String> map;
		

}
