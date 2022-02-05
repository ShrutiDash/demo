public class ArrayDemo {

	public static void main(String[] args) {
		int [] [] arr ={ {1,2,5} ,
				{4,5,9,3,2},
				{8,9,6,5,4,9,6} } ;
		for (int i=0;i<arr.length;i++,System.out.println()){
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
		}
		//System.out.println();
		}
	}

}
