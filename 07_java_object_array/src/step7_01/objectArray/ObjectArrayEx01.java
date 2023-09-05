package step7_01.objectArray;

class Product {
	
	String name;
	int price;
	
}

public class ObjectArrayEx01 {

	public static void main(String[] args) {

		// 객채 배열 생성 방법
		// 클래스명[] 변수명 = new 클래스명[3];
		Product[] productList = new Product[3];  // int[] arr = new int[3]; 과 유사함
		
		productList[0] = new Product();
		productList[1] = new Product();
		
		Product temp = new Product();
		productList[2] = temp;
		
		productList[0].name = "기계식 키보드";
		productList[0].price = 45000;

	}

}
