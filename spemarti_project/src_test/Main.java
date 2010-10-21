import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import spemarti.SpemartiFactory;
import spemarti.SpemartiPackage;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		HbDataStore hbds = initialize();
		SessionFactory sessionFactory = hbds.getSessionFactory();
		SpemartiFactory spemartiFactory = SpemartiPackage.eINSTANCE
				.getSpemartiFactory();

		
//		LabeledText labeledText = spemartiFactory.createLabeledText();
//		LabeledTextDao labeledTextDao = new LabeledTextDaoImpl(sessionFactory);
//		labeledText.setLabel("Label");
//		labeledText.setVersionhistory(value);
//		labeledTextDao.save(labeledText);
//		labeledTextDao.findByExample(labeledText);
	}

	private static HbDataStore initialize() {
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
		return hbds;
	}

}
