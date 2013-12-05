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
import com.vaadin.ui.VerticalLayout;

@Generated(value = "de.holisticon.toolbox.fluent.generator.FluentApiGenerator", date = "09.07.2013 13:44:33")
public final class FluentVerticalLayout {

    /**
     * delegate
     */
    private final VerticalLayout verticalLayout;

    /**
     * Hide constructor, use static factory methods.
     */
    private FluentVerticalLayout(final VerticalLayout verticalLayout) {
        this.verticalLayout = verticalLayout;
    }

    /**
     * @return
     *         the created instance
     */
    public final VerticalLayout get() {
        return verticalLayout;
    }

    public static FluentVerticalLayout verticalLayout() {
        return new FluentVerticalLayout(new VerticalLayout());
    }

    public static FluentVerticalLayout verticalLayout(final Component... components) {
        return new FluentVerticalLayout(new VerticalLayout(components));
    }

    public FluentVerticalLayout width(final String width) {
        verticalLayout.setWidth(width);
        return this;
    }

    public FluentVerticalLayout enabled(final boolean enabled) {
        verticalLayout.setEnabled(enabled);
        return this;
    }

    /**
     * @return
     *         #enabled(true)
     */
    public FluentVerticalLayout enabled() {
        return this.enabled(true);
    }

    public FluentVerticalLayout margin(final boolean margin) {
        verticalLayout.setMargin(margin);
        return this;
    }

    /**
     * @return
     *         #margin(true)
     */
    public FluentVerticalLayout margin() {
        return this.margin(true);
    }

    public FluentVerticalLayout margin(final MarginInfo margin) {
        verticalLayout.setMargin(margin);
        return this;
    }

    public FluentVerticalLayout errorHandler(final ErrorHandler errorHandler) {
        verticalLayout.setErrorHandler(errorHandler);
        return this;
    }

    public FluentVerticalLayout data(final Object data) {
        verticalLayout.setData(data);
        return this;
    }

    public FluentVerticalLayout componentError(final ErrorMessage componentError) {
        verticalLayout.setComponentError(componentError);
        return this;
    }

    public FluentVerticalLayout addComponent(final Component... components) {
        for (final Component component : components) {
            verticalLayout.addComponent(component);
        }
        return this;
    }

    public FluentVerticalLayout primaryStyleName(final String primaryStyleName) {
        verticalLayout.setPrimaryStyleName(primaryStyleName);
        return this;
    }

    public FluentVerticalLayout addShortcutListener(final ShortcutListener... shortcutListeners) {
        for (final ShortcutListener shortcutListener : shortcutListeners) {
            verticalLayout.addShortcutListener(shortcutListener);
        }
        return this;
    }

    public FluentVerticalLayout icon(final Resource icon) {
        verticalLayout.setIcon(icon);
        return this;
    }

    public FluentVerticalLayout height(final String height) {
        verticalLayout.setHeight(height);
        return this;
    }

    public FluentVerticalLayout addListener(final Component.Listener... listeners) {
        for (final Component.Listener listener : listeners) {
            verticalLayout.addListener(listener);
        }
        return this;
    }

    public FluentVerticalLayout locale(final Locale locale) {
        verticalLayout.setLocale(locale);
        return this;
    }

    public FluentVerticalLayout addComponentAttachListener(final com.vaadin.ui.HasComponents.ComponentAttachListener... componentAttachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentAttachListener componentAttachListener : componentAttachListeners) {
            verticalLayout.addComponentAttachListener(componentAttachListener);
        }
        return this;
    }

    public FluentVerticalLayout addAttachListener(final com.vaadin.server.ClientConnector.AttachListener... attachListeners) {
        for (final com.vaadin.server.ClientConnector.AttachListener attachListener : attachListeners) {
            verticalLayout.addAttachListener(attachListener);
        }
        return this;
    }

    public FluentVerticalLayout description(final String description) {
        verticalLayout.setDescription(description);
        return this;
    }

    public FluentVerticalLayout spacing(final boolean spacing) {
        verticalLayout.setSpacing(spacing);
        return this;
    }

    /**
     * @return
     *         #spacing(true)
     */
    public FluentVerticalLayout spacing() {
        return this.spacing(true);
    }

    public FluentVerticalLayout visible(final boolean visible) {
        verticalLayout.setVisible(visible);
        return this;
    }

    /**
     * @return
     *         #visible(true)
     */
    public FluentVerticalLayout visible() {
        return this.visible(true);
    }

    public FluentVerticalLayout addComponentDetachListener(final com.vaadin.ui.HasComponents.ComponentDetachListener... componentDetachListeners) {
        for (final com.vaadin.ui.HasComponents.ComponentDetachListener componentDetachListener : componentDetachListeners) {
            verticalLayout.addComponentDetachListener(componentDetachListener);
        }
        return this;
    }

    public FluentVerticalLayout addComponentAsFirst(final Component... componentAsFirsts) {
        for (final Component componentAsFirst : componentAsFirsts) {
            verticalLayout.addComponentAsFirst(componentAsFirst);
        }
        return this;
    }

    public FluentVerticalLayout addStyleName(final String... styleNames) {
        for (final String styleName : styleNames) {
            verticalLayout.addStyleName(styleName);
        }
        return this;
    }

    public FluentVerticalLayout addComponents(final Component[]... componentss) {
        for (final Component[] components : componentss) {
            verticalLayout.addComponents(components);
        }
        return this;
    }

    public FluentVerticalLayout immediate(final boolean immediate) {
        verticalLayout.setImmediate(immediate);
        return this;
    }

    /**
     * @return
     *         #immediate(true)
     */
    public FluentVerticalLayout immediate() {
        return this.immediate(true);
    }

    public FluentVerticalLayout readOnly(final boolean readOnly) {
        verticalLayout.setReadOnly(readOnly);
        return this;
    }

    /**
     * @return
     *         #readOnly(true)
     */
    public FluentVerticalLayout readOnly() {
        return this.readOnly(true);
    }

    public FluentVerticalLayout addDetachListener(final com.vaadin.server.ClientConnector.DetachListener... detachListeners) {
        for (final com.vaadin.server.ClientConnector.DetachListener detachListener : detachListeners) {
            verticalLayout.addDetachListener(detachListener);
        }
        return this;
    }

    public FluentVerticalLayout caption(final String caption) {
        verticalLayout.setCaption(caption);
        return this;
    }

    public FluentVerticalLayout addLayoutClickListener(final com.vaadin.event.LayoutEvents.LayoutClickListener... layoutClickListeners) {
        for (final com.vaadin.event.LayoutEvents.LayoutClickListener layoutClickListener : layoutClickListeners) {
            verticalLayout.addLayoutClickListener(layoutClickListener);
        }
        return this;
    }

    public FluentVerticalLayout styleName(final String styleName) {
        verticalLayout.setStyleName(styleName);
        return this;
    }

}
