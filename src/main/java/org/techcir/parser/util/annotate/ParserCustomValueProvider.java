/*
 * ================================================================
 *  Copyright          : Chamly Rathnayaka
 * ================================================================
 */
package org.techcir.parser.util.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ParserCustomValueProvider {

    Class<? extends ParserCustomValueResolver> resolver() default ParserEmpty.class;
    Class<? extends ParserCustomValueResolverSupplier> supplier() default ParserEmpty.class;
}
