class Solution:
    def reverseWords(self, s: str) -> str:
       sl=s.split() 
       result=" ".join([word[::-1] for word in sl])
       return result
       