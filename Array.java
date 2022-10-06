
public class Array {

	public void callArray(int arrayNumber, int standardNumber) {
		//3. int 배열을 1~100 사이의 임의의 값으로 설정하기
        int ar = arrayNumber;
        int[] array = new int[ar];
        for(int i=0;i<array.length;i++) {
        	array[i] = (int)(Math.random()*100+1);
        }
        
        
      	//4. 사용자에게 받은 정렬 기준에 따라서 배열 버블 소트 수행하기
        //오름차순
        if(standardNumber == 1) {
        	System.out.println("\n오름차순 버블소트를 수행합니다.");
        	
        	//배열의 크기만큼 반복
        	for(int x=0;x<array.length;x++) {
        		int j=1;
        		for(int i = 0; i<array.length-1; i++) {
        			
        			//배열 현재 위치와 다음 위치와 비교
        			if(array[i]>array[j]) {
        				//array[i]와 array[j] 교체
        				int a = array[i];
        				array[i] = array[j];
        				array[j] = a;
        				
        			}
        			j++;
        		}
        	}
        	for(int i=0;i<array.length;i++) {
        		System.out.print(array[i]+" ");
        	}
        }
        //내림차순
        else if(standardNumber == 2) {
        	System.out.println("\n내림차순 버블소트를 수행합니다.");
        	
        	//배열의 크기만큼 반복
        	for(int x=0;x<array.length;x++) {
        		int j=1;
        		for(int i = 0; i<array.length-1; i++) {
        			
        			//배열 현재 위치와 다음 위치와 비교
        			if(array[i]<array[j]) {
        				//array[i]와 array[j] 교체
        				int a = array[i];
        				array[i] = array[j];
        				array[j] = a;
        				
        			}
        			j++;
        		}
        	}
        	for(int i=0;i<array.length;i++) {
        		System.out.print(array[i]+" ");
        	}
        }
        else {
        	System.out.println("\n잘못된 값을 입력하셨습니다.");
        }
	}

}
