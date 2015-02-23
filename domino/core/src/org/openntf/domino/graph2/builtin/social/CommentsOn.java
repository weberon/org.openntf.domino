package org.openntf.domino.graph2.builtin.social;

import org.openntf.domino.graph2.builtin.DEdgeFrame;

import com.tinkerpop.frames.InVertex;
import com.tinkerpop.frames.OutVertex;

public interface CommentsOn extends DEdgeFrame {
	public static final String LABEL = "commentsOn";

	@OutVertex
	public Commenter getCommenter();

	@InVertex
	public Comment getComment();

}
