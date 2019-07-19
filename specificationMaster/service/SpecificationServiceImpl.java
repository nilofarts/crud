package in.net.usit.specificationMaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.net.usit.specificationMaster.dao.SpecificationMasterDao;
import in.net.usit.specificationMaster.to.Specification;

@Service
public class SpecificationServiceImpl implements SpecificationServiceBO {
	@Autowired
	private SpecificationMasterDao specificationMasterDao;

	@Override
	public List<Specification> getAll() {
		return specificationMasterDao.findAll();
	}

	@Override
	public void save(Specification specification) {
		
		specificationMasterDao.save(specification);
	}

	@Override
	public void delete(Integer id) {
		specificationMasterDao.delete(id);
	}

	@Override
	public void update(Specification specification) {
		// TODO Auto-generated method stub
		specificationMasterDao.save(specification);
	}

}
