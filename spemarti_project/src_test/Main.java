import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import spemarti.LabeledText;
import spemarti.SpemartiFactory;
import spemarti.SpemartiPackage;
import spemarti.Workspace;
import spemarti.custom.dao.LabeledTextDao;
import spemarti.custom.dao.WorkspaceDao;
import spemarti.custom.dao.impl.LabeledTextDaoImpl;
import spemarti.custom.dao.impl.WorkspaceDaoImpl;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		HbDataStore hbds = initialize();
		SessionFactory sessionFactory = hbds.getSessionFactory();
		SpemartiFactory spemartiFactory = SpemartiPackage.eINSTANCE
				.getSpemartiFactory();

		Workspace workspace = spemartiFactory.createWorkspace();
		workspace.setAnnotation("anotação");
		workspace.setId("0113");
		// // workspace.getConfiguration().add(configuration);
		// // workspace.getVersionedExtent().add(versionedExtent);
		// session.save(workspace);
		WorkspaceDao workspaceDao = new WorkspaceDaoImpl(sessionFactory);
		workspaceDao.save(workspace);
		List<?> findByExample = workspaceDao.findByExample(workspace);
		
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
