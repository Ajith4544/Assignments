package com.cropinfodemo1.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropinfodemo1.models.CropItem;

import java.util.List;
import java.util.Optional;

public interface CropRepository extends MongoRepository<CropItem,String> {
      List<CropItem> findByType(String type);
   List<CropItem> findByName(String name);
    List<CropItem> findByEmail(String email);

    CropItem findBy_id(ObjectId _id);



}
