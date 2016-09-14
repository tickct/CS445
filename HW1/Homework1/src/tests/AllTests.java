package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CreatureTests.class, ThingTests.class, FlyTests.class, AntTests.class, BatTests.class, TigerTests.class })
public class AllTests {

}
