// // Problem: Encode a list of strings into a single string so it can be transmitted,
// and decode it back to the original list without ambiguity.
// Approach: Prefix each string with its length followed by a delimiter '#' 
// During decoding, read the length, extract that many characters, and repeat.
// Time Complexity: O(n), Space Complexity: O(n)



public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
       StringBuilder encoded = new StringBuilder();
       for(String s : strs){
        encoded.append(s.length()).append("#").append(s);
       }
       return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
List<String> list = new ArrayList<>();
int i = 0;
while(i < str.length()){
    int j = i;
    while(str.charAt(j) != '#'){
        j++;
    }
    int length = Integer.parseInt(str.substring(i , j));
    String s = str.substring(j + 1, j + 1 + length);
    list.add(s);
    i = j + 1 + length;
}
return list;
    }
}
