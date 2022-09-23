"""
Write a program to create a class named
find and create a function to take input 
and create a class named circle
and inherite the props from find and 
find the circum of a circle 
"""
class find:
    def __init__(self,r):
        print(float(3.14*r*r))
class Circle(find):
    def __init__(self,r):
        find.__init__(self,r)
o = Circle(3)