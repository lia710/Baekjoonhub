class Solution {
    public String solution(String my_string, int s, int e) {
        
        char[] original = my_string.toCharArray();
        char[] reverse = my_string.substring(s, e+1).toCharArray();
        
        for (int i = s, j = reverse.length-1; j>=0; i++, j--) {
            original[i] = reverse[j];
        }
        
        String answer = new String(original);
        return answer;
    }
}