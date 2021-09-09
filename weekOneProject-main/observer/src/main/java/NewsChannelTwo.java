public class NewsChannelTwo implements Media
{

    public void update(News m) {
        System.out.println("NewsChannelContentTwo :: " + m.getNewsContent());
    }
}
