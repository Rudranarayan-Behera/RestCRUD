package tech.csm.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5741114126180487754L;
	private Integer bookId;
	private String name;
	private Double price;
	private Double rating;
	

}
