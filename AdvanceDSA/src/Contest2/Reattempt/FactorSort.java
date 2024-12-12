package Contest2.Reattempt;

import java.util.Arrays;
import java.util.Comparator;

public class FactorSort {
    public static void main(String[] args) {
        int[] A1 = {6, 8, 9};
        int[] sortedA1 = sortByFactors(A1);
        System.out.println(Arrays.toString(sortedA1)); // Output: [9, 6, 8]

        int[] A2 = {2, 4, 7};
        int[] sortedA2 = sortByFactors(A2);
        System.out.println(Arrays.toString(sortedA2));
    }
    private static int[] sortByFactors(int[] A) {
        Integer[] arr = Arrays.stream(A)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(arr, new Comparator<Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {
                int factorCount1 = countFactors(num1);
                int factorCount2 = countFactors(num2);

                if (factorCount1 != factorCount2) {
                    return Integer.compare(factorCount1, factorCount2);
                } else {
                    return Integer.compare(num1, num2);
                }
            }
        });

        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
    private static int countFactors(int x) {
        int count = 0;
        for (int i = 1 ; i <= Math.sqrt(x) ; i++) {
            if (x % i == 0) {
                count++;
                if (x % i != i) {
                    count++;
                }
            }
        }
        return count;
    }
}
/*
### Problem Description

You are given an array `A` consisting of `N` positive integers.
Your task is to sort this array based on the number of distinct factors each element has.
The sorting should be done in increasing order of the number of factors.
If two elements have the same number of factors, then the element with the smaller value
should come first.

### Input

- An array `A` of `N` positive integers where `1 ≤ N ≤ 10^5` and `1 ≤ A[i] ≤ 10^9`.

### Output

- The sorted array based on the criteria described.

### Example

#### Example 1

- **Input**: `A = [6, 8, 9]`
- **Output**: `[9, 6, 8]`

**Explanation**:
  - Number of factors for `6`: 4 (1, 2, 3, 6)
  - Number of factors for `8`: 4 (1, 2, 4, 8)
  - Number of factors for `9`: 3 (1, 3, 9)
  - `9` has the fewest factors, so it comes first. `6` and `8` both have 4 factors, but `6` is smaller than `8`, so `6` comes before `8`.

#### Example 2

- **Input**: `A = [2, 4, 7]`
- **Output**: `[2, 7, 4]`

**Explanation**:
  - Number of factors for `2`: 2 (1, 2)
  - Number of factors for `4`: 3 (1, 2, 4)
  - Number of factors for `7`: 2 (1, 7)
  - `2` and `7` both have 2 factors. Since `2` is smaller than `7`, `2` comes before `7`. `4` has 3 factors and comes last.

### Constraints

- The size of the array `N` can be as large as `100,000`.
- The elements in the array can be as large as `1,000,000,000`.

### Approach

1. **Calculate the Number of Factors**:
   - For each element in the array, determine the number of distinct factors.

2. **Sort the Array**:
   - Use a custom comparator to sort the array first by the number of factors and then by the value of the elements if the number of factors is the same.

3. **Return the Sorted Array**:
   - Output the array sorted according to the criteria specified.

By following this approach, you ensure that the array is sorted efficiently while handling large inputs effectively.
 */