class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] strs = sentence.split(" ");
        for(int i = 0; i < strs.length - 1; i++){
            if(strs[i].charAt(strs[i].length() - 1) != strs[i + 1].charAt(0)){
                return(false);
            }
        }

        return(strs[0].charAt(0) == strs[strs.length - 1].charAt(strs[strs.length - 1].length() - 1));
    }
}
