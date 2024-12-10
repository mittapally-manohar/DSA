class Twitter {
    private Map<Integer, User> userMap = new HashMap<>();
    private static int timeStamp=0;
    private class Tweet {
        private int tweetId;
        private int time;
        public Tweet (int id, int time) {
            this.tweetId = id;
            this.time = time;
        }
    }

    private class User {
        private int userId;
        private Set<Integer> followers;
        private List<Tweet> tweets;

        public User(int userId) {
            this.userId = userId;
            this.followers = new HashSet<>();
            this.tweets = new ArrayList<>();
        }

        public void follow(int followeeId) {
            this.followers.add(followeeId);
        }

        public void unfollow(int followeeId) {
            this.followers.remove(followeeId);
        }

        public void postTweet(int tweetId) {
            this.tweets.add(new Tweet(tweetId, Twitter.timeStamp++));
        }
    }

    public Twitter() {
        userMap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!userMap.containsKey(userId)){
            User u = new User(userId);
            u.postTweet(tweetId);
            userMap.put(userId, u);
        } else {
            userMap.get(userId).postTweet(tweetId);
        }
    }
    
    public List<Integer> getNewsFeed(int userId) {
         List<Integer> result = new ArrayList<>();
        if (!userMap.containsKey(userId)) {
            return result; // No user found
        }

        PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> b.time - a.time);

        // Add the user's tweets
        User user = userMap.get(userId);
        if (user.tweets != null) {
            pq.addAll(user.tweets);
        }

        // Add followee tweets
        for (int followeeId : user.followers) {
            if (userMap.containsKey(followeeId)) {
                pq.addAll(userMap.get(followeeId).tweets);
            }
        }

        // Get the top 10 most recent tweets
        int count = 0;
        while (!pq.isEmpty() && count < 10) {
            result.add(pq.poll().tweetId);
            count++;
        }

        return result;
    }
    
    public void follow(int followerId, int followeeId) {
         if(!userMap.containsKey(followerId)){
            User u = new User(followerId);
            u.follow(followeeId);
            userMap.put(followerId, u);
        } else {
            userMap.get(followerId).follow(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
         if(!userMap.containsKey(followerId)){
            User u = new User(followerId);
            u.unfollow(followeeId);
            userMap.put(followerId, u);
        } else {
            userMap.get(followerId).unfollow(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */