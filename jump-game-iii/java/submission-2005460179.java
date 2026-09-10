import java.util.Queue;
import java .util.LinkedList;

class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start] == 0){
            return true;
        }

        int n = arr.length;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        boolean[] visited = new boolean[n];
        visited[start] = true;

        while(!queue.isEmpty()){
            int currentIndex = queue.poll();

            if(arr[currentIndex] == 0){
                return true;
            }

            int forwardJump = currentIndex + arr[currentIndex];
            if (forwardJump >= 0 && forwardJump < n && !visited[forwardJump]) {
                visited[forwardJump] = true;
                queue.offer(forwardJump);
            }

            int backwardJump = currentIndex - arr[currentIndex];
            if (backwardJump >= 0 && backwardJump < n && !visited[backwardJump]) {
                visited[backwardJump] = true;
                queue.offer(backwardJump);
            }
        }

        return false;
    }
}