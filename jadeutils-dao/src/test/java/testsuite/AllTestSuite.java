package testsuite;

import jadeutils.dao.JadeDaoTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ UnitTestSuite.class, JadeDaoTest.class })
public class AllTestSuite {

}
