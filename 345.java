class Solution {
    public String reverseVowels(String s) {
        
        int i = 0;
        int j = s.length() - 1;

        HashSet<Character> hs = new HashSet<>();
        hs.add('a');hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');

        char[] chars = s.toCharArray();

        while (i < j) {
            while (i < j && !hs.contains(chars[i])) {
                i++;
            }
            while (i < j && !hs.contains(chars[j])) {
                j--;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }

        return new String(chars);
    }
}
