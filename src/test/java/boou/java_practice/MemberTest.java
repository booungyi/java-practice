package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberTest {
    @Test
    void name() {
        Member member = new Member("ansdlsgur", "booungyi", "dlsgur");
        MemberResponse response = new MemberResponse(member.getId(), member.getNickname());
        System.out.println(member.getId());
        System.out.println(member.getNickname());
        System.out.println(member.getMemberlist());

        assertThat(response.getLoginId()).isEqualTo(member.getId());
        assertThat(response.getUsername()).isEqualTo(member.getNickname());
    }

    @Test
    void memberListToMemberResponseList() {
        List<Member> members = List.of(
                new Member("dora", "도라에몽", "abc123"),
                new Member("jin", "진구", "abc123"),
                new Member("bisil", "비실이", "abc123"),
                new Member("tt", "퉁퉁이", "abc123"));

        //목적
        // members의 id 와 memberResponses 의 loginId 가 같은지 확인
        // 리스트 하나를 선언
        List<MemberResponse> memberResponses = new ArrayList<>();

//        List<MemberResponse> memberResponses = members.stream()
//                .map(member -> new MemberResponse(member.getId(), member.getNickname())).toList();

        for (Member member : members) {
            MemberResponse memberResponse = new MemberResponse(member.getId(), member.getNickname());
            memberResponses.add(memberResponse);
        }

        for (int i = 0; i < members.size(); i++) {
            System.out.println(memberResponses.get(i).getUsername()+ " "+ memberResponses.get(i).getLoginId());
            assertThat(memberResponses.get(i).getLoginId()).isEqualTo(members.get(i).getId());
            assertThat(memberResponses.get(i).getUsername()).isEqualTo(members.get(i).getNickname());
        }
    }

    @Test
    void memberListToMemberResponseList2() {
        List<Member> members = List.of(new Member("dora", "", "abc123"),
                new Member("jin", "", "abc123"),
                new Member("bisil", "비실이", "abc123"),
                new Member("tt", "퉁퉁이", "abc123"));
        List<MemberResponse> memberResponses = new ArrayList<>();


        for(Member member : members) {
            if (member.getNickname().isEmpty()) {
                MemberResponse memberResponse = new MemberResponse(member.getId(), member.getNickname());
                memberResponses.add(memberResponse);
            }
        }
//        List<MemeberResponse> memberResponses = members.stream()
//                .filter(n -> n.getNickname().isEmpty())
//                .map(memeber -> new MemberResponse(member.getId),member.getNickname())).toList());

        for (int i = 0; i < memberResponses.size(); i++) {
            assertThat(memberResponses.get(i).getLoginId()).isEqualTo(members.get(i).getId());
            assertThat(memberResponses.get(i).getUsername()).isEmpty();
        }
    }
}
