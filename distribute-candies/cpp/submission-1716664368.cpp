class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        unordered_map<int,int> diffCandyCount;
        for(int i: candyType){
            diffCandyCount[i]++;
        }

        int uniqueCandy = diffCandyCount.size();
        int maxCandy = candyType.size() / 2;
        return min(uniqueCandy, maxCandy);
    }
};