/*
 * ================================================================
 *  Copyright          : Chamly Rathnayaka
 * ================================================================
 */

package org.techcir.parser.util.annotate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author chamly
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ParserDefaultValue {
    String defaultValue();
}