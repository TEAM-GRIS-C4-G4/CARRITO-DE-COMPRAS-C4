package com.unab.g04nosql.IRepository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g04nosql.Collection.Roles_permissions;

public interface IRoles_permissionsRepository extends MongoRepository<Roles_permissions, String> {

}
