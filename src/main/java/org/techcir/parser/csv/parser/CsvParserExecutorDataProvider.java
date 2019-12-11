/*
 * ================================================================
 *  Copyright          : Chamly Rathnayaka
 * ================================================================
 */
package org.techcir.parser.csv.parser;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.techcir.parser.csv.operations.CSVSupportable;
import org.techcir.parser.csv.vo.CsvVO;

/**
 *@author chamly
 */
public interface CsvParserExecutorDataProvider<T extends CSVSupportable> {

    Class<T> getParserClass();
    CsvVO getCsvVo();
    Map<Integer, String> getHeaderMap();
    List<Field> getFields();
}
