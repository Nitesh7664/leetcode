class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap();
        for (List<String> kb: knowledge) {
            map.put(kb.get(0), kb.get(1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(') sb.append(s.charAt(i));
            else {
                i++;
                StringBuilder keySB = new StringBuilder();
                while (s.charAt(i) != ')') {
                    keySB.append(s.charAt(i));
                    i++;
                }
                String key = keySB.toString();
                if (map.containsKey(key)) {
                    sb.append(map.get(key));
                } else {
                    sb.append('?');
                }
            }
        }

        return sb.toString();
    }
}