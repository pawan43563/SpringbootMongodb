package com.example.pawan.pawansharma;
import com.example.pawan.pawansharma.models.Cars;
import org.bson.types.ObjectId;
import com.example.pawan.pawansharma.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;@RestController
@RequestMapping("/cars")
public class CarsController {
  @Autowired
  private CarsRepository repository;
 
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Cars> getAllCars() {
    return repository.findAll();
  }  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Cars getCarById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
 
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyCarById(@PathVariable("id") ObjectId id, @Valid @RequestBody Cars cars) {
    cars.set_id(id);
    repository.save(cars);
  }
 
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Cars createCar(@Valid @RequestBody Cars cars) {
    cars.set_id(ObjectId.get());
    repository.save(cars);
    return cars;
  }
 
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteCar(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
}