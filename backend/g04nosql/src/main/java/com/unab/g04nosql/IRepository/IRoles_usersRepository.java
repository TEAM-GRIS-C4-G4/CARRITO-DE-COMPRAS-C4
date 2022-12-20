package com.unab.g04nosql.IRepository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g04nosql.Collection.Roles_users;

public interface IRoles_usersRepository extends MongoRepository<Roles_users, String> {

}
