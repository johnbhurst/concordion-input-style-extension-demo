// Copyright Red Energy Limited 2014
// Tommy Li (tommy.li@redenergy.com.au), 2014-12-06

package spec.concordion.command.set

import org.concordion.integration.junit4.ConcordionRunner
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(ConcordionRunner.class)
class SetInputStyleTest {

  @Before
  void enableInputStyleExtension() {
    System.setProperty('concordion.extensions', 'org.concordion.ext.inputstyle.InputStyleExtension')
  }

  Integer add(Integer a, Integer b) {
    a + b
  }
}
