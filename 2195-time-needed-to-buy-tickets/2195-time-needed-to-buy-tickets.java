class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int ticket : tickets) {
            queue.add(ticket);
        }
        int time = 0;
        while(true) {
            int ticket = queue.remove();
            ticket--;
            time++;
            if (k==0) {
                if (ticket == 0) {
                    break;
                }else {
                    queue.add(ticket);
                    k = queue.size()-1;
                }
            }else {
                if (ticket>0) {
                    queue.add(ticket);
                }
                  k--;
            }
        }
        return time;
    }
}