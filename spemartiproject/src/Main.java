import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;

import spemarti.SpemartiFactory;
import spemarti.SpemartiPackage;
import spemarti.Workspace;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HbDataStore hbds = (HbDataStore) HbHelper.INSTANCE
				.createRegisterDataStore("MyDb");

		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/test");
		props.setProperty(Environment.USER, "root");
		props.setProperty(Environment.PASS, "admin");
		props.setProperty(Environment.DIALECT,
				org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
		props.setProperty(Environment.SHOW_SQL, "true");
		hbds.setProperties(props);

		hbds.setEPackages(new EPackage[] { SpemartiPackage.eINSTANCE });
		hbds.initialize();
		SessionFactory sessionFactory = hbds.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		SpemartiFactory spemartiFactory = SpemartiPackage.eINSTANCE
				.getSpemartiFactory();

//		 Version version = spemartiFactory.createVersion();
//		 version.setCreationDate("12/12/2010");
//		 version.setAnnotation("asnojj");
//		 version.addLabel("Lavelad");
//		 session.save(version);		
//		
//		 Baseline baseline = spemartiFactory.createBaseline();
//		 baseline.setCreationDate("12/12/2001");
//		 baseline.addLabel("Label 1");
//		 baseline.getVersion().add(version);
//		 session.save(baseline);
		 
		 // baseline.addLabel(label);
		//
		// Configuration configuration = spemartiFactory.createConfiguration();
		// configuration.setBaseline(baseline);
		// session.save(configuration);
		//

		//
		// VersionHistory versionHistory =
		// spemartiFactory.createVersionHistory();
		// versionHistory.setRootVersion(version);
		// session.save(versionHistory);
		//
		// VersionedExtent versionedExtent =
		// spemartiFactory.createVersionedExtent();
		// versionedExtent.setConfiguration(configuration);
		// versionedExtent.setBaseVersion(version);
		// versionedExtent.setVersionhistory(versionHistory);
		// session.save(versionedExtent);

		Workspace workspace = spemartiFactory.createWorkspace();
		workspace.setAnnotation("anotação");
		workspace.setId("0113");
		// workspace.getConfiguration().add(configuration);
		// workspace.getVersionedExtent().add(versionedExtent);
		session.save(workspace);

		// Text text = spemartiFactory.createText();
		// text.setBaseVersion(version);
		// text.setConfiguration(configuration);
		// text.setVersionhistory(versionHistory);
		// session.save(text);

		// Writer writer = libraryFactory.createWriter();
		// writer.setName("Juliano Dantas");
		// session.save(writer);
		//
		// Book book = libraryFactory.createBook();
		// book.setTitle("Eu por eu mesmo");
		// book.setCategory(BookCategory.BIOGRAPHY);
		// book.setAuthor(writer);
		// session.save(book);
		//
		// writer.getBooks().add(book);
		//
		// Library library = libraryFactory.createLibrary();
		// library.setName("Biblioteca Municipal");
		// library.getWriters().add(writer);
		// library.getBooks().add(book);
		// session.save(library);
		//
		// // Query query = session.createQuery("from Customer");
		// // @SuppressWarnings("unchecked")
		// // List<Customer> customers = query.list();
		// // for (Customer cust : customers) {
		// // System.out.println(cust.getCode() + " " + cust.getName());
		// // }

		tx.commit();
		session.close();
	}

}
