class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(); // order preserve karega
        for (int num : nums) {
            set.add(num);
        }

        int i = 0;
        for (int val : set) {
            nums[i++] = val;
        }

        return set.size();
    }
}