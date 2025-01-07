class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        n=len(words)
        str=[]
        for i in range(n):
            for j in range(n):
                if i!=j and (words[i] in words[j]):
                    str.append(words[i])
                    break
        return str