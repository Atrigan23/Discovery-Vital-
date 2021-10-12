package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name ="REWARD" )
public class RewardType implements Serializable
{
    private static final long serialVersionUID = 3833725316797154577L;

    @Id
    @SequenceGenerator(name ="REWARD_SEQ_GEN", sequenceName = "REWARD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "REWARD_SEQ_GEN")

    @OneToMany(targetEntity = MemberReward.class, fetch = FetchType.LAZY ,mappedBy = "reward_id")
    @Column(name = "REWARD_ID")
    private RewardType reward_id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category_id;

    @Column(name = "REWARD_NAME")
    private String reward_name;

    @Column(name = "REWARD_PRICE")
    private String reward_price;

    @Column(name = "REWARD_SPECIAL_PRICE")
    private String reward_special;

    public RewardType(RewardType reward_id, Category category_id, String reward_name, String reward_price, String reward_special) {
        this.reward_id = reward_id;
        this.category_id = category_id;
        this.reward_name = reward_name;
        this.reward_price = reward_price;
        this.reward_special = reward_special;
    }

    public RewardType() {

    }

    public RewardType getReward_id() {
        return reward_id;
    }

    public void setReward_id(RewardType reward_id) {
        this.reward_id = reward_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public String getReward_name() {
        return reward_name;
    }

    public void setReward_name(String reward_name) {
        this.reward_name = reward_name;
    }

    public String getReward_price() {
        return reward_price;
    }

    public void setReward_price(String reward_price) {
        this.reward_price = reward_price;
    }

    public String getReward_special() {
        return reward_special;
    }

    public void setReward_special(String reward_special) {
        this.reward_special = reward_special;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardType that = (RewardType) o;
        return reward_id == that.reward_id && Objects.equals(category_id, that.category_id) && Objects.equals(reward_name, that.reward_name) && Objects.equals(reward_price, that.reward_price) && Objects.equals(reward_special, that.reward_special);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reward_id, category_id, reward_name, reward_price, reward_special);
    }

    @Override
    public String toString() {
        return "RewardType{" +
                "reward_id=" + reward_id +
                ", category_id='" + category_id + '\'' +
                ", reward_name='" + reward_name + '\'' +
                ", reward_price='" + reward_price + '\'' +
                ", reward_special='" + reward_special + '\'' +
                '}';
    }
}