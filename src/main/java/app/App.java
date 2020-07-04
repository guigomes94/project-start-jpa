package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.model.Person;

public class App {

	public static void main(String[] args) {

		var p1 = new Person("Guilherme", "guilherme@gmail.com");
		var p2 = new Person("Nami", "nami@gmail.com");
		var p3 = new Person("Naruto", "naruto@gmail.com");

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("start-jpa");
		EntityManager manager = managerFactory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		manager.getTransaction().commit();

		System.out.println("DONE!");
		managerFactory.close();
		manager.close();

	}

}
