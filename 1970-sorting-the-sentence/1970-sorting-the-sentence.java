class Solution
{
    public String sortSentence(String s)
    {
        String[] str = s.split("\\s+");
        String d = "";
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='1'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }

        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='2'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='3'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='4'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='5'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='6'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='7'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='8'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            int b = str[i].length();
            for(int j = 0;j<b;j++){
                if(str[i].charAt(j)=='9'){
                    StringBuilder sb = new StringBuilder(str[i]);
                    d = d+sb.deleteCharAt(b-1)+" ";
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return d.trim();
    }
}