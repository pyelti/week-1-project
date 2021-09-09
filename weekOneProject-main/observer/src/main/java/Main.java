public class Main
{
    public static void main(String[] args)
    {
        NewsChannelOne newsChannelOne = new NewsChannelOne();
        NewsChannelTwo newsChannelTwo = new NewsChannelTwo();
        NewsChannelThree newsChannelThree = new NewsChannelThree();

        NewsPublisher newsPublisher = new NewsPublisher();

        newsPublisher.addMedia(newsChannelOne);
        newsPublisher.addMedia(newsChannelTwo);

        newsPublisher.notify(new News("First Message"));

        newsPublisher.detachMedia(newsChannelOne);
        newsPublisher.addMedia(newsChannelThree);

        newsPublisher.notify(new News("Second Message"));
    }
}
