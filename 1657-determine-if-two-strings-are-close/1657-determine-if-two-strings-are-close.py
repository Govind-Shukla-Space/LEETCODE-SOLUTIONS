class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1)!=len(word2):
            return False
        d1={}
        for i in word1:
            if i in d1:
                d1[i]+=1
            else:
                d1[i]=1
        d2={}
        for i in word2:
            if i in d2:
                d2[i]+=1
            else:
                d2[i]=1
        l1=list(d1.keys())
        l2=list(d1.values())
        l3=list(d2.keys())
        l4=list(d2.values())
        l1.sort()
        l2.sort()
        l3.sort()
        l4.sort()
        if(l1==l3 and l2==l4):
            return True
        return False
            