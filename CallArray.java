import java.util.Scanner;

public class CallArray {

	public static void main(String[] args) {
		//1. 사용자에게 숫자 입력받기
		Scanner inputReader = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요: ");
        int arrayNumber = inputReader.nextInt();
		
        //2. 사용자에게 정렬 기준 입력받기
        System.out.print("오름차순이면 1, 내림차순이면 2를 입력하세요: ");
        int standardNumber = inputReader.nextInt();
        
        //함수 호출하기
        Array call = new Array();
        call.callArray(arrayNumber,standardNumber);
      	
	}

}
