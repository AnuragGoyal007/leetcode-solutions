class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int currMass = mass;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>currMass) return false;
            currMass += asteroids[i];
        }
        return true;
    }
}