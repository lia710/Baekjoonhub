class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int cycle = 1;
        int[] y = {0, 1, 0, -1};
        int[] x = {1, 0, -1, 0};
        int a = 0;
        int b = -1;

        while(cycle<=n*n){
            for (int i = 0; i < 4; i++) {

                while((a+y[i]>=0)&&(b+x[i]>=0)&&(a+y[i]<n)&&(b+x[i]<n)&&(arr[a+y[i]][b+x[i]]==0)) {
                        arr[a+y[i]][b+x[i]] = cycle;
                        a += y[i];
                        b += x[i];
                        cycle++;
                }
            }
        }

        return arr;
    }
}