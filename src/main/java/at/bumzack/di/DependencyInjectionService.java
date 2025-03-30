package at.bumzack.di;

import at.bumzack.exception.AmbiguousBeanException;
import at.bumzack.exception.BeanNotFoundException;
import at.bumzack.exception.ClassCreationException;

/**
 * BEFORE you begin -> estimations!!!
 * <p>
 * rules
 * - no external dependencies
 * - source files must not be modified, except for level 04 (there it is necessary resp. required)
 * <p>
 * <p>
 * level 01 easy - estimated:
 * level 01 easy - actual:
 * <p>
 * level 02 a little bit harder - estimated:
 * level 02 a little bit harder - actual:
 * <p>
 * level 03 brutal - estimated:
 * level 03 brutal - actual:
 * <p>
 * level 04 WTF - estimated:
 * level 04 WTF - actual:
 */

public class DependencyInjectionService {

    private static final DependencyInjectionService instance = new DependencyInjectionService();

    private DependencyInjectionService() {

    }

    public static DependencyInjectionService getInstance() {
        return instance;
    }

    // TODO
    // add properties as needed - or not :-)

    // return type can be changed if everything else still works
    // method parameters not
    public Object beanByName(final String beanName) throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        return null;
    }


    // return type can be changed if everything else still works
    // method parameters not
    public Object beanByType(final Class clz) throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        return null;
    }
}
