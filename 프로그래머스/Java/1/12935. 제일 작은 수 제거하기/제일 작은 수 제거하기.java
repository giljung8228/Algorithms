// 제일 작은 수를 제거하고, 하나만 남으면 -1 반환
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int[] answer = new int[arr.length - 1];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[idx] = arr[i];
                idx++;
            }
        }

        return answer;
    }
}