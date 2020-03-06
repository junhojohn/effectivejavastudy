package problems.telescopingConstructorPattern;

/**
 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 점층적 생성자 패턴의 예										<br>
 * 클래스의 필드값이 많아지면, 생성자를 아래와 같이 인자값을 다르게 하여 점층적으로 받아 세팅.									<br>
 * 단점) 생성자 매개변수가 많아지게 되면 관리가 힘들어진다.														<br>
 * 단점) 생성자 클라이언트쪽에서는 원치 않는 매개변수를 강제로 넣어야 하는 경우가 생긴다.										<br>
 * 단점) 생성자 클라이언트쪽에서 생성자 API를 보며 매개변수 순서를 지켜서 넣어줘야 하고, 잘못넣으면 컴파일러는 잡지 못하므로 디버깅이 힘들어진다.	<br>
 * @author junhojohn
 */
public class NutritionFacts02 {

	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbonhydrate;
	
	/**
	 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 점층적 생성자 패턴의 예										<br>
	 * 클래스의 필드값이 많아지면, 생성자를 아래와 같이 인자값을 다르게 하여 점층적으로 받아 세팅.									<br>
	 * 단점) 생성자 매개변수가 많아지게 되면 관리가 힘들어진다.														<br>
	 * 단점) 생성자 클라이언트쪽에서는 원치 않는 매개변수를 강제로 넣어야 하는 경우가 생긴다.										<br>
	 * 단점) 생성자 클라이언트쪽에서 생성자 API를 보며 매개변수 순서를 지켜서 넣어줘야 하고, 잘못넣으면 컴파일러는 잡지 못하므로 디버깅이 힘들어진다.	<br>
	 * @param servingSize
	 * @param servings
	 */
	public NutritionFacts02(int servingSize, int servings) {
		this.servingSize = servingSize;
		this.servings = servings;
	}
	
	/**
	 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 점층적 생성자 패턴의 예										<br>
	 * 클래스의 필드값이 많아지면, 생성자를 아래와 같이 인자값을 다르게 하여 점층적으로 받아 세팅.									<br>
	 * 단점) 생성자 매개변수가 많아지게 되면 관리가 힘들어진다.														<br>
	 * 단점) 생성자 클라이언트쪽에서는 원치 않는 매개변수를 강제로 넣어야 하는 경우가 생긴다.										<br>
	 * 단점) 생성자 클라이언트쪽에서 생성자 API를 보며 매개변수 순서를 지켜서 넣어줘야 하고, 잘못넣으면 컴파일러는 잡지 못하므로 디버깅이 힘들어진다.	<br>
	 * @param servingSize
	 * @param servings
	 * @param calories
	 */
	public NutritionFacts02(int servingSize, int servings, int calories) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
	}
	
	/**
	 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 점층적 생성자 패턴의 예										<br>
	 * 클래스의 필드값이 많아지면, 생성자를 아래와 같이 인자값을 다르게 하여 점층적으로 받아 세팅.									<br>
	 * 단점) 생성자 매개변수가 많아지게 되면 관리가 힘들어진다.														<br>
	 * 단점) 생성자 클라이언트쪽에서는 원치 않는 매개변수를 강제로 넣어야 하는 경우가 생긴다.										<br>
	 * 단점) 생성자 클라이언트쪽에서 생성자 API를 보며 매개변수 순서를 지켜서 넣어줘야 하고, 잘못넣으면 컴파일러는 잡지 못하므로 디버깅이 힘들어진다.	<br>
	 * @param servingSize
	 * @param servings
	 * @param calories
	 * @param sodium
	 */
	public NutritionFacts02(int servingSize, int servings, int calories, int fat) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
	}
	
	/**
	 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 점층적 생성자 패턴의 예										<br>
	 * 클래스의 필드값이 많아지면, 생성자를 아래와 같이 인자값을 다르게 하여 점층적으로 받아 세팅.									<br>
	 * 단점) 생성자 매개변수가 많아지게 되면 관리가 힘들어진다.														<br>
	 * 단점) 생성자 클라이언트쪽에서는 원치 않는 매개변수를 강제로 넣어야 하는 경우가 생긴다.										<br>
	 * 단점) 생성자 클라이언트쪽에서 생성자 API를 보며 매개변수 순서를 지켜서 넣어줘야 하고, 잘못넣으면 컴파일러는 잡지 못하므로 디버깅이 힘들어진다.	<br>
	 * @param servingSize
	 * @param servings
	 * @param calories
	 * @param sodium
	 */
	public NutritionFacts02(int servingSize, int servings, int calories, int fat, int sodium) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
	}
	
	/**
	 * Effective Java 아이템2) 매개변수가 많은 생성자일 때 점층적 생성자 패턴의 예										<br>
	 * 클래스의 필드값이 많아지면, 생성자를 아래와 같이 인자값을 다르게 하여 점층적으로 받아 세팅.									<br>
	 * 단점) 생성자 매개변수가 많아지게 되면 관리가 힘들어진다.														<br>
	 * 단점) 생성자 클라이언트쪽에서는 원치 않는 매개변수를 강제로 넣어야 하는 경우가 생긴다.										<br>
	 * 단점) 생성자 클라이언트쪽에서 생성자 API를 보며 매개변수 순서를 지켜서 넣어줘야 하고, 잘못넣으면 컴파일러는 잡지 못하므로 디버깅이 힘들어진다.	<br>
	 * @param servingSize
	 * @param servings
	 * @param calories
	 * @param fat
	 * @param sodium
	 * @param carbohydrate
	 */
	public NutritionFacts02(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbonhydrate = carbohydrate;
	}
}
