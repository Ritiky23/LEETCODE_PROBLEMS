a=[2,1,4,5,6]
b=[]
for i in a:
    b.append(i**2)
print(b)
squared_numbers = list(map(lambda x: x ** 2, a))
print(squared_numbers)

x="abcdefghijk"
l="aeiou"
print(x for x in 1)


class Solution{
    static int minValue(String s, int k){
        HashMap<Character,Integer> h=new HashMap<>();
        List<Integer> a=new ArrayList<>();
        for(char c: s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        for(Map.Entry<Character,Integer> entry: h.entrySet()){
            a.add(entry.getValue());
        }
        int sum=0;
        for(int i=0;i<k;i++){
            Collections.sort(a); // Sort the list in ascending order
            int lastIndex = a.size() - 1; // Get the index of the last element
            a.set(lastIndex, a.get(lastIndex) - 1);
            
        }
        for(int i=0;i<a.size();i++){
            sum=a.get(i)*a.get(i);
        }
 
        return sum;
    }
}