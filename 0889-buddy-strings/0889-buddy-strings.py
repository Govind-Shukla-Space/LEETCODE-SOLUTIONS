class Solution:
    def buddyStrings(self, s: str, goal: str) -> bool:
        if len(s)!=len(goal):
            return False
        c=0
        l=[]
        for i in range(len(s)):
            if s[i]!=goal[i]:
                c+=1
                l.append((s[i],goal[i]))
            if c>2:
                return False
        if c==1:
            return False
        if c==2:
            if l[0][0]==l[1][1] and l[1][0]==l[0][1]:
                return True
            else:
                return False
        d={}
        for i in s:
            if i in d:
                return True
            else:
                d[i]=1
        return False