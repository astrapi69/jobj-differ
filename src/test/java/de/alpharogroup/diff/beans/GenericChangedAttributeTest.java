/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.diff.beans;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import de.alpharogroup.evaluate.object.api.ContractViolation;
import de.alpharogroup.evaluate.object.checkers.EqualsHashCodeAndToStringCheck;

/**
 * The unit test class for the class {@link GenericChangedAttribute}
 */
public class GenericChangedAttributeTest
{

	/**
	 * Test method for {@link GenericChangedAttribute} constructors and builders
	 */
	@Test
	public final void testConstructors()
	{
		GenericChangedAttribute<String, String> model = new GenericChangedAttribute<>();
		assertNotNull(model);
		model = new GenericChangedAttribute<>("foo", "name", "value");
		assertNotNull(model);
		model = GenericChangedAttribute.<String, String> builder().build();
		assertNotNull(model);
	}

	/**
	 * Test method for {@link GenericChangedAttribute#equals(Object)} ,
	 * {@link GenericChangedAttribute#hashCode()} and {@link GenericChangedAttribute#toString()}
	 *
	 * @throws NoSuchMethodException
	 *             if an accessor method for this property cannot be found
	 * @throws IllegalAccessException
	 *             if the caller does not have access to the property accessor method
	 * @throws InvocationTargetException
	 *             if the property accessor method throws an exception
	 * @throws InstantiationException
	 *             if a new instance of the bean's class cannot be instantiated
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 * @throws ClassNotFoundException
	 *             occurs if a given class cannot be located by the specified class loader
	 */
	@Test
	public void testEqualsHashcodeAndToStringWithClass()
		throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
		InstantiationException, IOException, ClassNotFoundException
	{
		Optional<ContractViolation> expected;
		Optional<ContractViolation> actual;
		actual = EqualsHashCodeAndToStringCheck
			.equalsHashcodeAndToString(GenericChangedAttribute.class);
		expected = Optional.empty();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link GenericChangedAttribute} with {@link BeanTester}
	 */
	@Test
	public void testWithBeanTester()
	{
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(GenericChangedAttribute.class);
	}

}
