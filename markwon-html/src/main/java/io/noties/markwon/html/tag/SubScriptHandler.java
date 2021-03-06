package io.noties.markwon.html.tag;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Collections;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.span.SubScriptSpan;

public class SubScriptHandler extends SimpleTagHandler {
    @Nullable
    @Override
    public Object getSpans(@NonNull MarkwonConfiguration configuration, @NonNull RenderProps renderProps, @NonNull HtmlTag tag) {
        return new SubScriptSpan();
    }

    @NonNull
    @Override
    public Collection<String> supportedTags() {
        return Collections.singleton("sub");
    }
}
