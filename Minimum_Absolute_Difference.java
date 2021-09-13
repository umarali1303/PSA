class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list= new ArrayList();
        int diff=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            int temp;
            List<Integer> list1=new ArrayList();
            temp=arr[i+1]-arr[i];
            if(temp==diff){
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                list.add(list1);
            }
            else if(temp<diff){
                list.clear();
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                list.add(list1);
                diff=temp;
            }
            
            
        }
        return list;
    }
}
