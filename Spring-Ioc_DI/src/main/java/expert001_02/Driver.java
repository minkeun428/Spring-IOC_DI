package expert001_02;


/**
 * 타이어를 생산하는 부분이 expert001_01과 다르게 Car.java -> Driver.java로 이동함.
 * KoreaTire를 생산할지, AmericaTire를 생산할지 결정하는건
 * 운전자(사람)이 해야 유연성이 높아짐
 * 어떤 타이어를 장착할지는 차가 아닌 운전자가 고민하는게 맞음
 * */

public class Driver {
	public static void main(String[] args) {
		
		Tire tire = new KoreaTire();  //전략을 생성(코리아 타이어 or 미국 타이어 - ex.무기 종류 선택)
	  //Tire tire = new AmericaTire();
		
		Car car = new Car(tire);      //컨텍스트에 주입(ex.군인에게 무기 쥐어줌)
		
		System.out.println(car.getTireBrand());   //클라이언트가 실행 시킴(명령 하달)
	}

}
