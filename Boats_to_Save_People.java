class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        c=0
        i=0
        j=len(people)-1
        while(i<=j):
            if i==j:
                c+=1
                break
            if((people[i]+people[j])<=limit):
                c+=1
                i+=1
                j-=1
            else:
                c+=1
                j-=1
        return c
