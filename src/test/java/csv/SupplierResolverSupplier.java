package csv;

import org.techcir.parser.util.annotate.ParserCustomValueResolver;
import org.techcir.parser.util.annotate.ParserCustomValueResolverSupplier;

public class SupplierResolverSupplier implements ParserCustomValueResolverSupplier<Supplier> {

    @Override
    public ParserCustomValueResolver<Supplier> supply() {
        return SupplierResolver.getINSTANCE();
    }
}
