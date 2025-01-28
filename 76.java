class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> hs = new HashMap<>();
        for (char c : t.toCharArray()) {
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        int match = 0;

        HashMap<Character, Integer> wc = new HashMap<>();

        while (end < s.length()) {
            char endChar = s.charAt(end);
            if (hs.containsKey(endChar)) {
                wc.put(endChar, wc.getOrDefault(endChar, 0) + 1);
                if (wc.get(endChar).equals(hs.get(endChar))) {
                    match++;
                }
            }

            while (match == hs.size()) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                if (hs.containsKey(startChar)) {
                    wc.put(startChar, wc.get(startChar) - 1);
                    if (wc.get(startChar) < hs.get(startChar)) {
                        match--;
                    }
                    
                }
                start++;
            }

            end++;
        }

       return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLen);
    }
}
