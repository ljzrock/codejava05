
public class HomeWork02 {

	public static void main(String[] args) {
		// 有个升序数组 [10,12,45,90] 添加一个数23 使之依然为升序[10,12,23,45,90] 
		/*第二种解法：
		 * 1，首先创建要添加的23的变量insertNum = 23;
		 * 2,再创建一个变量保存数组下标 index 
		 * 3，遍历数组 如果发现insertNum <= arr[i],index = i; 再用break跳出循环
		 * 4，创建新数组arrNew 其长度为（原数组+1）
		 * 5，再遍历新数组 定义两个索引 i 和 j 
		 * 如果发现下标i等于index 就执行arrNew[i] = insertNum    
		 *  如果发现下标不等于index就执行arrNew[i] = arr[j]
		 * 6,将新数组地址赋给原数组 arr = arrNew 
		 * 7，最后再进行数组输出
		 * 8，代码演示;
		 * */
		int[] arr = {10,12,45,90};
		int insertNum = 23;
		int index = -1;
		for(int i = 0;i < arr.length;i++ ) {
		        if(insertNum <= arr[i]) {
		        	index = i;
		        	break;	
		        }	
			}
		int[] arrNew = new int[arr.length+1];
		for(int i = 0,j = 0;i < arrNew.length;i++) {
			if(i != index) {
				arrNew[i] = arr[j];    //这个方法很好 利用索引来解决数组赋值问题 虽然代码复杂                    
				j++;                   //但是更加优化 无需进行比较交换数组元素位置
			}else {                    //节省系统资源  
				arrNew[i] = insertNum;
			}
		}
		arr = arrNew;
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+"\t");
			
		}
 
	}

}
