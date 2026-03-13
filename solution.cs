public class Solution {
    public bool IsCircularSentence(string sentence) {
        string[] strs = sentence.Split(" ");
        for(int i = 0; i < strs.Length - 1; i++){
            if(strs[i][strs[i].Length - 1] != strs[i + 1][0]){
                return(false);
            }
        }

        return(strs[0][0] == strs[strs.Length - 1][strs[strs.Length - 1].Length - 1]);
    }
}
