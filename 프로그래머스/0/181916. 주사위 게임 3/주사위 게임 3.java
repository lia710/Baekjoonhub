class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = new int[]{a, b, c ,d};
        int check = 1;
        while(check>0){
            check = 0;
            for(int i = 0; i<3; i++){
                if(arr[i]>arr[i+1]){
                    check++;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        
        if(arr[0]==arr[3]){answer = arr[0]*1111;}
        
        else if(arr[1]==arr[2]){
            if(arr[0]==arr[1]){
                answer = (10*arr[0]+arr[3])*(10*arr[0]+arr[3]);}
            else if(arr[2]==arr[3]){
                answer = (10*arr[3]+arr[0])*(10*arr[3]+arr[0]);}
            else {
            answer = arr[0]*arr[3];
        }
            }
        
        else if(arr[0]==arr[1]&&arr[2]==arr[3]){
            answer = (arr[0]+arr[2])*(arr[2]-arr[0]);
        }
        
        else if(arr[0]==arr[1]){
            answer = arr[2] * arr[3];
        }
        else if(arr[2]==arr[3]){
            answer = arr[0]*arr[1];
        }
        
        else{answer = arr[0];}
        return answer;
    }
}