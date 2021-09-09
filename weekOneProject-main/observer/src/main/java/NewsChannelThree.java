public class NewsChannelThree implements Media
{

    public void update(News m) {
        System.out.println("NewsChannelContentThree :: " + m.getNewsContent());
    }
}
