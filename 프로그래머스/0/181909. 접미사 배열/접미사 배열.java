import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] str = new String[my_string.length()];
        Arrays.fill(str, "");
        for(int i = 0; i<my_string.length(); i++){
            for(int j = i; j<my_string.length(); j++){
                str[i] += my_string.charAt(j);
            }
        }
        
        for(int i = 1; i>0;){
            i = 0;
            for(int j = 0; j<my_string.length()-1; j++){
                if(str[j].charAt(0)>str[j+1].charAt(0)){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                    i++;
                }
            }
        }
        
        for(int i = 1; i>0;){
            i = 0;
            for(int j = 0; j<my_string.length()-1; j++){
                if(str[j].charAt(0)==str[j+1].charAt(0)){
                    for(int k = 1; k<my_string.length(); k++){
                        if(str[j].length()>k && str[j+1].length()>k){
                            if(str[j].charAt(k)>str[j+1].charAt(k)){
                                String temp = str[j];
                                str[j] = str[j+1];
                                str[j+1] = temp;
                                i++;
                                break;
                            }
                            else if(str[j].charAt(k)==str[j+1].charAt(k)){
                                continue;
                            }else break;
                        }else if(str[j].length()>str[j+1].length()){
                            String temp = str[j];
                                str[j] = str[j+1];
                                str[j+1] = temp;
                                i++;
                        }
                    }
                }
            }
        }
        
        
        String[] answer = str;
        return answer;
    }
}