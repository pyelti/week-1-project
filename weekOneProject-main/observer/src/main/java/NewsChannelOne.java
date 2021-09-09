public class NewsChannelOne implements Media
{
    public void update(News m) {
        System.out.println("NewsChannelContentOne :: " + m.getNewsContent());
    }
}
