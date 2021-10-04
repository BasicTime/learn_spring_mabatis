package cn.ms22.learn_spring_mybatis.model;

import java.io.Serializable;

public class Member implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.id
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.pid
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.generation
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String generation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.name
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.secName
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String secname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.sequence
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String sequence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.brief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String brief;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.spouse
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String spouse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.spouseBrief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String spousebrief;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.otherSpouse
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String otherspouse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.otherSpouseBrief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String otherspousebrief;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.misc
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private String misc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.id
     *
     * @return the value of member.id
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.id
     *
     * @param id the value for member.id
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.pid
     *
     * @return the value of member.pid
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withPid(Integer pid) {
        this.setPid(pid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.pid
     *
     * @param pid the value for member.pid
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.generation
     *
     * @return the value of member.generation
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withGeneration(String generation) {
        this.setGeneration(generation);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.generation
     *
     * @param generation the value for member.generation
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setGeneration(String generation) {
        this.generation = generation == null ? null : generation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.name
     *
     * @return the value of member.name
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.name
     *
     * @param name the value for member.name
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.secName
     *
     * @return the value of member.secName
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getSecname() {
        return secname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withSecname(String secname) {
        this.setSecname(secname);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.secName
     *
     * @param secname the value for member.secName
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setSecname(String secname) {
        this.secname = secname == null ? null : secname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.sequence
     *
     * @return the value of member.sequence
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withSequence(String sequence) {
        this.setSequence(sequence);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.sequence
     *
     * @param sequence the value for member.sequence
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.brief
     *
     * @return the value of member.brief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withBrief(String brief) {
        this.setBrief(brief);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.brief
     *
     * @param brief the value for member.brief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.spouse
     *
     * @return the value of member.spouse
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withSpouse(String spouse) {
        this.setSpouse(spouse);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.spouse
     *
     * @param spouse the value for member.spouse
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setSpouse(String spouse) {
        this.spouse = spouse == null ? null : spouse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.spouseBrief
     *
     * @return the value of member.spouseBrief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getSpousebrief() {
        return spousebrief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withSpousebrief(String spousebrief) {
        this.setSpousebrief(spousebrief);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.spouseBrief
     *
     * @param spousebrief the value for member.spouseBrief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setSpousebrief(String spousebrief) {
        this.spousebrief = spousebrief == null ? null : spousebrief.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.otherSpouse
     *
     * @return the value of member.otherSpouse
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getOtherspouse() {
        return otherspouse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withOtherspouse(String otherspouse) {
        this.setOtherspouse(otherspouse);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.otherSpouse
     *
     * @param otherspouse the value for member.otherSpouse
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setOtherspouse(String otherspouse) {
        this.otherspouse = otherspouse == null ? null : otherspouse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.otherSpouseBrief
     *
     * @return the value of member.otherSpouseBrief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getOtherspousebrief() {
        return otherspousebrief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withOtherspousebrief(String otherspousebrief) {
        this.setOtherspousebrief(otherspousebrief);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.otherSpouseBrief
     *
     * @param otherspousebrief the value for member.otherSpouseBrief
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setOtherspousebrief(String otherspousebrief) {
        this.otherspousebrief = otherspousebrief == null ? null : otherspousebrief.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.misc
     *
     * @return the value of member.misc
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public String getMisc() {
        return misc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public Member withMisc(String misc) {
        this.setMisc(misc);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.misc
     *
     * @param misc the value for member.misc
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    public void setMisc(String misc) {
        this.misc = misc == null ? null : misc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Mon Oct 04 09:40:00 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", generation=").append(generation);
        sb.append(", name=").append(name);
        sb.append(", secname=").append(secname);
        sb.append(", sequence=").append(sequence);
        sb.append(", brief=").append(brief);
        sb.append(", spouse=").append(spouse);
        sb.append(", spousebrief=").append(spousebrief);
        sb.append(", otherspouse=").append(otherspouse);
        sb.append(", otherspousebrief=").append(otherspousebrief);
        sb.append(", misc=").append(misc);
        sb.append("]");
        return sb.toString();
    }
}