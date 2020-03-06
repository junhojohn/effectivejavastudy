package solutions.builderPattern;

/**
 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 빌더패턴을 이용한 예			<br>
 * 자바빈즈패턴에 빌더 패턴을 이용함으로써 점층적생성자패턴과 자바빈즈패턴의 문제를 해결			<br>
 * @author junhojohn
 */
public class NutritionFacts03 {
	
	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbonhydrate;
	
	public NutritionFacts03(Builder builder) {
		this.servingSize 	= builder.servingSize;
		this.servings 		= builder.servings;
		this.calories 		= builder.calories;
		this.fat 			= builder.fat;
		this.sodium 		= builder.sodium;
		this.carbonhydrate 	= builder.carbonhydrate;
	}
	
	public static class Builder{

		private static int servingSize;
		private static int servings;
		private static int calories;
		private static int fat;
		private static int sodium;
		private static int carbonhydrate;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val){
			this.calories = val;
			return this;
		}
		
		public Builder fat(int val){
			this.fat = val;
			return this;
		}
		
		public Builder sodium(int val){
			this.sodium = val;
			return this;
		}
		
		public Builder carbonhydrate(int val){
			this.carbonhydrate = val;
			return this;
		}
		
		public NutritionFacts03 build(){
			return new NutritionFacts03(this);
		}
	}
}
