import java.util.ArrayList;
import java.util.List;
public class NewsPublisher implements Reporter {

    private List<Media> mediaList = new ArrayList<>();

    public void addMedia(Media o) {
        mediaList.add(o);
    }
    public void detachMedia(Media o) {
        mediaList.remove(o);
    }

    public void notify(News m) {
        for(Media o: mediaList) {
            o.update(m);
        }
    }
}
