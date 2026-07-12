class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int p = j + 1;
                int q = n - 1;

                while (p < q) {

                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

                    if (target < sum) {
                        q--;
                    } else if (target > sum) {
                        p++;
                    } else {
                        // target equals sum
                        list.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));

                        p++;
                        q--;

                        while (p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }

                        while (p < q && nums[q] == nums[q + 1]) {
                            q--;
                        }
                    }
                }
            }
        }

        return list;
    }
}