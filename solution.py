class Solution:
    def isCircularSentence(self, sentence):
        strs = sentence.split()
        for i in range(len(strs) - 1):
            if strs[i][len(strs[i]) - 1] != strs[i + 1][0]:
                return False
        
        return strs[0][0] == strs[len(strs) - 1][len(strs[len(strs) - 1]) - 1]
