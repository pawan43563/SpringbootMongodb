package com.example.pawan.pawansharma.repositories;import com.example.pawan.pawansharma.models.Cars;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;public interface CarsRepository extends MongoRepository<Cars, String> {
  Cars findBy_id(ObjectId _id);
}