""" Given a string of any combinations of three
letters a, b,c find length of the smallest string
that can bre obtained by applying the following 
operation repeatedly

Take any two adjacent, distinct characters and replace 
them with the third

Input : cab 
output : 2
'ca' -> b ->bb (2)

input : bcab
Output : 1
->bc ->a ->ab -> ->c 
"""

    
def stringReduce(str):
    n = len(str)
    count = [0]*3
    for i in range(n):
        count[ord(str[i])- ord('a')]+=1
    if(count[0]==n or count[1]==n or count[2]==n):
        return n
    if((count[0]%2)==(count[1]%2) and (count[1]%2)==(count[2]%2)):
        return 2
    return 1
if __name__ =='__main__':
    
    str = "bcabcaccaa"

    print(stringReduce(str))