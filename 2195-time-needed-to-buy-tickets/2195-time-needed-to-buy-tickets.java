class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       int time = 0;
       Queue<Integer> queue = new LinkedList<>();
       for (int ticket : tickets) {
        queue.add(ticket);
       }
       while (true && !queue.isEmpty()) {
            int ticket = queue.remove()-1;
            time++;
            if (k==0) {
               if (ticket == 0) {
                    break;
                } else {
                    queue.add(ticket);
                    k = queue.size()-1;
                }
            } else {
                if (ticket != 0) {
                    queue.add(ticket);
                }
                 k--;
            }
       }
       return time;
    }
}