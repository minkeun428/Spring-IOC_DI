package expert004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	//스프링 설정 파일을 보고,
	//자동으로 속성의 설정자 메서드에 해당하는 역할을 해줌
	@Autowired
	Tire tire;
	
//  Tire tire;
//  타이어 교체를 위한 메서드 생성
//	public Tire getTire() {
//		return tire;
//	}
//	
//	public void setTire(Tire tire) {
//		this.tire = tire;
//	}
//	
	
	//브랜드 타이어 생산
	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}
	
}
