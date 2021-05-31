package expert001_01;


/**
 * 타이어를 생산하고 사용할 Car 클래스
 * 타이어에 대한 의존성을 Car에서 직접 해결
 **/
public class Car {
	
	Tire tire;
	
	public Car() {
		//의존 관계가 일어나고 있는 부분 - 타이어 생산
		tire = new KoreaTire();   // or tire = new AmericaTire();
	
	}
	
	public String getTireBrand() {
		
		return "장착된 타이어: " + tire.getBrand();
	}
	

}
