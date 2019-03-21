package entity;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Weather {

	private Date time;
	
	private Double airTemperature;
	
	private Double airComphort;
	
	private String airDescription;

}
