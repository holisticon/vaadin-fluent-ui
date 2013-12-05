package org.vaadin.addons.fluentui;

import java.util.Collection;

import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Component;

public final class FluentUI {

    public static FluentComboBox comboBox() {
        return FluentComboBox.comboBox();
    }

    public static FluentComboBox comboBox(final String caption, final Collection<?> options) {
        return FluentComboBox.comboBox(caption, options);
    }

    public static FluentComboBox comboBox(final String caption, final Container dataSource) {
        return FluentComboBox.comboBox(caption, dataSource);
    }

    public static FluentComboBox comboBox(final String caption) {
        return FluentComboBox.comboBox(caption);
    }

    public static FluentFormLayout formLayout() {
        return FluentFormLayout.formLayout();
    }

    public static FluentFormLayout formLayout(final Component... components) {
        return FluentFormLayout.formLayout(components);
    }

    public static FluentGridLayout gridLayout(final int int0, final int int1, final Component... components) {
        return FluentGridLayout.gridLayout(int0, int1, components);
    }

    public static FluentGridLayout gridLayout() {
        return FluentGridLayout.gridLayout();
    }

    public static FluentGridLayout gridLayout(final int int0, final int int1) {
        return FluentGridLayout.gridLayout(int0, int1);
    }

    public static FluentHorizontalLayout horizontalLayout() {
        return FluentHorizontalLayout.horizontalLayout();
    }

    public static FluentHorizontalLayout horizontalLayout(final Component... components) {
        return FluentHorizontalLayout.horizontalLayout(components);
    }

    public static FluentLabel label() {
        return FluentLabel.label();
    }

    public static FluentLabel label(final String caption) {
        return FluentLabel.label(caption);
    }

    public static FluentLabel label(final Property<?> property0) {
        return FluentLabel.label(property0);
    }

    public static FluentLabel label(final String string0, final ContentMode contentMode1) {
        return FluentLabel.label(string0, contentMode1);
    }

    public static FluentLabel label(final Property<?> property0, final ContentMode contentMode1) {
        return FluentLabel.label(property0, contentMode1);
    }

    public static FluentOptionGroup optionGroup(final String caption) {
        return FluentOptionGroup.optionGroup(caption);
    }

    public static FluentOptionGroup optionGroup(final String string0, final Collection<?> collection1) {
        return FluentOptionGroup.optionGroup(string0, collection1);
    }

    public static FluentOptionGroup optionGroup(final String string0, final Container container1) {
        return FluentOptionGroup.optionGroup(string0, container1);
    }

    public static FluentOptionGroup optionGroup() {
        return FluentOptionGroup.optionGroup();
    }

    public static FluentPanel panel() {
        return FluentPanel.panel();
    }

    public static FluentPanel panel(final Component component0) {
        return FluentPanel.panel(component0);
    }

    public static FluentPanel panel(final String string0) {
        return FluentPanel.panel(string0);
    }

    public static FluentPanel panel(final String string0, final Component component1) {
        return FluentPanel.panel(string0, component1);
    }

    public static FluentTable table() {
        return FluentTable.table();
    }

    public static FluentTable table(final String string0) {
        return FluentTable.table(string0);
    }

    public static FluentTable table(final String string0, final Container container1) {
        return FluentTable.table(string0, container1);
    }

    public static FluentTextArea textArea(final String caption) {
        return FluentTextArea.textArea(caption);
    }

    public static FluentTextArea textArea() {
        return FluentTextArea.textArea();
    }

    public static FluentTextArea textArea(final Property<?> property0) {
        return FluentTextArea.textArea(property0);
    }

    public static FluentTextArea textArea(final String caption, final Property<?> property1) {
        return FluentTextArea.textArea(caption, property1);
    }

    public static FluentTextArea textArea(final String caption, final String content) {
        return FluentTextArea.textArea(caption, content);
    }

    public static FluentTextField textField() {
        return FluentTextField.textField();
    }

    public static FluentTextField textField(final String string0) {
        return FluentTextField.textField(string0);
    }

    public static FluentTextField textField(final Property<?> property0) {
        return FluentTextField.textField(property0);
    }

    public static FluentTextField textField(final String string0, final Property<?> property1) {
        return FluentTextField.textField(string0, property1);
    }

    public static FluentTextField textField(final String string0, final String string1) {
        return FluentTextField.textField(string0, string1);
    }

    public static FluentVerticalLayout verticalLayout() {
        return FluentVerticalLayout.verticalLayout();
    }

    public static FluentVerticalLayout verticalLayout(final Component... components) {
        return FluentVerticalLayout.verticalLayout(components);
    }

    private FluentUI() {
        // hide
    }
}
