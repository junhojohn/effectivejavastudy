package test.main;

import problems.javaBeansPattern.NutritionFacts01;
import problems.telescopingConstructorPattern.NutritionFacts02;
import solutions.builderPattern.NutritionFacts03;
import solutions.builderPattern.NutritionFacts03.Builder;

/**
 * 많은 필드를 갖는 클래스를 생성하는 방법들에 대한 테스트 어플리케이션.										<br>
 * 상황) 많은 필드를 갖는다는 것은, 생성자에 많은 매개변수가 들어간다는 의미.									<br>
 * 목적1) problems.javaBeansPattern 패키지와 problems.telescopingConstructorPattern으로	<br>
 * 생성한 방법을 실행하고 문제점을 인지해보려는 목적.													<br>
 * 목적2) 그리고 그 문제점을 해결한 빌더패턴의 자점을 인지해보려는 목적에서 작성되었다.								<br>
 * @author junhojohn
 */
public class TestMain {

	public static void main(String[] args) {
		/**
		 * 방법1) 자바빈즈패턴을 이용한 NutritionFacts 객체 생성 	<br>
		 * 문제점) setter메소드가 많이 호출된다.				<br>
		 * 문제점) setter메소드 중 하나라도 빼먹으면 일관성이 무너진다.	<br>
		 */
		NutritionFacts01 nutritionFacts01 = new NutritionFacts01();
		nutritionFacts01.setServingSize(100);
		nutritionFacts01.setServings(300);
		nutritionFacts01.setCarbonhydrate(50);
		nutritionFacts01.setCalories(0);
		nutritionFacts01.setSodium(30);
		nutritionFacts01.setFat(70);
		
		/**
		 * 방법2) 점층적생성자패턴을 이용한 NutritionFacts 객체 생성										<br>		
		 * 문제점) 클라이언트쪽에서 인자값 순서를 잘못 넣어서 그 결과 오류를 초래했다면, 디버깅이 힘들다.(컴파일에러가 아닌 런타임 에러이므로)<br>
		 * 문제점) NutritionFacts 객체에 필드가 추가가 되기라도 하면, 유지보수가 힘들어진다.							<br>
		 */
		NutritionFacts02 nutritionFacts02 = new NutritionFacts02(100, 300, 50, 0, 30, 70);
		
		/**
		 * 방법3) 빌더패턴을 이용한 NutritionFacts 객체 생성	<br>
		 * 클라이언트는 인자값 순서를 지키지 않아도 된다.<br>
		 * 클라이언트가 읽고 사용하기 쉽다.<br>
		 * 필드가 추가된다면, 메소드만 추가해주고 클라이언트에서 해당 메소드를 호출하도록 변경가능하다.(추가 시 컴파일 에러가 날 것임으로 변경지점 찾기도 쉽다.)<br>
		 */
		NutritionFacts03 nutritionFacts03 = 
				new Builder(100, 300).
						carbonhydrate(50).
						calories(0).
						sodium(30).
						fat(70).
						build();
	}
}
