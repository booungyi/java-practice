package boou.java_practice;

import java.awt.*;

public class MemberResponse {
    private String loginId;
    private String username;


    public MemberResponse(String loginId, String username) {
        this.loginId = loginId;
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getUsername() {
        return username;
    }
    //Member 오브젝트가 하나있을 때,Member 오브젝트의 데이터로 MemberResponse 오브젝트를 새로 지어주세요
}

