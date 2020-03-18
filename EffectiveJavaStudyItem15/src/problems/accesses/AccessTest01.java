package problems.accesses;

public class AccessTest01 {

	public static void main(String[] args) {
		Test01.sampleArr[0] = "World";
		
		for(int i = 0 ; i < Test01.sampleArr.length ; i ++){
			System.out.println(Test01.sampleArr[i]);
		}
	}

}
