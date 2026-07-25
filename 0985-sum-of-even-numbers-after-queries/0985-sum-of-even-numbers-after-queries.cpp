class Solution {
public:
    vector<int> sumEvenAfterQueries(vector<int>& nums, vector<vector<int>>& queries) {
        vector<int> result;
        int evenSum = 0;
        for (int x : nums) {
            if (x % 2 == 0) evenSum += x;
        }
        for (auto &q : queries) {
            int val = q[0];
            int idx = q[1];
            if (nums[idx] % 2 == 0) {
                evenSum -= nums[idx];
            }
            nums[idx] += val;

            if (nums[idx] % 2 == 0) {
                evenSum += nums[idx];
            }
            result.push_back(evenSum);
        }
        return result;
    }
};