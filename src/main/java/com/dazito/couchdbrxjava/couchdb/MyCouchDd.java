/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dazito.couchdbrxjava.couchdb;

import java.net.MalformedURLException;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

/**
 *
 * @author Pedro
 */
public class MyCouchDd {
    
    private final String url;
    private final int port;
    private String databaseName;
    
    private CouchDbConnector dbConnector;
    private CouchDbInstance dbInstance;

    public MyCouchDd(String url, int port, String databaseName) {
        this.url = url;
        this.port = port;
        this.databaseName = databaseName;
    }

    public CouchDbConnector getDbConnector() {
        return dbConnector;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    
    public CouchDbConnector connect() throws MalformedURLException {
        HttpClient httpClient = new StdHttpClient.Builder().url(url + ":" + port).build();

        dbInstance = new StdCouchDbInstance(httpClient);
        dbConnector = new StdCouchDbConnector(databaseName, dbInstance);

        dbConnector.createDatabaseIfNotExists();

        
        return dbConnector;
    }
}
