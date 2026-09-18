"""




Given an input string, containing upper-case and lower-case letters, digits, and spaces( ' ' ). A word is defined as a sequence of non-space characters. The words in s are separated by at least one space.



Return a string with the words in reverse order, concatenated by a single space.



"""



class Solution:
    def reverseWords(self, s: str) -> str:
        x=s.split()
        y=len(x)
        l=""
        for i in range(y):
            l=l+ " " +x[y-i-1]
        return l.strip()



""" 

So the thing is .... in this we used the concept of splitting the string based on the whitespace and then moving it to a list using the split function
once that is done i am printing it in reverse order ..... its like STACKs ........



"""
