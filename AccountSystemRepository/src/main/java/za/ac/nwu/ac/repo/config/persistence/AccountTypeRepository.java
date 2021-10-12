package za.ac.nwu.ac.repo.config.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.MemberType;

@Repository
public interface AccountTypeRepository extends JpaRepository<MemberType, Long>
{
}
