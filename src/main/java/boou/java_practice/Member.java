package boou.java_practice;

import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private List<String> memberlist = new ArrayList<>();
    private String id;
    private String nickname;
    private String password;

    public List<String> getMemberlist() {
        memberlist.add(id);
        memberlist.add(nickname);
        memberlist.add(password);
        return memberlist;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public Member(String id, String nickname, String password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }
}
