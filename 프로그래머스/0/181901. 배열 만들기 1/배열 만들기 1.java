class Solution {
    public int[] solution(int n, int k) {
        int[] arr = new int[n];
        int check = 0;
        for(int i = 1; i<=n; i++){
            if(i%k==0){
                arr[check++] = i;
            }
        }
        
        int[] answer = new int[check];
        for(int i = 0; i<check; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}