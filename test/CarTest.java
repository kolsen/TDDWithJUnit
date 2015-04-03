import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CarTest {

	@Test 
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}
	
	@Test 
	public void canAccelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}
	
	@Test
	public void cannotAccelerateBeyondMaxSpeed(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}
	
	@Test 
	public void canDoToString(){
		Car car1 = new Car("Red", 100);
		assertThat(car1.toString(), is("Color: Red, Speed: 0"));
	}

	@Test
	public void canDeccelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		car1.deccelerate(5);
		assertThat(car1.getSpeed(), is(5));
	}
	
	@Test
	public void cannotDecceleratePastZero(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		car1.deccelerate(15);
		assertThat(car1.getSpeed(), is(0));
	}
	

	
}
