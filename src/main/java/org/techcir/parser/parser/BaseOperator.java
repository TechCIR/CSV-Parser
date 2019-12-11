/*
 * ================================================================
 *  Copyright          : Chamly Rathnayaka
 * ================================================================
 */
package org.techcir.parser.parser;

import org.techcir.parser.util.vo.ParserVO;

/**
 *
 * @author chamly
 */
public class BaseOperator {

    private ParserVO parserVO;
    
    public BaseOperator(ParserVO parserVO) {
        this.parserVO = parserVO;
    }

    protected ParserVO getParserVO() {
        return parserVO;
    }

    public void addCacheValue(String property, Object value) {
        parserVO.addCacheValue(property, value);
    }
    
}