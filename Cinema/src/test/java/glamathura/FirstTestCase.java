package glamathura;
import  org.junit.jupiter.api.*;
import  org.junit.jupiter.api.Test;
public class FirstTestCase {
@Test
public  void test()
{
	Seat  s1=new Seat(false, 10);
	Theatre  t1=new Theatre(1,"multiplex");
	Show  s2=new Show("morning","20-mar-2020",t1);
	Assertions.assertEquals(s1.getSeatNumber(),10);
	Assertions.assertTrue(s1.getReservationStatus());
	s2.loadSeats();
	Assertions.assertEquals(1, s2.getFreeSeatsCount());
}
}
