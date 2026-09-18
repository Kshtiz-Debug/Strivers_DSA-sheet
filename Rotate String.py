class Solution:    
    def rotateString(self, s, goal):
        x= s+s
        if goal in x:
            return True
        else :
            return False

