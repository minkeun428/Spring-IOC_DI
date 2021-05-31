package expert002;


public class Car {
	Tire tire;
	
	
	//타이어 교체를 위한 메서드 생성
	public Tire getTire() {
		return tire;
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
	//브랜드 타이어 생산
	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}
	
}
