public class Solution {
    static int count = 0;

	public static int[] countBits(int num) {

		int[] result = new int[num + 1];

		for (int i = 0; i < num + 1; i++) {
			countOne(i);
			result[i] = count;
			count = 0;
		}
		
		return result;
	}

	public static void countOne(int num) {

		if (num == 0) {
			return;
		} else {
			countOne(num/2);
			if(num%2 == 1){
				count++;
			}
		}
	}
}