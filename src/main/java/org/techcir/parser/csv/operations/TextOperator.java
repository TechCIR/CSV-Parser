/**
 * 
 */
package org.techcir.parser.csv.operations;

import java.util.List;

import org.techcir.parser.csv.parser.TextBaseOperator;

/**
 * @author Uditha M. Perera Mar 11, 2014
 * 
 */
public class TextOperator extends TextBaseOperator {

	public <T extends Object> byte[] entityListToText(List<String> fieldList,
			List<T> entityList, String fileHeader, String fileFooter,
			boolean enablePropertyNames) throws Exception {
		return exportFile(fieldList, entityList, fileHeader, fileFooter,
				enablePropertyNames);
	}
}
