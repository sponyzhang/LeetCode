class Solution {
    private class TrieTreeNode {
        int count = 0;
        TrieTreeNode[] node = new TrieTreeNode[26];
    }
    
    private String res;
    
    private void dfs(TrieTreeNode node, String str, int target) {
        if (node.count < target) {
            return;
        } else if (str.length() > res.length()) {
            res = str;
        }
        for (int i = 0; i < 26; i++) {
            if (node.node[i] != null) {
                dfs(node.node[i], str + (char) (i + 'a'), target);
            }
        }
    }
    
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        TrieTreeNode root = new TrieTreeNode();
        res = "";
        for (int i = 0; i < strs.length; i++) {
            root.count++;
            TrieTreeNode tmp = root;
            String s = strs[i];
            for (int j = 0; j < s.length(); j++) {
                if (tmp.node[s.charAt(j) - 'a'] == null) {
                    tmp.node[s.charAt(j) - 'a'] = new TrieTreeNode();
                }
                tmp = tmp.node[s.charAt(j) - 'a'];
                tmp.count++;
            }
        }
        
        dfs(root, res, strs.length);
        
        return res;
    }
}
