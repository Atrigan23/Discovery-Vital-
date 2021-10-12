package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name ="MEMBER" )
public class MemberType implements Serializable
{
    private static final long serialVersionUID = 3833725316797154577L;

    @Id
    @SequenceGenerator(name ="MEMBER_SEQ_GEN", sequenceName = "MEMBER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "MEMBER_SEQ_GEN")
    @OneToMany(targetEntity = MemberReward.class ,fetch = FetchType.LAZY , mappedBy = "member_id")
    @Column(name = "member_id")
    private MemberType member_id;

    @Column(name = "MEMBER_SURNAME")
    private String member_surname;

    @Column(name = "MEMBER_NAME")
    private String member_name;

    @Column(name = "MEMBER_EMAIL")
    private String member_email;

    @Column(name = "MEMBER_TOTAL_TILES")
    private long member_total_miles;

    public MemberType( MemberType member_id, String member_surname, String member_name, String member_email, long member_total_miles) {
        this.member_id = member_id;
        this.member_surname = member_surname;
        this.member_name = member_name;
        this.member_email = member_email;
        this.member_total_miles = member_total_miles;

    }

    public MemberType() {

    }

    public MemberType getMember_id() {
        return member_id;
    }

    public void setMember_id(MemberType member_id) {
        this.member_id = member_id;
    }

    public String getMember_surname() {
        return member_surname;
    }

    public void setMember_surname(String member_surname) {
        this.member_surname = member_surname;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public long getMember_total_miles() {
        return member_total_miles;
    }

    public void setMember_total_miles(long member_total_miles) {
        this.member_total_miles = member_total_miles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberType that = (MemberType) o;
        return member_id == that.member_id && Objects.equals(member_surname, that.member_surname) && Objects.equals(member_name, that.member_name) && Objects.equals(member_email, that.member_email) && Objects.equals(member_total_miles, that.member_total_miles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member_id, member_surname, member_name, member_email, member_total_miles);
    }

    @Override
    public String toString() {
        return "MemberType{" +
                "member_id=" + member_id +
                ", member_surname='" + member_surname + '\'' +
                ", member_name='" + member_name + '\'' +
                ", member_email='" + member_email + '\'' +
                ", member_total_miles='" + member_total_miles + '\'' +
                '}';
    }
}
