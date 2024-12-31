class Solution:
    def isValid(self, s: str) -> bool:
        i=len(s)
        while i!=0:
            if("()"in s):
                s=s.replace("()","")
            elif("[]"in s):
                s=s.replace("[]","")
            elif("{}"in s):
                s=s.replace("{}","")
            elif s=="":
                return not s
            i-=1
            # arr1=[]
        # arr2=[]
        # for i in range(len(s)):
        #     if s[i]=='(' or s[i]=='{' or s[i]=='[':
        #         arr1.append(s[i])
        #     elif s[i]==')' or s[i]=='}' or s[i]==']':
        #         arr2.append(s[i])
        # if len(arr1)!=len(arr2):
        #      return False
        # c=0
        # for i in range(len(arr1)):
        #     if(arr1[0]==arr2[0]):
        #         if arr1[i]=='(' and arr2[i]==')' or arr1[i]=='[' and arr2[i]==']'or arr1[i]=='{' and arr2[i]=='}':
        #             c=1
        #     elif (arr1[0]!=arr2[0]):
        #         arr2[::-1]
        #         if arr1[i]=='(' and arr2[i]==')' or arr1[i]=='[' and arr2[i]==']'or arr1[i]=='{' and arr2[i]=='}':
        #             c=1
        # if c==1:
        #     return True
        # else:
        #     return False