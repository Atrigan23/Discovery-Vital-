package za.ac.nwu.ac.domain.persistence;
import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name ="MEMBER_REWARD" )
public class MemberReward implements Serializable {
    private static final long serialVersionUID = 3833725316797154577L;

    @Id
    @SequenceGenerator(name = "MEMBER_REWARD_SEQ_GEN", sequenceName = "MEMBER_REWARD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_REWARD_SEQ_GEN")
    @Column(name = "MEMBER_REWARD_ID")
    private long member_reward_id;
    @OneToMany(fetch = FetchType.LAZY)
    @Column(name = "MEMBER_ID")
    private Member member_id;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "REWARD_ID")
    private RewardType reward_id;
    @Column(name = "TRANSACT_DATE")
    private LocalDate transact_date;

    public MemberReward(long member_reward_id, Member member_id, RewardType reward_id, LocalDate transact_date) {
        this.member_reward_id = member_reward_id;
        this.member_id = member_id;
        this.reward_id = reward_id;
        this.transact_date = transact_date;
    }

    public MemberReward() {
    }

    public long getMember_reward_id() {
        return member_reward_id;
    }

    public void setMember_reward_id(long member_reward_id) {
        this.member_reward_id = member_reward_id;
    }

    public Member getMember_id() {
        return member_id;
    }

    public void setMember_id(Member member_id) {
        this.member_id = member_id;
    }

    public RewardType getReward_id() {
        return reward_id;
    }

    public void setReward_id(RewardType reward_id) {
        this.reward_id = reward_id;
    }

    public LocalDate getTransact_date() {
        return transact_date;
    }

    public void setTransact_date(LocalDate transact_date) {
        this.transact_date = transact_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberReward that = (MemberReward) o;
        return member_reward_id == that.member_reward_id && Objects.equals(member_id, that.member_id) && Objects.equals(reward_id, that.reward_id) && Objects.equals(transact_date, that.transact_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member_reward_id, member_id, reward_id, transact_date);
    }

    @Override
    public String toString() {
        return "MemberReward{" +
                "member_reward_id=" + member_reward_id +
                ", member_id='" + member_id + '\'' +
                ", reward_id='" + reward_id + '\'' +
                ", transact_date=" + transact_date +
                '}';
    }
}