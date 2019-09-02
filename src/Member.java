public class Member extends Person{

    private boolean isBasic;
    private int fee;
    private String memberShipType;

    public Member() {
    }

    public int getFee() {
        return fee;
    }

    public String getMemberShipType() {
        return memberShipType;
    }

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;

        if (isBasic=false)
            {fee = 299;
            memberShipType="Full";}
        else if (isBasic=true)
            {fee = 199;
            memberShipType="Basic";}
    }
}
