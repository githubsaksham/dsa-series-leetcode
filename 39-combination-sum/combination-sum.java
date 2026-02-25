

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>>[] result = new ArrayList[target + 1];

        for(int i=0; i<=target; i++){
            result[i] = new ArrayList<>();
        }

        result[0].add(new ArrayList<>()); // for fetching start value 

        for(int num : candidates){
            for(int i = num; i<= target; i++){
                for(List<Integer> combination: result[i-num]){
                    List<Integer> newCombination = new ArrayList<>(combination);
                    newCombination.add(num);
                    result[i].add(newCombination);
                }
            }
        }

        return result[target];
        

        
    }
}