class MergeSort{
	/*merge the left subarry and the right subarray*/
	/*left subarray is from index left to index middle*/
	/*right subarray is from index middle + 1 to index right*/
	void merge(int arr[], int left, int middle, int right){
		/*l_length = length of left array*/
		int l_length = middle - left + 1;

		/*r_length = length of right array*/
		int r_length = right - middle;

		/*initialize the left and right arrays*/
		int[] leftArr = int[l_length];
		int[] rightArr = int [r_length];

		/*store the data into the left and right arrays*/
		for(int i = left; i < m + 1; i++){
			leftArr[i] = arr[i];
		}
		for(int i = m + 1; i < right; i++){
			rightArr[i] = arr[i];
		}

		/*iterate through the left array*/
		int i = 0;
		/*iterate through the right array*/
		int j = 0;
		/*iterate through the original array starting from the left most index*/
		int k = left;

		/*sorting*/
		while( i < l_length && j < r_length){
			if(leftArr[i] <= rightArr[j]){
				arr[k] = leftArr[i];
				i++;
				k++;
			}
			else{
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}

		while(i < l_length){
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < r_length){
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}
	/*main function to sort the array using the merge function*/
	void sort(int arr[], int left, int right){
		if(left < right){
			/*find the middle indx*/
			int middle = (right + left)/2;

			/*sort the left*/
			sort(arr, left, middle);

			/*sort the right*/
			sort(arr, middle + 1; right);

			/*merge the left and the right together*/
			merge(arr, left, middle, right);

		}
	}
}