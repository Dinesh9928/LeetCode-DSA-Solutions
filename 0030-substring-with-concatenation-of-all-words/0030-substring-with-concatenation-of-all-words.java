class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) {
            return result;
        }

        int n = s.length();
        int m = words.length;
        int len = words[0].length();

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < n - m * len + 1; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            for (; j < m; j++) {
                int k = i + j * len;
                String sub = s.substring(k, k + len);
                if (!map.containsKey(sub)) {
                    break;
                }
                seen.put(sub, seen.getOrDefault(sub, 0) + 1);
                if (seen.get(sub) > map.get(sub)) {
                    break;
                }
            }
            if (j == m) {
                result.add(i);
            }
        }
        return result;
    }
}