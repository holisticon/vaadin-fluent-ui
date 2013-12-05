package org.vaadin.addons.fluentui;


// CHECKSTYLE:OFF generated class
import java.util.Locale;

import javax.annotation.Generated;

import com.vaadin.event.ShortcutListener;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:33")
public final class FluentHorizontalLayout {

    /**
     * delegate
     */
    private final HorizontalLayout horizontalLayout;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentHorizontalLayout(final HorizontalLayout horizontalLayout) {
        this.horizontalLayout = horizontalLayout;
    }

    /**
     * @return
     *         the created instance
     */
    public final HorizontalLayout get() {
        return horizontalLayout;
    }

    public static FluentHorizontalLayout horizontalLayout() {
        return new FluentHorizontalLayout(new HorizontalLayout());
    }

    public static FluentHorizontalLayout horizontalLayout(final Component... components) {
        return new FluentHorizontalLayout(new HorizontalLayout(components));
    }

    public FluentHorizontalLayout width(final String width) {
        horizontalLayout.setWidth(width);
        return this;
    }

    public FluentHorizontalLayout enabled(final boolean enabled) {
        horizontalLayout.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentHorizontalLayout enabled() {
        return this.enabled(true);
    }

    public FluentHorizontalLayout margin(final boolean margin) {
        horizontalLayout.setMargin(margin);
        return this;
    }

    /**
     * @return
     *         #margin(true)
     */
    public FluentHorizontalLayout margin() {
        return this.margin(true);
    }

    public FluentHorizontalLayout margin(final MarginInfo margin) {
        horizontalLayout.setMargin(margin);
        return this;
    }

    public FluentHorizontalLayout errorHandler(final ErrorHandler errorHandler) {
        horizontalLayout.setErrorHandler(errorHandler);
        return this;
    }

    public FluentHorizontalLayout data(final Object data) {
        horizontalLayout.setData(data);
        return this;
    }

    public FluentHorizontalLayout componentError(final ErrorMessage componentError) {
        horizontalLayout.setComponentError(componentError);
        return this;
    }

    public FluentHorizontalLayout addComponent(final Component... components) {
        for (final Component component : components) {
            horizontalLayout.addComponent(component);
        }
        return this;
    }

    public FluentHorizontalLayout primaryStyleName(final String primaryStyleName) {
        horizontalLayout.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentHorizontalLayout addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            horizontalLayout.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentHorizontalLayout icon(final Resource icon) {
        horizontalLayout.setIcon(icon);
        return this;
    }

    public FluentHorizontalLayout height(final String height) {
        horizontalLayout.setHeight(height);
        return this;
    }

    public FluentHorizontalLayout addListener(final Component.Listener... listeners) {
        for (final Component.Listener listener : listeners) {
            horizontalLayout.addListener(listener);
        }
        return this;
    }

    public FluentHorizontalLayout locale(final Locale locale) {
        horizontalLayout.setLocale(locale);
        return this;
    }

    public FluentHorizontalLayout addComponentAttachListener(final com.vaadin.ui.HasComponents.ComponentAttachListener... componentAttachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentAttachListener componentAttachListener : componentAttachListeners) {
            horizontalLayout.addComponentAttachListener(componentAttachListener);
        }
        return this;
    }

    public FluentHorizontalLayout addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            horizontalLayout.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentHorizontalLayout description(final String description) {
        horizontalLayout.setDescription(description);
        return this;
    }

    public FluentHorizontalLayout spacing(final boolean spacing) {
        horizontalLayout.setSpacing(spacing);
        return this;
    }

    /**
     * @return
     *         #spacing(true)
     */
    public FluentHorizontalLayout spacing() {
        return this.spacing(true);
    }

    public FluentHorizontalLayout visible(final boolean visible) {
        horizontalLayout.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentHorizontalLayout visible() {
        return this.visible(true);
    }

    public FluentHorizontalLayout addComponentDetachListener(final com.vaadin.ui.HasComponents.ComponentDetachListener... componentDetachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentDetachListener componentDetachListener : componentDetachListeners) {
            horizontalLayout.addComponentDetachListener(componentDetachListener);
        }
        return this;
    }

    public FluentHorizontalLayout addComponentAsFirst(final Component... componentAsFirsts) {
        for (final Component componentAsFirst : componentAsFirsts) {
            horizontalLayout.addComponentAsFirst(componentAsFirst);
        }
        return this;
    }

    public FluentHorizontalLayout addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            horizontalLayout.addStyleName(styleName);
        }
        return this;
    }

    public FluentHorizontalLayout addComponents(final Component[]... componentss) {
        for (final Component[] components : componentss) {
            horizontalLayout.addComponents(components);
        }
        return this;
    }

    public FluentHorizontalLayout immediate(final boolean immediate) {
        horizontalLayout.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentHorizontalLayout immediate() {
        return this.immediate(true);
    }

    public FluentHorizontalLayout readOnly(final boolean readOnly) {
        horizontalLayout.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentHorizontalLayout readOnly() {
        return this.readOnly(true);
    }

    public FluentHorizontalLayout addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            horizontalLayout.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentHorizontalLayout caption(final String caption) {
        horizontalLayout.setCaption(caption);
        return this;
    }

    public FluentHorizontalLayout addLayoutClickListener(final com.vaadin.event.LayoutEvents.LayoutClickListener... layoutClickListeners) {
        for (final com.vaadin.event.LayoutEvents.LayoutClickListener layoutClickListener : layoutClickListeners) {
            horizontalLayout.addLayoutClickListener(layoutClickListener);
        }
        return this;
    }

    public FluentHorizontalLayout styleName(final String styleName) {
        horizontalLayout.setStyleName(styleName);
        return this;
    }

}
