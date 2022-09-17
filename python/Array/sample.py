"""Given a string with lowercase 
repeated characters,the task is to rearrange characters in
a string so that no two adjacent characters are the same
if it is not possible to do so, then print "not possible":
    input : aaabc
    output : abaca
    //
    input : aa
    output : not possible 
    // 
    input : aaaabc 
    out : not possible
    // 
    input : aabc 
    output : abac
"""


import heapq 
from collections import Counter

class Key:
    pass 

def rearrange(str:str):
    n = len(str)
    count = dict()
    for i  in str:
        count[ord(i)]= count.get(ord(i),0)+1
    pq =[]
    for c in range(97,123):
        

if __name__=='__main__':
    string = "aaabc"
    rearrange(string)