class Solution {
    public String solution(String my_string, int[][] queries) {
         String answer = my_string;
        for(int i = 0; i<queries.length; i++){
            String temp = answer.substring(queries[i][0], queries[i][1]+1);
            temp = new StringBuilder(temp).reverse().toString();
            answer = new StringBuilder(answer).replace(queries[i][0], queries[i][1]+1,temp).toString();
        }
        return answer;
    }
}