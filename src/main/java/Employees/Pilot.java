package Employees;

public class Pilot {

    private String name;
    private RankType rankType;
    private String licenseNum;

    public Pilot(String name, RankType rankType, String licenseNum){
        this.name = name;
        this.rankType = rankType;
        this.licenseNum = licenseNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String fly(){
        return "I can fly";
    }

}
