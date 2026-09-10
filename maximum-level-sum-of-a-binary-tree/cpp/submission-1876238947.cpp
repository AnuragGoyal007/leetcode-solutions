/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxLevelSum(TreeNode* root) {
        if(root==NULL) return 0;
        queue<TreeNode*> q;
        q.push(root);

        int level = 1;
        int maxSum = INT_MIN;
        int ansLevel = 1;

        while(!q.empty()){
            int size = q.size();
            int currLevelSum = 0;

            for(int i=0;i<size;i++){
                TreeNode* node = q.front();
                q.pop();

                currLevelSum += node->val;

                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
            }
            if(currLevelSum > maxSum){
                maxSum = currLevelSum;
                ansLevel = level;
            }
            level++;
        }
        return ansLevel;
    }
};