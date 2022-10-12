

public class HomeWork03 {

	public static void main(String[] args) {
		// 随机生成10个整数（1-100）保存再数组中去  倒序打印及求平均值 求最大数值和其下标 
		//并查找是否有8 
		int[] arr = new int[10];
		int temp = 0;
		int sum = 0;
		int ComNum = 8,index = -1;
		double avg = 0;
		for(int i = 0;i < arr.length;i++ ) {
			arr[i] = (int)(Math.random()*100)+1;	//数组赋值
		}
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = 0;j < arr.length-1-i;j++ ){
				if(arr[j]<arr[j+1]) {
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				}
			}
			
		}	
		for(int i =0 ;i < arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		
		}
		System.out.print("\n平均数是："+sum/arr.length);
		for(int i = 0;i < arr.length;i++) {
		if(ComNum == arr[i]) {
			index = i;
			}
		}
		if(index != -1) {
			System.out.println("\n找到了8！"+"下标是:"+index);
		}else {
			System.out.println("\n没有找到8！");
		}

		
		
		
	}

}
