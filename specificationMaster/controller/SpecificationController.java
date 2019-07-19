package in.net.usit.specificationMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.net.usit.specificationMaster.service.SpecificationServiceBO;
import in.net.usit.specificationMaster.to.Specification;

@CrossOrigin
@RestController
public class SpecificationController {
	
	@Autowired
	private SpecificationServiceBO specificationServiceBO;
	
	@GetMapping(path="/get",produces="application/json")
	public ResponseEntity<List<Specification>> getAll(){
		return ResponseEntity.ok(specificationServiceBO.getAll());
	}
	
	@PostMapping(path="/save")
	public void save(@RequestBody Specification specification) {
		 specificationServiceBO.save(specification);
		// return ResponseEntity.ok("Saved Successfull");
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void delete(@PathVariable Integer id) {
		specificationServiceBO.delete(id);
		// return ResponseEntity.ok("Delete Successfull");
	}
	@PutMapping(path="/update")
	public void update(@RequestBody Specification specification) {
		specificationServiceBO.update(specification);
		 //return ResponseEntity.ok("Saved Successfull");
}
}
