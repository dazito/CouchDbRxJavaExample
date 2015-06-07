/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dazito.couchdbrxjava.couchdb;

import com.dazito.couchdbrxjava.model.Person;
import com.dazito.couchdbrxjava.couchdb.repository.PersonRepository;
import java.util.List;
import org.ektorp.CouchDbConnector;
import org.ektorp.changes.ChangesCommand;
import org.ektorp.changes.ChangesFeed;

/**
 *
 * @author Pedro
 */
public class CouchDBQuery {


    public CouchDBQuery() {
    }
    
    
    public void createDocument(CouchDbConnector dbConnector, Object object) {
        dbConnector.create(object);
    }

    public List<Person> getAllPersons(CouchDbConnector db) {
        PersonRepository personRepository = new PersonRepository(db);

        return personRepository.getAll();
    }
    
    public void addPerson(CouchDbConnector dbConnector, Person person) {
        PersonRepository personRepository = new PersonRepository(dbConnector);
        
        personRepository.add(person);
    }
    
    public ChangesFeed changesFeed(CouchDbConnector couchDbConnector) {
        ChangesCommand.Builder builder = new ChangesCommand.Builder();
        builder.heartbeat(3000);
        builder.continuous(true);
        builder.includeDocs(true);
        
        ChangesCommand changesCommand = builder.build();
        
        ChangesFeed changesFeed = couchDbConnector.changesFeed(changesCommand);
        
        return changesFeed;
    }

}
