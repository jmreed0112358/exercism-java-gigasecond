package gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;

import exceptions.NotImplementedException;

public class Gigasecond
{
	private LocalDateTime startDateTime;
	
	public Gigasecond( LocalDate startDate ) {
		if ( startDate == null ) {
			throw new NullPointerException();
		}
		
		this.startDateTime = LocalDateTime.of( startDate.getYear( ), startDate.getMonth( ), startDate.getDayOfMonth( ), 0, 0, 0 );
	}

	public Gigasecond( LocalDateTime startDateTime ) {
		if ( startDateTime == null ) {
			throw new NullPointerException();
		}
		
		this.startDateTime = startDateTime;
	}
	
	public LocalDateTime getDate() {
		return this.startDateTime.plusSeconds( 1000000000L );
	}
}
