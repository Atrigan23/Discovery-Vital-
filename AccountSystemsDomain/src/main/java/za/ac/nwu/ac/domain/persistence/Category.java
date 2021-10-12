package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name ="CATEGORY" )
public class Category implements Serializable {
    private static final long serialVersionUID = 3833725316797154577L;

    @Id
    @SequenceGenerator(name = "CATEGORY_SEQ_GEN", sequenceName = "CATEGORY_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORY_SEQ_GEN")
    @OneToMany(targetEntity = RewardType.class,fetch = FetchType.LAZY ,mappedBy = "category_id")
    @Column(name = "CATEGORY_ID")
    private Category category_id;

    @Column(name = "CATEGORY_DESCRIPTION")
    private String category_description;


    public Category() {
    }

    public  Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id( Category category_id) {
        this.category_id = category_id;
    }

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return category_id == category.category_id && Objects.equals(category_description, category.category_description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category_id, category_description);
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_description='" + category_description + '\'' +
                '}';
    }
}

