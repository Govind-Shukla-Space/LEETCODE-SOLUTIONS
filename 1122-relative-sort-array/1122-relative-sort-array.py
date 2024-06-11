class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        d={}
        l1=[]
        l2=[]
        s=set(arr2)
        for i in arr1:
            if i not in s:
                l2.append(i)
            else:
                if i in d:
                    d[i]+=1
                else:
                    d[i]=1
        for i in range(len(arr2)):
            for j in range(d[arr2[i]]):
                l1.append(arr2[i])
        l2.sort()
        return l1+l2