class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] temp = new int[intStrs.length];
        int j = 0;
        for(int i = 0; i<intStrs.length; i++){
           if(Integer.parseInt(intStrs[i].substring(s, s+l))>k){
            temp[j++] =Integer.parseInt(intStrs[i].substring(s, s+l));
           }
        }
        int[] answer = new int[j];
        for(int i = 0; i<j; i++){
            answer[i] = temp[i];
        }
        return answer;
    }
}