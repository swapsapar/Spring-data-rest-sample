package org.springframework.data.rest.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

/**
 * @author Jon Brisbin
 */
public class JpaLoader {

	private final static Logger LOG = LoggerFactory.getLogger(JpaLoader.class);
	@Autowired
	PersonRepository people;

	@Transactional
	public void loadData() {
        Person newPerson = new Person();

        newPerson.setName("BillyBob");
		Person billyBob = people.save(newPerson);
		LOG.info("Saved {}", billyBob);

        newPerson.setName("JohnDoe");
		Person john = people.save(newPerson);
		LOG.info("Saved {}", john);

        for(long i=0;i<30;i++) {
            Person p = new Person(i,"name"+i);
            people.save(p);
        }

		LOG.info("Person count: {}", people.count());
	}

}
