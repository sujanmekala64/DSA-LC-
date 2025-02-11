class Solution {
    public String removeOccurrences(String s, String part) {
        // while(s.contains(part)){
        //     s=s.replaceFirst(part,"");
        // }
        // return s;
        int idx = s.indexOf(part);
        while(idx!=-1){
            s=s.substring(0,idx)+s.substring(idx+part.length());
            idx=s.indexOf(part);
        }
        return s;
    }
}

// class Solution {
// public:
//     string removeOccurrences(string s, string part) {
//         int i = s.find(part);
//         while(i!=-1){
//             s = s.substr(0,i) + s.substr(i+part.size());
//             i = s.find(part);
//         }
//         return s;
//     }
// };