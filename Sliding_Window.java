//O(n^2) complexity

class Sliding_Window {
	static int MaxSum(int arr[], int n, int k) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < k-n+1; i++) {
			int curr_sum = 0;
			for(int j = 0; j< k; j++) {
				curr_sum += arr[i + j];
			 max = Math.max(curr_sum,  max);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = new int[]{1, 4, 2, 10, 2, 3, 1, 0, 20} ;
		int k = 4;
		in n = arr.length;
		System.out.print(MaxSum(arr,n,k));
	}
}