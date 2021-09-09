public interface Reporter
{
    public void addMedia(Media o);
    public void detachMedia(Media o);
    public void notify(News m);
}
