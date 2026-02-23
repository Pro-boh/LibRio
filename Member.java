public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getDetails() {
        return "Member Name: " + name + ", Member ID: " + memberId;
    }

    public static void main(String[] args) {
        Member member = new Member("John Doe", "M001");
        System.out.println(member.getDetails());
    }
}
