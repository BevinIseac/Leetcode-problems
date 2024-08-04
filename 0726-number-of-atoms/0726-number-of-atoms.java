class Solution 
{
    public class Ss{
        String a = "";
        int cnt = 1;
        Ss(String a, int cnt)
        {this.a = a; this.cnt = cnt;}
    };


    public String countOfAtoms(String formula) {
        int n = formula.length(), i=0;
        StringBuilder ans = new StringBuilder();
        List<Ss> stack = new LinkedList<>();

        while(i<n){

                    if(formula.charAt(i)>='A' && formula.charAt(i)<='Z'){
                        String ff = ""+formula.charAt(i);i++;
                        if(i<n && formula.charAt(i)>='a' && formula.charAt(i)<='z'){
                            ff+=formula.charAt(i);i++;
                        }
                        int cnt = 1;
                        String pj = "";
                        while(i<n && formula.charAt(i)>='0' && formula.charAt(i)<='9'){
                            pj+=formula.charAt(i); i++;
                        }
                        if(pj.length()>0){cnt=Integer.valueOf(pj);}
                        stack.add(new Ss(ff, cnt));
                    }
                    else if(formula.charAt(i)=='('){
                        stack.add(new Ss(""+formula.charAt(i), 1));
                        i++;
                    }
                    else if(formula.charAt(i)==')'){
                        i++;
                        int cnt = 1;
                        String pj = "";
                        while(i<n && formula.charAt(i)>='0' && formula.charAt(i)<='9'){
                            pj+=formula.charAt(i); i++;
                        }
                        if(pj.length()>0){cnt=Integer.valueOf(pj);}
                        List<Ss> temp = new LinkedList<>();


                        while(!stack.isEmpty() && !stack.getLast().a.equals("(")){
                            Ss ab = stack.removeLast(); ab.cnt*=cnt;
                            temp.add(ab);
                        }
                        stack.removeLast();
                        stack.addAll(temp);
                    }

        }


        TreeMap<String, Integer> tm = new TreeMap<>();
        for(Ss p: stack){
           tm.put(p.a, tm.getOrDefault(p.a, 1)+p.cnt);
        }
        for(Map.Entry<String, Integer> ma: tm.entrySet()){
            ans.append(ma.getKey());
            Integer kk = ma.getValue() -1;
            String pl = kk.toString();
            if(kk!=1)
            ans.append(pl);
        }
        return ans.toString();
    }
}