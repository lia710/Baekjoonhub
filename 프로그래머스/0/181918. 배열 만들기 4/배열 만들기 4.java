class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
    while (i<arr.length) {
        if (stk.length == 0) {
            stk = new int[]{arr[i]};
            i++;
        }
        else if (stk[stk.length-1]<arr[i]){
            int[] temp = new int[stk.length+1];
            for (int j = 0; j < stk.length; j++) {
                temp[j] = stk[j];
            }
            temp[stk.length] = arr[i];
            stk = temp;
            i++;
        }
        else if (stk[stk.length-1]>=arr[i]){
            int[] temp = new int[stk.length-1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = stk[j];
            }
            stk = temp;
        }
    }
        return stk;
    }
}