public class BinarySearch {
	/**
	 *  startSearch()
	 *  Takes an array, key (or result in this case), min length and max length
	 *  of the data set.
	 * 
	 * @return int
	 */
	public int startSearch(
	int[] sortedArray, int key, int min, int max) {
		int index = Integer.MAX_VALUE;

		while (min <= max) {
			// Finds the middle index
			int mid = min + ((max - min) / 2);
			if (sortedArray[mid] < key) {
				// Overrides min if the mid is less than key
				min = mid + 1;
			} else if (sortedArray[mid] > key) {
				// Overrides max is the mid is greater than key
				max = mid - 1;
			} else if (sortedArray[mid] == key) {
				// Mid is equal to key
				index = mid;
				break;
			}
		}
		return index;
	}
}