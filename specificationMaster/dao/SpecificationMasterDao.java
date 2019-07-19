package in.net.usit.specificationMaster.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.net.usit.specificationMaster.to.Specification;

@Repository
public interface SpecificationMasterDao extends JpaRepository<Specification, Integer> {

}
