class Solution {
    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: tiles.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        return permute(map);
    }

    private int permute(Map<Character, Integer> map){
        int ans = 0;
        for (char c: map.keySet()){
            if (map.get(c)>0){
                ans+=1;
                map.put(c, map.get(c)-1);
                ans+=permute(map);
                map.put(c, map.get(c)+1);
            }
        }
        return ans;
    }
}

