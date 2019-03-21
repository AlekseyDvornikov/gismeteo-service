package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.x5.utils.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Place {
	
	private int id;
	
	private String name;
	
	private String url;
	
	private Utils.PLACE_TYPES placeTypes;
	
	@JsonIgnore
	private boolean isFounded;
}
