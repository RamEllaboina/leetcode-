class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        while(!map.isEmpty()) {

            List<Integer> row = new ArrayList<>();
            List<Integer> remove = new ArrayList<>();

            for(int key : map.keySet()) {

                row.add(key);

                map.put(key, map.get(key) - 1);

                if(map.get(key) == 0) {
                    remove.add(key);
                }
            }
            for(int key : remove) {
                map.remove(key);
            }

            result.add(row);
        }

        return result;
    }
}