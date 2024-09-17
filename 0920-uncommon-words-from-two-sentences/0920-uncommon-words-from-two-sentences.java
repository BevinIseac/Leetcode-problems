class Solution {
    public static boolean count(String s,List li){
        int c=0;
        for(int i=0;i<li.size();i++)
        {
            if(s.equals(li.get(i)))
                c++;
        }
        if(c==1)
            return true;
        return false;
    }
    public String[] uncommonFromSentences(String s1, String s2) {
        String l1[]=s1.split(" ");
        String l2[]=s2.split(" ");
        List<String> arr1=Arrays.asList(l1);
        List<String> arr2=Arrays.asList(l2);
        List<String> list=new ArrayList();
        for(int i=0;i<arr1.size();i++){
            if(!arr2.contains(arr1.get(i)) && count(arr1.get(i),arr1))
                list.add(arr1.get(i));
        }
        for(int i=0;i<arr2.size();i++){
            if(!arr1.contains(arr2.get(i)) && count(arr2.get(i),arr2))
                list.add(arr2.get(i));
        }
        String res[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}