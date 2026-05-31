class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long ma = mass;
        for(int aster : asteroids){
            if(ma<aster){
                return false;
            }
            ma+=aster;
        }
        return true;
    }
}