/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dazito.couchdbrxjava.couchdb.repository;

import com.dazito.couchdbrxjava.model.Person;
import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

/**
 *
 * @author Pedro
 */
public class PersonRepository extends CouchDbRepositorySupport<Person> {

    public PersonRepository(CouchDbConnector db) {
        super(Person.class, db);
    }

}
