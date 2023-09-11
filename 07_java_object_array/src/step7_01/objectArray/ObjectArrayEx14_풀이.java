package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;

// MyArrayList 만들기
class MyArrayList {

	int[] arr;
	int elementCnt;

	void print() {
		System.out.println(Arrays.toString(arr));
	}

	
	void add(int value) {
		if (elementCnt == 0) {  // 배열 element 개수가 0일 때
			arr = new int[elementCnt + 1];  // 크기가 1인 배열 생성
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			for (int i = 0; i < temp.length; i++) {  // 배열의 요소 하나씩 복사해야 함에 주의
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[elementCnt] = value;
		elementCnt++;
	}

	
	void add(int index, int value) {
		// index가 elementCnt+1보다 작거나 같을 때
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			int j = 0;  // temp의 인덱스
			for (int i = 0; i < arr.length; i++) {  // i는 arr의 인덱스
				if (i != index) {  // i가 index가 아닐 때
					arr[i] = temp[j++];  // i가 index인 칸만 건너뛰고 temp를 저장하는 것임.
				}
			}
			temp = null;
		}
		arr[index] = value;
		elementCnt++;
		
		// 아래 부분을 else if문  안에 넣어야 하지 않나?
//		if (index <= elementCnt + 1) {
//			arr[index] = value;
//		}
		// index가 elementCnt+1보다 클 때
	}

	
	void remove(int index) {
		
		
	}

	
	int size() {
		return elementCnt;
	}

	
	int get(int index) {
		return arr[index];
	}

	
	void set(int index, int value) {
		arr[index] = value;
	}

	
	void clear() {

	}

}


public class ObjectArrayEx14_풀이 {

	public static void main(String[] args) {

		MyArrayList mylist = new MyArrayList();
		
		// [ ArrayList 사용 ] 

		// 추가하기
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(50);
		mylist.add(60);
		mylist.add(70);
		
		// 삽입하기
		mylist.add(3, 1000);
		mylist.add(3, 2000);
		mylist.add(9, 4000);
//		mylist.add(20, 5000);
		
		// 출력하기
		mylist.print();

		// (index로)삭제하기

		// 길이 구하기

		// (index로)값 꺼내오기

		// 특정 위치의 값 수정하기

		// 모든 데이터를 제거하기

		
		
		
		System.out.println("\n========================================\n");
		
		
		
		
		// [ 직접 구현한 ArrayList ] 

		// 추가하기

		// 삽입하기
		
		// 출력하기

		// (index로)삭제하기

		// 길이 구하기

		// (index로)값 꺼내오기

		// 특정 위치의 값 수정하기


		// 모든 데이터를 제거하기


	}

}
