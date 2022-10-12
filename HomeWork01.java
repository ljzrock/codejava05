
public class HomeWork01 {

	public static void main(String[] args) {
		//有个升序数组 [10,12,45,90] 添加一个数23 使之依然为升序[10,12,23,45,90] 
		/*分析; 1 ,首先要对数组扩容，使数组长度加1 
		 *     2，将23添加到数组中去 
		 *     3，开始排序 通过对数组遍历 使得数组变成升序
		 *     4，通过临时变量temp两两比较 之后再交换数组元素位置
		 *     5：代码实现
		 * */
		int[] arr = {10,12,45,90};
		int temp = 0;
		int[] arrNew = new int[arr.length+1];
		for(int i = 0;i < arr.length;i++) {
	            arrNew[i] = arr[i];		
		}
		  arrNew[arrNew.length-1] = -1 ;
		  arr = arrNew ;
		
		  for(int i = 0;i < arr.length;i++) {
			  for(int j = 0;j < arr.length-1;j++) {
		       if(arr[j]>arr[j+1]) {
		    	   temp = arr[j];
		    	   arr[j] = arr[j+1];
		    	   arr[j+1] = temp;
		       }
	       } 
	  }
		  for(int i = 0;i < arr.length;i++ ) {
	       	   System.out.print(arr[i]+" ");
		       }
		  }
		 
  	}
	    


