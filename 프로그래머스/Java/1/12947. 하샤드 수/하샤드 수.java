class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num = x;
        
        int len = String.valueOf(x).length();
        int arr[] = new int[len];


        for (int i = len-1; i >= 0; i--) {
            arr[i] = x % 10;
            x = x / 10;
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }

        if (num % sum == 0){
            answer = true;
        }

        return answer;
    }
}