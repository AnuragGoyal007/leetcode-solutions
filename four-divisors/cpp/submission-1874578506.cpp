class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
       int totalSum = 0;

       for(int x: nums){
        int cnt = 0;
        int sum = 0;

        for(int d=1; d*d<=x; d++){
            if(x%d==0){
                int other = x/d;

                cnt++;
                sum += d;

                if(other!=d){
                    cnt++;
                    sum += other;
                }

                if(cnt>4) break;
            }
        }

        if(cnt==4){
            totalSum += sum;
        }
       } 
    return totalSum;
    }
};