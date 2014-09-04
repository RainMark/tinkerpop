package com.tinkerpop.gremlin.process.graph.step.map;

import com.tinkerpop.gremlin.process.Traversal;
import com.tinkerpop.gremlin.process.util.TraversalHelper;
import com.tinkerpop.gremlin.structure.Element;

import java.util.Arrays;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class ValuesStep<E> extends FlatMapStep<Element, E> {

    public String[] propertyKeys;

    public ValuesStep(final Traversal traversal, final String... propertyKeys) {
        super(traversal);
        this.propertyKeys = propertyKeys;
        this.setFunction(traverser -> traverser.get().values(propertyKeys));
    }

    public String toString() {
        return TraversalHelper.makeStepString(this, Arrays.asList(this.propertyKeys));
    }
}
