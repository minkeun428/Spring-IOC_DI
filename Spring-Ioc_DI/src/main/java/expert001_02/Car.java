package expert001_02;


/**
 * 타이어에 대한 의존성을 Car 생성자의 인자 주입으로 해
 **/
public class Car {
	
	Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		
		return "장착된 타이어: " + tire.getBrand();
	}
	

}
