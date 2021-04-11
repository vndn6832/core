package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //option + n

    private final MemberRepository memberRepository = new MemoryMemberRepository(); //command + shift + enter

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
