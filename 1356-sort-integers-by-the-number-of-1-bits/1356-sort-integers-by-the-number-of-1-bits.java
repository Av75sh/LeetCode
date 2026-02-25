class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(a, (x, y) -> {
            int bx = Integer.bitCount(x);
            int by = Integer.bitCount(y);
            if (bx == by) return x - y;
            return bx - by;
        });
        return Arrays.stream(a).mapToInt(Integer::intValue).toArray();
    }
}
