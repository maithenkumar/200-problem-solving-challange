package Greedy_Algorithm;

// https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
public class Nmeetingsinoneroom {
    public static void main(String[] args) {
        int N = 6;
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        System.out.println(maxMeetings(start, end, N));
    }
 public static int maxMeetings2(int start[], int end[], int n)
    {
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        for(int i=0;i<n;i++){
            if(sortedMap.get(end[i]) == null){
                sortedMap.put(end[i],start[i]);
            } else{
                sortedMap.put(end[i],Math.max(sortedMap.get(end[i]),start[i]));
            }
        }
         int count = 0 , prevEnd = -1;
         for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
             if(prevEnd < entry.getValue()){
                 count++;
                 prevEnd = entry.getKey();
             }
         }
         return count;
  }
    public static int maxMeetings(int start[], int end[], int n) {
        int meet = 0;
        for (int i = 0; i < n; i++) {
            if (meet == 0) {
                if (start[i] < end[i]) {
                    meet += 1;
                }
            } else {
                if (start[i] > start[i - 1]) {
                    if (start[i] < end[i]) {
                        meet += 1;
                    }

                }
            }
        }
        return meet;
    }
}
