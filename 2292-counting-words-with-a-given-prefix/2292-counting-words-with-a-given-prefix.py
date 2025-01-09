class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        n=len(words)
        count=0
        for st in words:
            if st.startswith(pref):
                count+=1
        return count