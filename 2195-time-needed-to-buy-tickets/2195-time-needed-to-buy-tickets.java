class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int ticket : tickets) {
            queue.add(ticket);
        }
        int time = 0;
          while (true) {
            int ticket = queue.remove();  // remove front
            ticket--; // one ticket bought
            time++;

            // Check if person at front is the one we are tracking
            if (k == 0) {
                if (ticket == 0) {
                    break; // person k is done
                } else {
                    queue.add(ticket);
                    k = queue.size() - 1; // moved to back
                }
            } else {
                if (ticket > 0) {
                    queue.add(ticket);
                }
                k--; // person k moves closer to front
            }
        }
        return time;
    }
}