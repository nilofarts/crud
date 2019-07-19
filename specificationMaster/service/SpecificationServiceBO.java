package in.net.usit.specificationMaster.service;

import java.util.List;

import in.net.usit.specificationMaster.to.Specification;

public interface SpecificationServiceBO {
	
	public List<Specification> getAll();
	public void save(Specification specification);
	public void delete(Integer id);
	public void update(Specification specification);
	
	

}
