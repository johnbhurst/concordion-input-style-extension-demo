// Copyright Red Energy Limited 2014
// Tommy Li (tommy.li@redenergy.com.au), 2014-12-06

package spec.concordion.command.set

import org.concordion.api.extension.Extensions
import org.concordion.ext.inputstyle.InputStyleExtension
import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

@RunWith(ConcordionRunner.class)
@Extensions(InputStyleExtension)
class SetInputStyleTest {

  Integer add(Integer a, Integer b) {
    a + b
  }
}
