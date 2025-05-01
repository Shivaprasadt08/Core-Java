class Sample{
	public static void main(String[] args){
		int[] arr;
		arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 46;

		short[] arr1;
		arr1 = new short[3];
		arr1[0] = 1;
		arr1[1] = 2;	
		arr1[2] = 4;

		byte[] arr2;
		arr2 = new byte[3];
		arr2[0] = 2;
		arr2[1] = 3;	
		arr2[2] = 4;

		long[] arr3;
		arr3 = new long[3];
		arr3[0] = 100220;
		arr3[1] = 244545;	
		arr3[2] = 41444;

		float[] arr4;
		arr4 = new float[3];
		arr4[0] = 1002.20f;
		arr4[1] = 2445.45f;	
		arr4[2] = 414.44f;
		
		double[] arr5;
		arr5 = new double[3];
		arr5[0] = 1002.20;
		arr5[1] = 2445.45;	
		arr5[2] = 414.44;

		char[] arr6;
		arr6 = new char[3];
		arr6[0] = 'S';
		arr6[1] = 'K';	
		arr6[2] = 'T';
		
		boolean[] arr7;
		arr7 = new boolean[3];
		arr7[0] = true;
		arr7[1] = false;	
		arr7[2] = true;
		
		System.out.println("Integer datatype of data  given below\n");
		for(int i =0; i<arr.length; i++){
		System.out.println(arr[i]);
		}
		System.out.println("short datatype of data  given below\n");
		for(int i =0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("byte datatype of data  given below\n");
		for(int i =0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("long datatype of data  given below\n");
		for(int i =0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		System.out.println("float datatype of data  given below\n");
		for(int i =0;i<arr4.length;i++){
			System.out.println(arr4[i]);
		}
		System.out.println("double datatype of data  given below\n");
		for(int i =0;i<arr5.length;i++){
			System.out.println(arr5[i]);
		}
		System.out.println("char datatype of data  given below\n");
		for(int i =0;i<arr6.length;i++){
			System.out.println(arr6[i]);
		}
		System.out.println("boolean datatype of data  given below\n");
		for(int i =0;i<arr7.length;i++){
			System.out.println(arr7[i]);
		}
	}
}