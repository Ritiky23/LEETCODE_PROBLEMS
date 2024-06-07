class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Map<Integer,List<String>>dictionaryMap=new TreeMap<>();
        for(String s:dictionary){
            dictionaryMap.putIfAbsent(s.length(),new ArrayList<>());
            dictionaryMap.get(s.length()).add(s);
        }
        String[] wordList=sentence.split("\\s+");;
        StringBuilder res=new StringBuilder();
        for(String s:wordList){
            boolean append=false;
            for(Map.Entry<Integer,List<String>>entry:dictionaryMap.entrySet()){
                if(s.length()>entry.getKey()){
                    List<String>matchingStrings=entry.getValue();
                    for(String str:matchingStrings){
                        if(s.substring(0,str.length()).equals(str)){
                            res.append(str).append(" ");
                            append=true;
                            break;
                        }
                    }
                }
                if(append){
                    break;
                }
            }
            if(!append){
                res.append(s).append(" ");
            }
        }
        return res.toString().substring(0,res.length()-1);
    }
}
