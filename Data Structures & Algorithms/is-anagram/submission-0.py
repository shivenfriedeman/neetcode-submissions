class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        hm = dict()
        for i in range(len(s)):
            if s[i] not in hm:
                hm[s[i]] = 0
            hm[s[i]] += 1
        for i in range(len(t)):
            if t[i] not in hm:
                return False
            hm[t[i]] -= 1;
        return all(val == 0 for val in hm.values())