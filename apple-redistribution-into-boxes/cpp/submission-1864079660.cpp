class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        int totalApples = 0;
        for(int i: apple){
            totalApples += i;
        }

        sort(capacity.begin(), capacity.end(), greater<int>());

        int boxesUsed = 0;
        int currentCap = 0;

        for(int cap: capacity){
            currentCap += cap;
            boxesUsed++;

            if(currentCap >= totalApples){
               return boxesUsed;
            }
        }

        return boxesUsed;
    }
};