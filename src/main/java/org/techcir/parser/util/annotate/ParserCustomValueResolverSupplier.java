/*
 * ================================================================
 *  Copyright          : Chamly Rathnayaka
 * ================================================================
 */
package org.techcir.parser.util.annotate;

public interface ParserCustomValueResolverSupplier<T> {
    ParserCustomValueResolver<T> supply();
}
