package problems.javaBeansPattern;

/**
 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 자바빈즈패턴의 예				<br>
 * 클래스의 필드값이 많아지면, setter 메소드를 이용해 각 필드를 세팅.					<br>
 * 단점) setter메소드를 여러번 호출해야한다.									<br>
 * 단점) 어느 하나의 필드라도 set이 되지 않으면 NutritionFacts 객체의 일관성이 무너진다.	<br>
 * @author junhojohn
 */
public class NutritionFacts01 {
	
	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbonhydrate;
	
	public NutritionFacts01() {
		// TODO Auto-generated constructor stub
	}

	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getCarbonhydrate() {
		return carbonhydrate;
	}

	public void setCarbonhydrate(int carbonhydrate) {
		this.carbonhydrate = carbonhydrate;
	}
	
}
