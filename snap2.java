public class Fans {
private String Name;
private SnapchatAccount t = new snapchatAccount();

public Fans(String name) {
super();
Name = name;

}

public void update()
{

System.out.println("Hey " +Name+ ", BTS Uploaded a new Song.");
}

public void FollowBeautyPage(snapchatAccount TA) {
t = TA;
}
}
