public class Snapchat {
public static void main(String args[])

{
SnapchatAccount BTSAccount = new snapchatAccount();

Fans F1 = new Fans("surya");
Fans F2 = new Fans("pranay");

BTSAccount.Register(F1);
BTSAccount.Register(F2);


BTSAccount.unRegister(F1);


F1.FollowBeautyPage(BTSAccount);
F2.FollowBeautyPage(BTSAccount);

BTSAccount.upload("BTS New song - Permission To Dance");

}
}
